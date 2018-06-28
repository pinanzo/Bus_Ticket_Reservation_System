/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.bus.ticket.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author samiu
 */

public class PlaceDateSelection extends javax.swing.JFrame {
    String ACTIME[]={"10:00","18:00"};
    String NONACTIME[]={"08:00","12:00","16:00","20:00"};
    Database db;
    String userName = "pinanzo";
    String coachNo = "DHRJ0800NONAC";
    int ticketPrice;
    /**
     * Creates new form PlaceDateSelection
     */
    public PlaceDateSelection() {
        initComponents();
        setLocationRelativeTo(null);
        setComponent();
    }
    public PlaceDateSelection(String userName) {
        initComponents();
        setLocationRelativeTo(null);
        this.userName = userName;
        setComponent();
    }
    
    public void setComponent(){
        setTitle("OBTRS");
        db = new Database();
        setDates();
        setDeparturePlace();
        setDestinationPlace();
        setAC_NONAC();
        setTime();
        nameOfUser.setText("Welcome "+userName);
        setPrice();
        //jComboBox1.setEnabled(false);
        /*
        
        
        if(String.valueOf(jComboBox1.getSelectedItem()).equals(String.valueOf(jComboBox5.getSelectedItem()))){
            jButton1.setEnabled(false);
            Price.setText("--- Tk.");
        }else{
            setPrice();
        }*/
    }
    
    public void setDeparturePlace(){
        ResultSet rs = db.executeQuery("SELECT DISTINCT departurePlace FROM CoachInfo");
        int i=0;
        System.out.println("departurePlace executed");
        try{
            while(rs.next()){
                System.out.println(rs.getString("departurePlace"));
                i++;
            }
            String departurePlaceList[] = new String[i];
            rs = db.executeQuery("SELECT DISTINCT departurePlace FROM CoachInfo");
            i = 0;
            while(rs.next()){
                departurePlaceList[i++] = rs.getString("departurePlace");
            }
            jComboBox1.setModel(new DefaultComboBoxModel(departurePlaceList));
        }catch(Exception e){
            System.out.println("Exception while setting departure combo box");
        }
        db.disconnectDB();
    }
    
