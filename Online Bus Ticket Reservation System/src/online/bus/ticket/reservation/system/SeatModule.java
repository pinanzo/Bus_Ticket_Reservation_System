/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.bus.ticket.reservation.system;

import java.awt.Color;
import static java.awt.SystemColor.control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SeatModule extends javax.swing.JFrame {

    /**
     * Creates new form SeatModule
     */
    int ticketPrice;
    String bookingNo, coachNo, journeyDate, departurePlace, destinationPlace, acNonAc, departureTime, userName;
    JButton Buttons[] = new JButton[60];
    ArrayList<Integer>SelectedSeats = new ArrayList<Integer>();
    Database db;
    void addButton(){
        try{
            Buttons[1] = (st1);
            Buttons[2] = (st2);
            Buttons[3] = (st3);
            Buttons[4] = (st4);
            Buttons[5] = (st5);
            Buttons[6] = (st6);
            Buttons[7] = (st7);
            Buttons[8] = (st8);
            Buttons[9] = (st9);
            Buttons[10] = (st10);
            Buttons[11] = (st11);
            Buttons[12] = (st12);
            Buttons[13] = (st13);
            Buttons[14] = (st14);
            Buttons[15] = (st15);
            Buttons[16] = (st16);
            Buttons[17] = (st17);
            Buttons[18] = (st18);
            Buttons[19] = (st19);
            Buttons[20] = (st20);
            Buttons[21] = (st21);
            Buttons[22] = (st22);
            Buttons[23] = (st23);
            Buttons[24] = (st24);
            Buttons[25] = (st25);
            Buttons[26] = (st26);
            Buttons[27] = (st27);
            Buttons[28] = (st28);
            Buttons[29] = (st29);
            Buttons[30] = (st30);
            Buttons[31] = (st31);
            Buttons[32] = (st32);
            Buttons[33] = (st33);
            Buttons[34] = (st34);
            Buttons[35] = (st35);
            Buttons[36] = (st36);
            Buttons[37] = (st37);
            Buttons[38] = (st38);
            Buttons[39] = (st39);
            Buttons[40] = (st40);
            Buttons[41] = (st41);
            Buttons[42] = (st42);
            Buttons[43] = (st43);
            Buttons[44] = (st44);
            Buttons[45] = (st45);
            Buttons[46] = (st46);
            Buttons[47] = (st47);
            Buttons[48] = (st48);
            Buttons[49] = (st49);
            Buttons[50] = (st50);
            Buttons[51] = (st51);
            Buttons[52] = (st52);   
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public SeatModule() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public SeatModule(String coachNo, String journeyDate, String departurePlace, String destinationPlace, String acNonAc, String departureTime, String userName, int ticketPrice) {
        initComponents();
        setLocationRelativeTo(null);
        addButton();
        setComponent(coachNo, journeyDate, departurePlace, destinationPlace, acNonAc, departureTime, userName, ticketPrice);
        
        
    }
    public void setComponent(String coachNo, String journeyDate, String departurePlace, String destinationPlace, String acNonAc, String departureTime, String userName, int ticketPrice){
        db = new Database();
        this.coachNo = coachNo;
        this.journeyDate = journeyDate;
        this.departurePlace = departurePlace;
        this.destinationPlace = destinationPlace;
        this.acNonAc = acNonAc;
        this.departureTime = departureTime;
        this.userName = userName;
        this.ticketPrice = ticketPrice;
        jLabel4.setText("Coach No: "+this.coachNo);
        try{
            ResultSet rs = db.executeQuery("SELECT seatNo FROM BookingHistory JOIN BookingSeatHistory ON BookingHistory.bookingNo = BookingSeatHistory.bookingNo WHERE BookingHistory.coachNo = '"+coachNo+"' AND BookingHistory.journeyDate = '"+journeyDate+"' AND BookingHistory.departurePlace = '"+departurePlace+"' AND BookingHistory.destinationPlace = '"+destinationPlace+"' AND BookingHistory.acNonAc = '"+acNonAc+"' AND BookingHistory.departureTime = '"+departureTime+"'");
            while(rs.next()){
                int i = Integer.parseInt(rs.getString("seatNo"));
                Buttons[i].setBackground(Color.RED);
            }
            for(int i=1; i<=52; i++){
                if(!(Buttons[i].getBackground().equals(Color.RED))){
                    Buttons[i].setBackground(Color.GREEN);
                }
            }
        }catch(Exception e){
            System.out.println("SELECT seatNo FROM BookingHistory JOIN BookingSeatHistory ON BookingHistory.bookingNo = BookingSeatHistory.bookingNo WHERE BookingHistory.coachNo = '"+coachNo+"' AND BookingHistory.journeyDate = '"+journeyDate+"' AND BookingHistory.departurePlace = '"+departurePlace+"' AND BookingHistory.destinationPlace = '"+destinationPlace+"' AND BookingHistory.acNonAc = '"+acNonAc+"' AND BookingHistory.departureTime = '"+departureTime+"'");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        st1 = new javax.swing.JButton();
        st4 = new javax.swing.JButton();
        st8 = new javax.swing.JButton();
        st5 = new javax.swing.JButton();
        st9 = new javax.swing.JButton();
        st12 = new javax.swing.JButton();
        st13 = new javax.swing.JButton();
        st16 = new javax.swing.JButton();
        st17 = new javax.swing.JButton();
        st20 = new javax.swing.JButton();
        st21 = new javax.swing.JButton();
        st24 = new javax.swing.JButton();
        st25 = new javax.swing.JButton();
        st28 = new javax.swing.JButton();
        st29 = new javax.swing.JButton();
        st32 = new javax.swing.JButton();
        st36 = new javax.swing.JButton();
        st40 = new javax.swing.JButton();
        st44 = new javax.swing.JButton();
        st33 = new javax.swing.JButton();
        st37 = new javax.swing.JButton();
        st48 = new javax.swing.JButton();
        st41 = new javax.swing.JButton();
        st45 = new javax.swing.JButton();
        st49 = new javax.swing.JButton();
        st50 = new javax.swing.JButton();
        st51 = new javax.swing.JButton();
        st46 = new javax.swing.JButton();
        st52 = new javax.swing.JButton();
        st47 = new javax.swing.JButton();
        st42 = new javax.swing.JButton();
        st43 = new javax.swing.JButton();
        st38 = new javax.swing.JButton();
        st39 = new javax.swing.JButton();
        st34 = new javax.swing.JButton();
        st35 = new javax.swing.JButton();
        st30 = new javax.swing.JButton();
        st31 = new javax.swing.JButton();
        st26 = new javax.swing.JButton();
        st27 = new javax.swing.JButton();
        st22 = new javax.swing.JButton();
        st23 = new javax.swing.JButton();
        st18 = new javax.swing.JButton();
        st19 = new javax.swing.JButton();
        st14 = new javax.swing.JButton();
        st15 = new javax.swing.JButton();
        st10 = new javax.swing.JButton();
        st11 = new javax.swing.JButton();
        st6 = new javax.swing.JButton();
        st7 = new javax.swing.JButton();
        st2 = new javax.swing.JButton();
        st3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        st1.setText("1");
        st1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st1ActionPerformed(evt);
            }
        });

        st4.setText("4");
        st4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st4ActionPerformed(evt);
            }
        });

        st8.setText("8");
        st8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st8ActionPerformed(evt);
            }
        });

        st5.setText("5");
        st5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st5ActionPerformed(evt);
            }
        });

        st9.setText("9");
        st9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st9ActionPerformed(evt);
            }
        });

        st12.setText("12");
        st12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st12ActionPerformed(evt);
            }
        });

        st13.setText("13");
        st13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st13ActionPerformed(evt);
            }
        });

        st16.setText("16");
        st16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st16ActionPerformed(evt);
            }
        });

        st17.setText("17");
        st17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st17ActionPerformed(evt);
            }
        });

        st20.setText("20");
        st20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st20ActionPerformed(evt);
            }
        });

        st21.setText("21");
        st21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st21ActionPerformed(evt);
            }
        });

        st24.setText("24");
        st24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st24ActionPerformed(evt);
            }
        });

        st25.setText("25");
        st25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st25ActionPerformed(evt);
            }
        });

        st28.setText("28");
        st28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st28ActionPerformed(evt);
            }
        });

        st29.setText("29");
        st29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st29ActionPerformed(evt);
            }
        });

        st32.setText("32");
        st32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st32ActionPerformed(evt);
            }
        });

        st36.setText("36");
        st36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st36ActionPerformed(evt);
            }
        });

        st40.setText("40");
        st40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st40ActionPerformed(evt);
            }
        });

        st44.setText("44");
        st44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st44ActionPerformed(evt);
            }
        });

        st33.setText("33");
        st33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st33ActionPerformed(evt);
            }
        });

        st37.setText("37");
        st37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st37ActionPerformed(evt);
            }
        });

        st48.setText("48");
        st48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st48ActionPerformed(evt);
            }
        });

        st41.setText("41");
        st41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st41ActionPerformed(evt);
            }
        });

        st45.setText("45");
        st45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st45ActionPerformed(evt);
            }
        });

        st49.setText("49");
        st49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st49ActionPerformed(evt);
            }
        });

        st50.setText("50");
        st50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st50ActionPerformed(evt);
            }
        });

        st51.setText("51");
        st51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st51ActionPerformed(evt);
            }
        });

        st46.setText("46");
        st46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st46ActionPerformed(evt);
            }
        });

        st52.setText("52");
        st52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st52ActionPerformed(evt);
            }
        });

        st47.setText("47");
        st47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st47ActionPerformed(evt);
            }
        });

        st42.setText("42");
        st42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st42ActionPerformed(evt);
            }
        });

        st43.setText("43");
        st43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st43ActionPerformed(evt);
            }
        });

        st38.setText("38");
        st38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st38ActionPerformed(evt);
            }
        });

        st39.setText("39");
        st39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st39ActionPerformed(evt);
            }
        });

        st34.setText("34");
        st34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st34ActionPerformed(evt);
            }
        });

        st35.setText("35");
        st35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st35ActionPerformed(evt);
            }
        });

        st30.setText("30");
        st30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st30ActionPerformed(evt);
            }
        });

        st31.setText("31");
        st31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st31ActionPerformed(evt);
            }
        });

        st26.setText("26");
        st26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st26ActionPerformed(evt);
            }
        });

        st27.setText("27");
        st27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st27ActionPerformed(evt);
            }
        });

        st22.setText("22");
        st22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st22ActionPerformed(evt);
            }
        });

        st23.setText("23");
        st23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st23ActionPerformed(evt);
            }
        });

        st18.setText("18");
        st18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st18ActionPerformed(evt);
            }
        });

        st19.setText("19");
        st19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st19ActionPerformed(evt);
            }
        });

        st14.setText("14");
        st14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st14ActionPerformed(evt);
            }
        });

        st15.setText("15");
        st15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st15ActionPerformed(evt);
            }
        });

        st10.setText("10");
        st10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st10ActionPerformed(evt);
            }
        });

        st11.setText("11");
        st11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st11ActionPerformed(evt);
            }
        });

        st6.setText("6");
        st6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st6ActionPerformed(evt);
            }
        });

        st7.setText("7");
        st7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st7ActionPerformed(evt);
            }
        });

        st2.setText("2");
        st2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st2ActionPerformed(evt);
            }
        });

        st3.setText("3");
        st3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st3ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText(" Not Reserved");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("    Reserved");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText(" Entry");

        jTextField3.setEditable(false);
        jTextField3.setText("  Driver");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton18.setText("Confirm");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Select a not reserved seat & Confirm ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seat Module");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Coach No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(st16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(st13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st50))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st45))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st41))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st37))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st29))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st25))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(st20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(st21)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(st22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(st7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(st51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(st52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(st27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void st4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st4ActionPerformed
        int i=4;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st4ActionPerformed

    private void st8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st8ActionPerformed
        int i=8;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st8ActionPerformed

    private void st5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st5ActionPerformed
        int i=5;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st5ActionPerformed

    private void st9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st9ActionPerformed
        int i=9;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st9ActionPerformed

    private void st12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st12ActionPerformed
        int i=12;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st12ActionPerformed

    private void st13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st13ActionPerformed
        int i=13;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st13ActionPerformed

    private void st16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st16ActionPerformed
        int i=16;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st16ActionPerformed

    private void st17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st17ActionPerformed
        int i=17;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st17ActionPerformed

    private void st20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st20ActionPerformed
        int i=20;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st20ActionPerformed

    private void st21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st21ActionPerformed
        int i=21;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st21ActionPerformed

    private void st24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st24ActionPerformed
        int i=24;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st24ActionPerformed

    private void st25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st25ActionPerformed
        int i=25;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st25ActionPerformed

    private void st28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st28ActionPerformed
        int i=28;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st28ActionPerformed

    private void st29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st29ActionPerformed
        int i=29;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st29ActionPerformed

    private void st32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st32ActionPerformed
        int i=32;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st32ActionPerformed

    private void st36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st36ActionPerformed
        int i=36;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st36ActionPerformed

    private void st40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st40ActionPerformed
        int i=40;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st40ActionPerformed

    private void st44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st44ActionPerformed
        int i=44;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st44ActionPerformed

    private void st33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st33ActionPerformed
        int i=33;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st33ActionPerformed

    private void st37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st37ActionPerformed
        int i=37;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st37ActionPerformed

    private void st48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st48ActionPerformed
        int i=48;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st48ActionPerformed

    private void st41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st41ActionPerformed
        int i=41;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st41ActionPerformed

    private void st45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st45ActionPerformed
        int i=45;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st45ActionPerformed

    private void st49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st49ActionPerformed
        int i=49;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st49ActionPerformed

    private void st50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st50ActionPerformed
        int i=50;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st50ActionPerformed

    private void st51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st51ActionPerformed
        int i=51;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st51ActionPerformed

    private void st46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st46ActionPerformed
        int i=46;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st46ActionPerformed

    private void st52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st52ActionPerformed
        int i=52;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st52ActionPerformed

    private void st47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st47ActionPerformed
        int i=47;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st47ActionPerformed

    private void st42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st42ActionPerformed
        int i=42;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st42ActionPerformed

    private void st43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st43ActionPerformed
        int i=43;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st43ActionPerformed

    private void st38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st38ActionPerformed
        int i=38;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st38ActionPerformed

    private void st39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st39ActionPerformed
        int i=39;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st39ActionPerformed

    private void st34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st34ActionPerformed
        int i=34;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st34ActionPerformed

    private void st35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st35ActionPerformed
        int i=35;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st35ActionPerformed

    private void st30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st30ActionPerformed
        int i=30;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st30ActionPerformed

    private void st31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st31ActionPerformed
        int i=31;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st31ActionPerformed

    private void st26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st26ActionPerformed
        int i=26;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st26ActionPerformed

    private void st27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st27ActionPerformed
        int i=27;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st27ActionPerformed

    private void st22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st22ActionPerformed
        int i=22;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st22ActionPerformed

    private void st23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st23ActionPerformed
        int i=23;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st23ActionPerformed

    private void st18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st18ActionPerformed
        int i=18;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st18ActionPerformed

    private void st19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st19ActionPerformed
        int i=19;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st19ActionPerformed

    private void st14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st14ActionPerformed
        int i=14;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st14ActionPerformed

    private void st15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st15ActionPerformed
        int i=15;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st15ActionPerformed

    private void st10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st10ActionPerformed
        int i=10;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st10ActionPerformed

    private void st11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st11ActionPerformed
        int i=11;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st11ActionPerformed

    private void st6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st6ActionPerformed
        int i=6;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st6ActionPerformed

    private void st7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st7ActionPerformed
        int i=7;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st7ActionPerformed

    private void st2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st2ActionPerformed
        int i=2;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st2ActionPerformed

    private void st3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st3ActionPerformed
        int i=3;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st3ActionPerformed

    private void st1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st1ActionPerformed
        int i=1;
        if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.GREEN)){
            Buttons[i].setBackground(Color.ORANGE);
        }else if(!(Buttons[i].getBackground().equals(Color.RED)) && Buttons[i].getBackground().equals(Color.ORANGE)){
            Buttons[i].setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_st1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        ArrayList<Integer> selectedSeats = new ArrayList<Integer>();
        for(int i=1; i<= 52; i++){
            if(Buttons[i].getBackground().equals(Color.ORANGE)){
                selectedSeats.add(i);
            }
        }
        if(selectedSeats.size()!=0){
            Payment newFrame = new Payment(coachNo, journeyDate, departurePlace, destinationPlace, acNonAc, departureTime, userName, ticketPrice, selectedSeats);
            newFrame.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "You have to select atleast\none seat to proceed next");
        }
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PlaceDateSelection newFrame = new PlaceDateSelection(userName);
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(SeatModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton st1;
    private javax.swing.JButton st10;
    private javax.swing.JButton st11;
    private javax.swing.JButton st12;
    private javax.swing.JButton st13;
    private javax.swing.JButton st14;
    private javax.swing.JButton st15;
    private javax.swing.JButton st16;
    private javax.swing.JButton st17;
    private javax.swing.JButton st18;
    private javax.swing.JButton st19;
    private javax.swing.JButton st2;
    private javax.swing.JButton st20;
    private javax.swing.JButton st21;
    private javax.swing.JButton st22;
    private javax.swing.JButton st23;
    private javax.swing.JButton st24;
    private javax.swing.JButton st25;
    private javax.swing.JButton st26;
    private javax.swing.JButton st27;
    private javax.swing.JButton st28;
    private javax.swing.JButton st29;
    private javax.swing.JButton st3;
    private javax.swing.JButton st30;
    private javax.swing.JButton st31;
    private javax.swing.JButton st32;
    private javax.swing.JButton st33;
    private javax.swing.JButton st34;
    private javax.swing.JButton st35;
    private javax.swing.JButton st36;
    private javax.swing.JButton st37;
    private javax.swing.JButton st38;
    private javax.swing.JButton st39;
    private javax.swing.JButton st4;
    private javax.swing.JButton st40;
    private javax.swing.JButton st41;
    private javax.swing.JButton st42;
    private javax.swing.JButton st43;
    private javax.swing.JButton st44;
    private javax.swing.JButton st45;
    private javax.swing.JButton st46;
    private javax.swing.JButton st47;
    private javax.swing.JButton st48;
    private javax.swing.JButton st49;
    private javax.swing.JButton st5;
    private javax.swing.JButton st50;
    private javax.swing.JButton st51;
    private javax.swing.JButton st52;
    private javax.swing.JButton st6;
    private javax.swing.JButton st7;
    private javax.swing.JButton st8;
    private javax.swing.JButton st9;
    // End of variables declaration//GEN-END:variables
}
