/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.bus.ticket.reservation.system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author samiu
 */
public class Database {
    Connection connection = null;
    public Statement connectDB(){
        Statement statement = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=OBTRS;user=obtrs;password=123456;";          
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connected database successfully...");
            statement=(Statement) connection.createStatement();    
        } catch(SQLException se){
            System.out.println(se.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statement;
          
    }
    void disconnectDB(){
        try{
            if (connection != null){
                connection.close();
                connection = null;
                System.out.println("Disconnected");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }
    boolean execute(String query){
        Statement st = connectDB();
        try {
            st.execute("USE OBTRS "+query);
            System.out.println("Query worked :D");
            disconnectDB();
            return true;
        } catch (SQLException ex) {
            System.out.println(query);
            System.out.println("Query not worked");
        }
        disconnectDB();
        return false;
    }
    ResultSet executeQuery(String query){
        Statement st = connectDB();
        System.out.println(query);
        ResultSet rs = null;
        try {
            rs = st.executeQuery("USE OBTRS "+query);
            System.out.println("Query worked :D");
        } catch (SQLException ex) {
            System.out.println("Query not worked");
            System.out.println(query);
        }
        //disconnectDB();
        
        return rs;
    }
    
    
}