    public void setDestinationPlace(){
        System.out.println("SELECT DISTINCT destinationPlace FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
        ResultSet rs = db.executeQuery("SELECT DISTINCT destinationPlace FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
        int i=0;
        try{
            while(rs.next()){
                System.out.println(rs.getString("destinationPlace"));
                i++;
            }
            String destinationPlaceList[] = new String[i];
            rs = db.executeQuery("SELECT DISTINCT destinationPlace FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
            i = 0;
            while(rs.next()){
                destinationPlaceList[i++] = rs.getString("destinationPlace");
            }
            jComboBox5.setModel(new DefaultComboBoxModel(destinationPlaceList));
        }catch(Exception e){
            System.out.println("Exception while setting destination combo box");
        }
        db.disconnectDB();
    }
    
    
    public void setPrice(){
        setTime();
        if(!String.valueOf(jComboBox1.getSelectedItem()).equals(String.valueOf(jComboBox5.getSelectedItem()))){
            try {
                ResultSet rs = db.executeQuery("SELECT * FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem()+"' AND destinationPlace = '"+
                                                String.valueOf(jComboBox5.getSelectedItem())+"' AND departureTime = '"+String.valueOf(jComboBox2.getSelectedItem())+
                                                "' AND acNonAc = '"+String.valueOf(jComboBox4.getSelectedItem())+"'"));
                rs.next();
                ticketPrice = Integer.parseInt(rs.getString("ticketPrice").trim());
                Price.setText(rs.getString("ticketPrice") + " Tk.");
                coachNo = rs.getString("coachNo");
                System.out.println(coachNo);
                db.disconnectDB();
            } catch (SQLException ex) {
                Logger.getLogger(PlaceDateSelection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
        }
    }
    
    
    public void setDates(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        //System.out.println(currentDate); 
        String sevenDates[] = new String[7];
        for(int i=0; i<7; i++){
            try {
                String dt = dateFormat.format(cal.getTime()).toString();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();
                c.setTime(sdf.parse(dt));
                c.add(Calendar.DATE, i);  // number of days to add
                dt = sdf.format(c.getTime());  // dt is now the new date
                //System.out.println(dt);
                sevenDates[i] = dt;
            } catch (ParseException ex) {
                Logger.getLogger(PlaceDateSelection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        Dates.setModel(new DefaultComboBoxModel(sevenDates));
    }
    
    public void setTime(){
        String t[] = {"--:--"};
        jComboBox2.setModel(new DefaultComboBoxModel(t));
        if(!String.valueOf(jComboBox1.getSelectedItem()).equals(String.valueOf(jComboBox5.getSelectedItem()))){
            ResultSet rs = db.executeQuery("SELECT DISTINCT departureTime FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"' AND destinationPlace = '"+
                                            String.valueOf(jComboBox5.getSelectedItem())+"' AND acNonAc = '"+String.valueOf(jComboBox4.getSelectedItem())+"' ORDER BY departureTime ASC");
            int i=0;
            try{
                while(rs.next()){
                    System.out.println(rs.getString("departureTime"));
                    i++;
                }
                String timeList[] = new String[i];
                rs = db.executeQuery("SELECT DISTINCT departureTime FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"' AND destinationPlace = '"+
                                            String.valueOf(jComboBox5.getSelectedItem())+"' AND acNonAc = '"+String.valueOf(jComboBox4.getSelectedItem())+"' ORDER BY departureTime ASC");
                i = 0;
                while(rs.next()){
                    timeList[i++] = rs.getString("departureTime");
                }
                jComboBox2.setModel(new DefaultComboBoxModel(timeList));
            }catch(Exception e){
                System.out.println("Exception while setting time combo box");
            }
        }else{
            Price.setText("--- Tk.");
        }
        db.disconnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nameOfUser = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Dates = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Select Journey Date:");

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Destination:");

        jLabel1.setText("Departure:");

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Departure Time: ");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Ticket Price(PerSeat):");

        jLabel3.setText("AC/Non AC:");

        Price.setForeground(new java.awt.Color(255, 0, 0));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NONAC" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("See All Coach Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Seat Booking");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "SYLHET", "CHITTAGONG", "RAJSHAHI" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel5.setText("To");

        nameOfUser.setForeground(new java.awt.Color(0, 0, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "SYLHET", "CHITTAGONG", "RAJSHAHI" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Dates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Dates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatesActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6.30   AM", "7.30   AM", "8.30   AM", "9.30   AM", "10.30 AM", "11.30 AM", "12.30 PM", "2.00   PM", "3.00   PM", "4.00   PM", "5.00   PM", "6.00   PM", "7.00   PM", "8.00   PM", "9.00   PM", "10.00 PM" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameOfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel1)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dates, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(nameOfUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SeatModule newFrame = new SeatModule(coachNo, String.valueOf(Dates.getSelectedItem()), String.valueOf(jComboBox1.getSelectedItem()),String.valueOf(jComboBox5.getSelectedItem()) , String.valueOf(jComboBox4.getSelectedItem()), String.valueOf(jComboBox2.getSelectedItem()), userName, ticketPrice);
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LogInFrame newFrame = new LogInFrame();
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    void setAC_NONAC(){
        
        ResultSet rs = db.executeQuery("SELECT DISTINCT acNonAc FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"' AND destinationPlace = '"+String.valueOf(jComboBox5.getSelectedItem())+"'");
        int i=0;
        try{
            while(rs.next()){
                System.out.println(rs.getString("acNonAc"));
                i++;
            }
            String destinationPlaceList[] = new String[i];
            rs = db.executeQuery("SELECT DISTINCT acNonAc FROM CoachInfo WHERE departurePlace = '"+String.valueOf(jComboBox1.getSelectedItem())+"' AND destinationPlace = '"+String.valueOf(jComboBox5.getSelectedItem())+"'");
            i = 0;
            while(rs.next()){
                destinationPlaceList[i++] = rs.getString("acNonAc");
            }
            jComboBox4.setModel(new DefaultComboBoxModel(destinationPlaceList));
        }catch(Exception e){
            System.out.println("Exception while setting acNonAc combo box");
        }
        db.disconnectDB();
            
        
        
    }
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        setTime();
        setPrice();
        /*if(String.valueOf(jComboBox1.getSelectedItem()).equals(String.valueOf(jComboBox5.getSelectedItem())))Price.setText("--- Tk.");
        else setPrice();
        */
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CoachInfo newFrame = new CoachInfo(userName);
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        setAC_NONAC();
        setTime();
        setPrice();
        /*if(String.valueOf(jComboBox1.getSelectedItem()).equals(String.valueOf(jComboBox5.getSelectedItem()))){
            jButton1.setEnabled(false);
            setTime();
        }
        else {
            setPrice();
            jButton1.setEnabled(true);
        }*/

    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        setDestinationPlace();
        setAC_NONAC();
        setTime();
        setPrice();
        /*if(jComboBox1.getSelectedIndex()==jComboBox5.getSelectedIndex())jButton1.setEnabled(false);
        else {
            setDestinationPlace();
            setPrice();
            jButton1.setEnabled(true);
        }*/
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void DatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatesActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        setPrice();
        /*if(jComboBox1.getSelectedIndex()==jComboBox5.getSelectedIndex())Price.setText("--- Tk.");
        else setPrice();
        */
    }//GEN-LAST:event_jComboBox2ActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceDateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceDateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceDateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceDateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceDateSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dates;
    private javax.swing.JLabel Price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nameOfUser;
    // End of variables declaration//GEN-END:variables
}
