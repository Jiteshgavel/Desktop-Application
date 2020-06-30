/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author lahcen
 */
public class Frame extends javax.swing.JFrame {

    AnimationClass ac  = new AnimationClass();
    String filename;
    public Frame() {
        initComponents();
        Design();
        
        
        
    }
    private void Design()
    {
        Panel1Home.setVisible(true);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(false);
        txtSname.setEditable(false);
        txtScontact.setEditable(false);
        txtSbalance.setEditable(false);
        btnVsearch.setEnabled(false);
        UploadExalPanal.setVisible(false);
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
    }
    private void clear()
    {
           //btnSadd.setVisible(false);
           Sindate.setCalendar(null);
           Soutdate.setCalendar(null);
           Snextsdate.setCalendar(null);
           //Soutdate.setEnabled(false);
           txtSremark.setText("");
           txtSserviceby.setText("");
           txtSnextservicemeter.setText("");
           txtShourmeter.setText("");
           txtSchassis.setText("");
            txtSname.setText("");
             txtScontact.setText("");
             txtSbalance.setText("");
             txtSsearch.setText("");
    }
    private void out()
    {
        setBackground(Color.decode("#2a2729"));
    }
    
    private void CDisplay()
    {
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String   sql="select * from customer" ;  
           PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tableC1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         }    
    }
    private void SDisplay()
    {
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           String   sql="select * from SERVICE" ;
           
           PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            Stable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         }    
    }
    
    private void RDisplay()
    {
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           //String   sql="select * from SERVICE" ; 
           String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,SERVICE.SERVICEBY,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service  join customer on customer.CHASSIS = service.CHASSIS";  
           PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            Rtable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         }    
    }
    
    private void VDisplay()
    {
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
       String    sql="select customer.name,customer.fname,customer.chassis,customer.contact,customer.balance,customer.address,service.jobtype,service.serviceby,service.hourmeter,service.indate,service.outdate,service.nextsdate,service.nextsmeter,service.remark from customer join service on customer.chassis = service.chassis";
          // String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service  join customer on customer.CHASSIS = service.CHASSIS";  
           PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            Vtable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         }    
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Pclickhome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pclickcustomer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pclickservice = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Pclickreminder = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Pclickviewall = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Pclickabout = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        Panel2Customer = new javax.swing.JPanel();
        txtCsearch = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCname = new javax.swing.JTextField();
        btnCclear = new javax.swing.JButton();
        txtCfname = new javax.swing.JTextField();
        btnCupdate = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        btnCadd = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCaddress = new javax.swing.JTextArea();
        txtCbalance = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableC1 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtCcontact = new javax.swing.JTextField();
        txtCchassis = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        UploadExalPanal = new javax.swing.JPanel();
        txtCpath = new javax.swing.JTextField();
        btnCbrowse = new javax.swing.JButton();
        btnCupload = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        Panel3Service = new javax.swing.JPanel();
        txtSname = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnSclear = new javax.swing.JButton();
        btnSupdate = new javax.swing.JButton();
        btnSadd = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtScontact = new javax.swing.JTextField();
        txtSchassis = new javax.swing.JTextField();
        Sindate = new com.toedter.calendar.JDateChooser();
        Soutdate = new com.toedter.calendar.JDateChooser();
        Snextsdate = new com.toedter.calendar.JDateChooser();
        txtSsearch = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtSremark = new javax.swing.JTextArea();
        jLabel96 = new javax.swing.JLabel();
        txtSbalance = new javax.swing.JTextField();
        txtShourmeter = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        txtSnextservicemeter = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Stable1 = new javax.swing.JTable();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtSjobtype = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txtSserviceby = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        Panel1Home = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Panel4Reminder = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Rdatestart = new com.toedter.calendar.JDateChooser();
        Rdateend = new com.toedter.calendar.JDateChooser();
        btnRsearch = new javax.swing.JButton();
        txtRsearch = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Rtable1 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        Panel5ViewAll = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnVsearch = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        Vcombo = new javax.swing.JComboBox<>();
        txtVsearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Vtable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 39, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pclickhome.setBackground(new java.awt.Color(42, 39, 41));
        Pclickhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickhomeMouseExited(evt);
            }
        });
        Pclickhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-home-page-30.png"))); // NOI18N
        Pclickhome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel2.setBackground(new java.awt.Color(192, 27, 54));
        jLabel2.setOpaque(true);
        Pclickhome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Home");
        Pclickhome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 50));

        Pclickcustomer.setBackground(new java.awt.Color(42, 39, 41));
        Pclickcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickcustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickcustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickcustomerMouseExited(evt);
            }
        });
        Pclickcustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/costumer.png"))); // NOI18N
        Pclickcustomer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel5.setBackground(new java.awt.Color(192, 27, 54));
        Pclickcustomer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Customer");
        Pclickcustomer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 50));

        Pclickservice.setBackground(new java.awt.Color(42, 39, 41));
        Pclickservice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickserviceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickserviceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickserviceMouseExited(evt);
            }
        });
        Pclickservice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/service.png"))); // NOI18N
        Pclickservice.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel8.setBackground(new java.awt.Color(192, 27, 54));
        Pclickservice.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Service");
        Pclickservice.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 180, 50));

        Pclickreminder.setBackground(new java.awt.Color(42, 39, 41));
        Pclickreminder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickreminder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickreminderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickreminderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickreminderMouseExited(evt);
            }
        });
        Pclickreminder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashbord icon 30.png"))); // NOI18N
        Pclickreminder.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel11.setBackground(new java.awt.Color(192, 27, 54));
        Pclickreminder.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Reminder");
        Pclickreminder.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickreminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 50));

        Pclickviewall.setBackground(new java.awt.Color(42, 39, 41));
        Pclickviewall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickviewall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickviewallMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickviewallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickviewallMouseExited(evt);
            }
        });
        Pclickviewall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/viewall.png"))); // NOI18N
        Pclickviewall.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel14.setBackground(new java.awt.Color(192, 27, 54));
        Pclickviewall.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ViewAll");
        Pclickviewall.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickviewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 50));

        Pclickabout.setBackground(new java.awt.Color(42, 39, 41));
        Pclickabout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pclickabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PclickaboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PclickaboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PclickaboutMouseExited(evt);
            }
        });
        Pclickabout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-info-30.png"))); // NOI18N
        Pclickabout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel17.setBackground(new java.awt.Color(192, 27, 54));
        Pclickabout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("About");
        Pclickabout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(Pclickabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 180, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/designdash.png"))); // NOI18N
        jLabel21.setText("DashBord");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 700));

        jPanel9.setBackground(new java.awt.Color(42, 39, 41));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(192, 27, 54));
        jLabel20.setOpaque(true);
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 10));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-rounded-left-30.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-data-backup-30 (1).png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-minimize-window-32.png"))); // NOI18N
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinMouseEntered(evt);
            }
        });
        jPanel9.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 30, 30));

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-close-window-32.png"))); // NOI18N
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });
        jPanel9.add(jLabel_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1170, 90));

        Panel2Customer.setPreferredSize(new java.awt.Dimension(1280, 1280));

        txtCsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCsearchKeyReleased(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Search :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Name :");

        txtCname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCnameKeyReleased(evt);
            }
        });

        btnCclear.setBackground(new java.awt.Color(255, 0, 51));
        btnCclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCclear.setForeground(new java.awt.Color(255, 255, 255));
        btnCclear.setText("Clear");
        btnCclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCclearActionPerformed(evt);
            }
        });

        txtCfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCfnameKeyReleased(evt);
            }
        });

        btnCupdate.setBackground(new java.awt.Color(0, 51, 204));
        btnCupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnCupdate.setText("Update");
        btnCupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCupdateActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Father Name:");

        btnCadd.setBackground(new java.awt.Color(102, 204, 0));
        btnCadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadd.setForeground(new java.awt.Color(255, 255, 255));
        btnCadd.setText("ADD");
        btnCadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaddActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Balance :");

        txtCaddress.setColumns(20);
        txtCaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCaddress.setRows(5);
        txtCaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaddressKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtCaddress);

        txtCbalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tableC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableC1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableC1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableC1);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Contact :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Chassis :");

        txtCcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCcontactKeyPressed(evt);
            }
        });

        txtCchassis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCchassis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCchassisKeyReleased(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Address :");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-refresh-black.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-upload-document-32.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        txtCpath.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCbrowse.setBackground(new java.awt.Color(34, 167, 240));
        btnCbrowse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCbrowse.setForeground(new java.awt.Color(255, 255, 255));
        btnCbrowse.setText("Browse");
        btnCbrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCbrowseActionPerformed(evt);
            }
        });

        btnCupload.setBackground(new java.awt.Color(34, 167, 240));
        btnCupload.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCupload.setForeground(new java.awt.Color(255, 255, 255));
        btnCupload.setText("UpLoad");
        btnCupload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuploadActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("X");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UploadExalPanalLayout = new javax.swing.GroupLayout(UploadExalPanal);
        UploadExalPanal.setLayout(UploadExalPanalLayout);
        UploadExalPanalLayout.setHorizontalGroup(
            UploadExalPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadExalPanalLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(UploadExalPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UploadExalPanalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCbrowse)
                        .addGap(30, 30, 30)
                        .addComponent(btnCupload)
                        .addContainerGap())
                    .addGroup(UploadExalPanalLayout.createSequentialGroup()
                        .addComponent(txtCpath, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel29))))
        );
        UploadExalPanalLayout.setVerticalGroup(
            UploadExalPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadExalPanalLayout.createSequentialGroup()
                .addGroup(UploadExalPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UploadExalPanalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UploadExalPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCbrowse)
                    .addComponent(btnCupload))
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel2CustomerLayout = new javax.swing.GroupLayout(Panel2Customer);
        Panel2Customer.setLayout(Panel2CustomerLayout);
        Panel2CustomerLayout.setHorizontalGroup(
            Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel47))
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2CustomerLayout.createSequentialGroup()
                                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel43))
                                .addGap(57, 57, 57)))
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2CustomerLayout.createSequentialGroup()
                                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCbalance, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCcontact)
                                    .addComponent(txtCfname)
                                    .addComponent(txtCname)
                                    .addComponent(txtCchassis))
                                .addGap(2, 2, 2))))
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel42)))
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCadd)
                        .addGap(26, 26, 26)
                        .addComponent(btnCupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnCclear)))
                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(txtCsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28))))
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(UploadExalPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        Panel2CustomerLayout.setVerticalGroup(
            Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2CustomerLayout.createSequentialGroup()
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(24, 24, 24))
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addComponent(txtCchassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtCname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(txtCfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(txtCcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(txtCbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2CustomerLayout.createSequentialGroup()
                        .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Panel2CustomerLayout.createSequentialGroup()
                                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(txtCsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel2CustomerLayout.createSequentialGroup()
                                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCclear)
                        .addComponent(btnCupdate)
                        .addComponent(btnCadd))
                    .addComponent(UploadExalPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jPanel1.add(Panel2Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1170, 650));

        Panel3Service.setPreferredSize(new java.awt.Dimension(1280, 1280));

        txtSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSclear.setBackground(new java.awt.Color(255, 0, 51));
        btnSclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSclear.setForeground(new java.awt.Color(255, 255, 255));
        btnSclear.setText("Clear");
        btnSclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSclearActionPerformed(evt);
            }
        });

        btnSupdate.setBackground(new java.awt.Color(0, 51, 204));
        btnSupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnSupdate.setText("Update");
        btnSupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupdateActionPerformed(evt);
            }
        });

        btnSadd.setBackground(new java.awt.Color(102, 204, 0));
        btnSadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSadd.setForeground(new java.awt.Color(255, 255, 255));
        btnSadd.setText("ADD");
        btnSadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnSadd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSupdate)
                .addGap(26, 26, 26)
                .addComponent(btnSclear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSclear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(btnSupdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel90.setText("Balance :");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel91.setText("IN :");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel92.setText("Next Hr Meter :");

        txtScontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSchassis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSchassis.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSchassisCaretUpdate(evt);
            }
        });
        txtSchassis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSchassisMouseClicked(evt);
            }
        });
        txtSchassis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSchassisKeyReleased(evt);
            }
        });

        Sindate.setDateFormatString("yyyy-MM-dd");
        Sindate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Soutdate.setDateFormatString("yyyy-MM-dd");
        Soutdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Snextsdate.setDateFormatString("yyyy-MM-dd");
        Snextsdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtSsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSsearchKeyReleased(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel93.setText("Out :");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel94.setText("Search :");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel95.setText("Name :");

        txtSremark.setColumns(20);
        txtSremark.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSremark.setRows(3);
        jScrollPane11.setViewportView(txtSremark);

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel96.setText("Remark :");

        txtSbalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtShourmeter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel97.setText("Next Service Date :");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel98.setText("JobType :");

        txtSnextservicemeter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel99.setText("Hr Meter :");

        Stable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Stable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Stable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stable1MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(Stable1);

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel100.setText("Contact :");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel101.setText("Chassis :");

        txtSjobtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSjobtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IST_SERVICE", "2ND_ SERVICE", "3RD_SERVICE", "PAID" }));
        txtSjobtype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-refresh-black.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        txtSserviceby.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSserviceby.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSservicebyKeyReleased(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel102.setText("Service By :");

        javax.swing.GroupLayout Panel3ServiceLayout = new javax.swing.GroupLayout(Panel3Service);
        Panel3Service.setLayout(Panel3ServiceLayout);
        Panel3ServiceLayout.setHorizontalGroup(
            Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(jLabel93)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3ServiceLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel92)
                                            .addComponent(jLabel97)
                                            .addComponent(jLabel102)
                                            .addComponent(jLabel96))))
                                .addGap(26, 26, 26)
                                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Snextsdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Soutdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sindate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel100)
                                            .addComponent(jLabel90))
                                        .addGap(18, 18, 18)
                                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtScontact, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel101)
                                            .addComponent(jLabel95)
                                            .addComponent(jLabel98)
                                            .addComponent(jLabel99))
                                        .addGap(18, 18, 18)
                                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSchassis)
                                            .addComponent(txtSname)
                                            .addComponent(txtSjobtype, 0, 232, Short.MAX_VALUE)
                                            .addComponent(txtShourmeter))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3ServiceLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSnextservicemeter)
                                .addComponent(txtSserviceby, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(jLabel25))
                    .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel3ServiceLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel3ServiceLayout.setVerticalGroup(
            Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel90)
                                    .addComponent(txtSbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtScontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel100)))
                        .addGap(24, 24, 24)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSjobtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel98))
                        .addGap(18, 18, 18)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShourmeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(18, 18, 18)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sindate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel93)
                            .addComponent(Soutdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addComponent(Snextsdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSnextservicemeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSserviceby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel3ServiceLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3ServiceLayout.createSequentialGroup()
                                .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel94))
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel3ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSchassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel101)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(Panel3Service, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1170, 650));

        Panel1Home.setBackground(new java.awt.Color(255, 255, 255));
        Panel1Home.setPreferredSize(new java.awt.Dimension(1280, 1280));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/peetramTector.jpg"))); // NOI18N

        javax.swing.GroupLayout Panel1HomeLayout = new javax.swing.GroupLayout(Panel1Home);
        Panel1Home.setLayout(Panel1HomeLayout);
        Panel1HomeLayout.setHorizontalGroup(
            Panel1HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel1HomeLayout.setVerticalGroup(
            Panel1HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(Panel1Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1170, 650));

        Panel4Reminder.setPreferredSize(new java.awt.Dimension(1280, 1280));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel50.setText("Reminder");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("From :");

        Rdatestart.setDateFormatString("yyyy-MM-dd");

        Rdateend.setDateFormatString("yyyy-MM-dd");

        btnRsearch.setBackground(new java.awt.Color(34, 167, 240));
        btnRsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnRsearch.setText("Search");
        btnRsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRsearchMouseClicked(evt);
            }
        });
        btnRsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRsearchActionPerformed(evt);
            }
        });

        txtRsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRsearchKeyReleased(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Search :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("To :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rdatestart, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(Rdateend, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52)
                                .addComponent(txtRsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Rdateend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rdatestart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel54)))))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        Rtable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Rtable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Rtable1);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-refresh-black.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel4ReminderLayout = new javax.swing.GroupLayout(Panel4Reminder);
        Panel4Reminder.setLayout(Panel4ReminderLayout);
        Panel4ReminderLayout.setHorizontalGroup(
            Panel4ReminderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4ReminderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(519, 519, 519))
            .addGroup(Panel4ReminderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel4ReminderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel4ReminderLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(162, 162, 162)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 323, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        Panel4ReminderLayout.setVerticalGroup(
            Panel4ReminderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4ReminderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGroup(Panel4ReminderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel4ReminderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel4ReminderLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1136, Short.MAX_VALUE))
        );

        jPanel1.add(Panel4Reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1170, 650));

        Panel5ViewAll.setPreferredSize(new java.awt.Dimension(1280, 1280));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel51.setText("View All");

        btnVsearch.setBackground(new java.awt.Color(34, 167, 240));
        btnVsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnVsearch.setText("Search");
        btnVsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVsearchActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setText("Search :");

        Vcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ", "CHASSIS", "NAME", "CONTACT" }));
        Vcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VcomboActionPerformed(evt);
            }
        });

        txtVsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addGap(33, 33, 33)
                .addComponent(Vcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtVsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnVsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Vcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))))
        );

        Vtable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Vtable1);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons8-refresh-black.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel5ViewAllLayout = new javax.swing.GroupLayout(Panel5ViewAll);
        Panel5ViewAll.setLayout(Panel5ViewAllLayout);
        Panel5ViewAllLayout.setHorizontalGroup(
            Panel5ViewAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(Panel5ViewAllLayout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel5ViewAllLayout.createSequentialGroup()
                .addComponent(jLabel27)
                .addGap(178, 178, 178)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 327, Short.MAX_VALUE))
        );
        Panel5ViewAllLayout.setVerticalGroup(
            Panel5ViewAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5ViewAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGroup(Panel5ViewAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel5ViewAllLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5ViewAllLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Panel5ViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1170, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PclickhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickhomeMouseClicked
        bar(jLabel2);
        Panel1Home.setVisible(true);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(false);
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
        
    }//GEN-LAST:event_PclickhomeMouseClicked

    private void PclickhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickhomeMouseEntered
        Pclickhome.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickhomeMouseEntered

    private void PclickhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickhomeMouseExited
        Pclickhome.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickhomeMouseExited

    private void PclickcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickcustomerMouseClicked
        bar(jLabel5);
        Panel1Home.setVisible(false);
        Panel2Customer.setVisible(true);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(false);
        CDisplay();
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
    }//GEN-LAST:event_PclickcustomerMouseClicked

    private void PclickcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickcustomerMouseEntered
        Pclickcustomer.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickcustomerMouseEntered

    private void PclickcustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickcustomerMouseExited
         Pclickcustomer.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickcustomerMouseExited

    private void PclickserviceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickserviceMouseExited
       Pclickservice.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickserviceMouseExited

    private void PclickserviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickserviceMouseClicked
        bar(jLabel8);
        Panel1Home.setVisible(false);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(true);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(false);
        
           Stable1.setEnabled(true);
           btnSadd.setVisible(true);
           Sindate.setEnabled(true);
           Soutdate.setEnabled(true);
           txtSremark.setEnabled(true);
           txtSserviceby.setEnabled(true);
           txtSnextservicemeter.setEnabled(true);
           txtShourmeter.setEnabled(true);
           txtSjobtype.setEnabled(true);
           txtSchassis.setEnabled(true);
            txtSname.setEnabled(true);
             txtScontact.setEnabled(true);
             txtSbalance.setEnabled(true);
             txtSsearch.setEnabled(true);
             clear();
           SDisplay();
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
        
        
    }//GEN-LAST:event_PclickserviceMouseClicked

    private void PclickserviceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickserviceMouseEntered
        Pclickservice.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickserviceMouseEntered

    private void PclickreminderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickreminderMouseClicked
        bar(jLabel11);
        Panel1Home.setVisible(false);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(true);
        Panel5ViewAll.setVisible(false);
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
        RDisplay();
       
    }//GEN-LAST:event_PclickreminderMouseClicked

    private void PclickreminderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickreminderMouseEntered
        Pclickreminder.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickreminderMouseEntered

    private void PclickreminderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickreminderMouseExited
        Pclickreminder.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickreminderMouseExited

    private void PclickviewallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickviewallMouseClicked
      bar(jLabel14);
        Panel1Home.setVisible(false);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(true);
        VDisplay();
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
        //Panel8About.setVisible(false);
    }//GEN-LAST:event_PclickviewallMouseClicked

    private void PclickviewallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickviewallMouseEntered
         Pclickviewall.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickviewallMouseEntered

    private void PclickviewallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickviewallMouseExited
         Pclickviewall.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickviewallMouseExited

    private void PclickaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickaboutMouseClicked
        bar(jLabel17);
        Panel1Home.setVisible(false);
        Panel2Customer.setVisible(false);
        Panel3Service.setVisible(false);
        Panel4Reminder.setVisible(false);
        Panel5ViewAll.setVisible(false);
        //Panel7ViewCostumer.setVisible(false);
        //Panel6ViewService.setVisible(false);
       // Panel8About.setVisible(true);
    }//GEN-LAST:event_PclickaboutMouseClicked

    private void PclickaboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickaboutMouseEntered
         Pclickabout.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PclickaboutMouseEntered

    private void PclickaboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PclickaboutMouseExited
        Pclickabout.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PclickaboutMouseExited

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(Frame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnRsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRsearchActionPerformed
       try{
         String first =((JTextField)Rdatestart.getDateEditor().getUiComponent()).getText();
         String second =((JTextField)Rdateend.getDateEditor().getUiComponent()).getText();
         Class.forName("org.sqlite.JDBC");
         Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
        
         //String sql="select  service.nextsdate,customer.name,customer.contact,customer.address,service.chassis,service.jobtype  from service  join customer on customer.CHASSIS = service.CHASSIS  where service.nextsdate between '"+first+"' and '"+second+"'";
         String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,SERVICE.SERVICEBY,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service  join customer on customer.CHASSIS = service.CHASSIS  where service.nextsdate between '"+first+"' and '"+second+"'";
        // String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service  join customer on customer.CHASSIS = service.CHASSIS"; 
         PreparedStatement pstmt = con.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         Rtable1.setModel(DbUtils.resultSetToTableModel(rs));
         rs.close();
         pstmt.close();
         con.close();  
            
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }    
    }//GEN-LAST:event_btnRsearchActionPerformed

    private void btnVsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVsearchActionPerformed
        try{
            //String first =((JTextField)datestart.getDateEditor().getUiComponent()).getText();
            //String second =((JTextField)dateend.getDateEditor().getUiComponent()).getText();
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String sql;
            PreparedStatement pstmt = null;
            switch (Vcombo.getSelectedItem().toString()){
                case "CHASSIS":
                //sql="select  service.nextsdate,customer.name,customer.contact,customer.address,service.chassis,service.jobtype from service  join customer on customer.chassis = service.chassis where service.chassis = ?";
                //sql= "select * from customer join service on customer.chassis = service.chassis where service.chassis = ?";
                sql="select customer.name,customer.fname,customer.chassis,customer.contact,customer.balance,customer.address,service.jobtype,service.serviceby,service.hourmeter,service.indate,service.outdate,service.nextsdate,service.nextsmeter,service.remark from customer join service on customer.chassis = service.chassis where service.chassis = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1,txtVsearch.getText());
                break;
                case "NAME":
                //sql="select  service.nextsdate,customer.name,customer.contact,customer.address,service.chassis,service.jobtype from service, customer, vehicle where customer.c_id = service.c_id and service.chassis = vehicle.chassis and service.chassis = ?";
                sql="select customer.name,customer.fname,customer.chassis,customer.contact,customer.balance,customer.address,service.jobtype,service.serviceby,service.hourmeter,service.indate,service.outdate,service.nextsdate,service.nextsmeter,service.remark from customer join service on customer.chassis = service.chassis where customer.name = ?";
                    //sql= "select  service.nextsdate,customer.name,customer.contact,customer.address,service.chassis,service.jobtype from service  join customer on customer.chassis = service.chassis where customer.name = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1,txtVsearch.getText());
                break;
                case "CONTACT":
                //sql="select  service.nextsdate,customer.name,customer.contact,customer.address,service.chassis,service.jobtype from service, customer, vehicle where customer.c_id = service.c_id and service.chassis = vehicle.chassis and customer.contact = ?";
                sql="select customer.name,customer.fname,customer.chassis,customer.contact,customer.balance,customer.address,service.jobtype,service.serviceby,service.hourmeter,service.indate,service.outdate,service.nextsdate,service.nextsmeter,service.remark from customer join service on customer.chassis = service.chassis where CUSTOMER.CONATCT = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1,txtVsearch.getText());
                break;
            }

            ResultSet rs = pstmt.executeQuery();
            Vtable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVsearchActionPerformed

    private void btnCaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaddActionPerformed
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String sql ="insert into customer (CHASSIS,NAME,FNAME,CONTACT,BALANCE,ADDRESS) values(?,?,?,?,?,?)";
           
            PreparedStatement pstmt = con.prepareStatement(sql);
             pstmt.setString(1,txtCchassis.getText());
            pstmt.setString(2,txtCname.getText());
            pstmt.setString(3,txtCfname.getText());
            pstmt.setString(4,txtCcontact.getText());
            pstmt.setString(5,txtCbalance.getText()); 
            pstmt.setString(6,txtCaddress.getText());
            
            pstmt.executeUpdate();
            CDisplay();
           
            
            JOptionPane.showMessageDialog(null,"inserted...");
            pstmt.close();
            con.close();
            txtCcontact.setEditable(true);
            }
       
       catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(this,"Chassis No. All Ready Exist");
            System.out.println(e);
            
        }
    }//GEN-LAST:event_btnCaddActionPerformed

    private void btnCupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCupdateActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            int p =JOptionPane.showConfirmDialog(null,"Do You Want To Update","Update..",JOptionPane.YES_NO_OPTION);
            if(p==0)
            {
             String sql ="update  customer set CHASSIS = ?,NAME=?,FNAME=?,CONTACT=?,BALANCE=?,ADDRESS=? where C_ID = ?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,txtCchassis.getText());
            pstmt.setString(2,txtCname.getText());
            pstmt.setString(3,txtCfname.getText());
            pstmt.setString(4,txtCcontact.getText());
            pstmt.setString(5,txtCbalance.getText()); 
            pstmt.setString(6,txtCaddress.getText());
            pstmt.setString(7,txtCsearch.getText());
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Updated....");
            pstmt.close();
            con.close();
            CDisplay();
            txtCcontact.setEditable(true);
            
        }}
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCupdateActionPerformed

    private void tableC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableC1MouseClicked
        try{
           int row = tableC1.getSelectedRow();
           String table_click = (tableC1.getModel().getValueAt(row,0).toString());
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           String   sql="select * from customer where C_ID = '"+table_click +"' "; 
          // String   sql="SELECT costumer.C_ID, costumer.NAME, costumer.FNAME, costumer.CONTACT, costumer.BALANCE, costumer.ADDRESS, VEHICLE.CHASSIS, VEHICLE.VNAME FROM VEHICLE , costumer where costumer.C_ID  = '"+table_click +"' ";
           PreparedStatement pstmt = con.prepareStatement(sql); 
           ResultSet rs = pstmt.executeQuery();
           
         
           if(rs.next())
           {
               String add1=rs.getString("C_ID");
               txtCsearch.setText(add1);
               
                String add7=rs.getString("chassis");
                txtCchassis.setText(add7);
                
                String add2=rs.getString("name");
                txtCname.setText(add2);
                
                String add3=rs.getString("fname");
                txtCfname.setText(add3);
                
                String add4=rs.getString("contact");
                txtCcontact.setText(add4);
                
                String add5=rs.getString("balance");
                txtCbalance.setText(add5);
                
                String add6=rs.getString("address");
                txtCaddress.setText(add6);
                
           }
           rs.close();
           pstmt.close();
           con.close();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         }  
    }//GEN-LAST:event_tableC1MouseClicked

    private void txtCsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCsearchKeyReleased
        int position = txtCsearch.getCaretPosition();
        txtCsearch.setText(txtCsearch.getText().toUpperCase());
        txtCsearch.setCaretPosition(position);
        
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           String   sql="select * from Customer where chassis = ?" ; 
            PreparedStatement pstmt = con.prepareStatement(sql);
             pstmt.setString(1,txtCsearch.getText());
             
            ResultSet rs = pstmt.executeQuery();
            tableC1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         } 
    }//GEN-LAST:event_txtCsearchKeyReleased

    private void txtCcontactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCcontactKeyPressed
       String phoneno = txtCcontact.getText();
                    int length = phoneno.length();
                    char c = evt.getKeyChar();
                    
                    if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
                        
                        if(length<10){
                            txtCcontact.setEditable(true);
                        }
                        else{
                            txtCcontact.setEditable(false);
                        }
                        
                    }
                    
                    else{
                        if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                        {
                            txtCcontact.setEditable(true);
                            
                        }
                        else{
                            txtCcontact.setEditable(false);
                        }
                    }
    }//GEN-LAST:event_txtCcontactKeyPressed

    private void btnCclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCclearActionPerformed
            txtCchassis.setText("");
            txtCname.setText("");
            txtCfname.setText("");
            txtCcontact.setText("");
            txtCbalance.setText("");
            txtCaddress.setText("");
            txtCsearch.setText("");
    }//GEN-LAST:event_btnCclearActionPerformed

    private void txtCchassisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCchassisKeyReleased
        int position = txtCchassis.getCaretPosition();
        txtCchassis.setText(txtCchassis.getText().toUpperCase());
        txtCchassis.setCaretPosition(position);
    }//GEN-LAST:event_txtCchassisKeyReleased

    private void txtCnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnameKeyReleased
        int position = txtCname.getCaretPosition();
        txtCname.setText(txtCname.getText().toUpperCase());
        txtCname.setCaretPosition(position);
    }//GEN-LAST:event_txtCnameKeyReleased

    private void txtCfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCfnameKeyReleased
        int position = txtCfname.getCaretPosition();
        txtCfname.setText(txtCfname.getText().toUpperCase());
        txtCfname.setCaretPosition(position);
    }//GEN-LAST:event_txtCfnameKeyReleased

    private void txtCaddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaddressKeyReleased
        int position = txtCaddress.getCaretPosition();
        txtCaddress.setText(txtCaddress.getText().toUpperCase());
        txtCaddress.setCaretPosition(position);
    }//GEN-LAST:event_txtCaddressKeyReleased

    private void btnSaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaddActionPerformed
        try{
            SQLiteConfig config = new SQLiteConfig();  
            config.enforceForeignKeys(true);  
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db", config.toProperties());
            
            String sql ="insert into SERVICE(chassis, jobtype, hourmeter,indate,outdate,nextsdate,nextsmeter,serviceby,remark) values(?,?,?,?,?,?,?,?,?)";
           
            PreparedStatement pstmt = con.prepareStatement(sql); 
            pstmt.setString(1,txtSchassis.getText());
            String type;
            type = txtSjobtype.getSelectedItem().toString();
            pstmt.setString(2,type);
            pstmt.setString(3,txtShourmeter.getText());
            pstmt.setString(4,((JTextField)Sindate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(5,((JTextField)Soutdate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(6,((JTextField)Snextsdate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(7,txtSnextservicemeter.getText());
            pstmt.setString(8,txtSserviceby.getText());
            pstmt.setString(9,txtSremark.getText());
           
           
            pstmt.executeUpdate();
            
            //
            SDisplay();
            JOptionPane.showMessageDialog(null,"inserted...");
            pstmt.close();
            con.close();
            
            }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Chassis No.");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSaddActionPerformed

    private void btnSupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupdateActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            int p =JOptionPane.showConfirmDialog(null,"Do You Want To Update","Update..",JOptionPane.YES_NO_OPTION);
            if(p==0)
            {
            //String sql ="update jobcard set jobtype = ?, hrmeterreading = ?,indate = ?,outdate = ?,nextservicedate = ?,nextservicemeter = ?,remark = ? where serialno = ?";
            String sql ="update SERVICE set  jobtype=?, hourmeter=?,indate=?,outdate=?,nextsdate=?,nextsmeter=?,remark=?,chassis = ? ,serviceby = ? where s_id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            
            String type;
            type = txtSjobtype.getSelectedItem().toString();
            pstmt.setString(1,type);
            pstmt.setString(2,txtShourmeter.getText());
            pstmt.setString(3,((JTextField)Sindate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(4,((JTextField)Soutdate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(5,((JTextField)Snextsdate.getDateEditor().getUiComponent()).getText());
            pstmt.setString(6,txtSnextservicemeter.getText());
            pstmt.setString(7,txtSremark.getText());
            pstmt.setString(8,txtSchassis.getText());
            pstmt.setString(9,txtSserviceby.getText());
            pstmt.setInt(10, Integer.parseInt(txtSsearch.getText().toString()));
           
            pstmt.executeUpdate();
           
             
             pstmt.close();
             con.close();
             SDisplay();
       }}
       catch(HeadlessException | ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }       
    }//GEN-LAST:event_btnSupdateActionPerformed

    private void Stable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stable1MouseClicked
        try{
           int row = Stable1.getSelectedRow();
           String table_click = (Stable1.getModel().getValueAt(row,0).toString());
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           String   sql="select * from service where s_id = '"+table_click +"' "; 
          // String   sql="SELECT costumer.C_ID, costumer.NAME, costumer.FNAME, costumer.CONTACT, costumer.BALANCE, costumer.ADDRESS, VEHICLE.CHASSIS, VEHICLE.VNAME FROM VEHICLE , costumer where costumer.C_ID  = '"+table_click +"' ";
           PreparedStatement pstmt = con.prepareStatement(sql); 
           ResultSet rs = pstmt.executeQuery();
           //System.out.println(rs);
           while(rs.next())
           {
               
               String add=rs.getString("s_id");
                txtSsearch.setText(add);
               
               String add1=rs.getString("chassis");
                txtSchassis.setText(add1);
                
                String add3=rs.getString("jobtype");
                txtSjobtype.getModel().setSelectedItem(add3);
                
                String add4=rs.getString("hourmeter");
                txtShourmeter.setText(add4);
                
                String add8=rs.getString("nextsmeter");
                txtSnextservicemeter.setText(add8);
                
                String add0=rs.getString("serviceby");
                txtSserviceby.setText(add0);
               
                String add2=rs.getString("remark");
                txtSremark.setText(add2);
               
                String date1 = (rs.getString("indate"));
                java.util.Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
                Sindate.setDate(d1);
               
                String date2 = (rs.getString("outdate"));
                java.util.Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
                Soutdate.setDate(d2);
               
                String date3 = (rs.getString("nextsdate"));
                java.util.Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse(date3);
                Snextsdate.setDate(d3);
             
           }
           rs.close();
           pstmt.close();
           con.close();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         } catch (ParseException ex) { 
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_Stable1MouseClicked

    private void txtSsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSsearchKeyReleased
         int position = txtSsearch.getCaretPosition();
        txtSsearch.setText(txtSsearch.getText().toUpperCase());
        txtSsearch.setCaretPosition(position);
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           String   sql="select * from SERVICE where chassis = ?" ; 
            PreparedStatement pstmt = con.prepareStatement(sql);
             pstmt.setString(1,txtSsearch.getText());
             
            ResultSet rs = pstmt.executeQuery();
            Stable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         } 
    }//GEN-LAST:event_txtSsearchKeyReleased

    private void txtSchassisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSchassisKeyReleased
        int position = txtSchassis.getCaretPosition();
        txtSchassis.setText(txtSchassis.getText().toUpperCase());
        txtSchassis.setCaretPosition(position);
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String   sql="select * from customer where chassis = ? ";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,txtSchassis.getText());
        
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("name");
                txtSname.setText(add1);
               
                String add3=rs.getString("contact");
                txtScontact.setText(add3);
                
                String add5=rs.getString("balance");
                txtSbalance.setText(add5);
                           
            }
            rs.close();
            pstmt.close();
            con.close();
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
            
    }//GEN-LAST:event_txtSchassisKeyReleased

    private void txtSchassisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSchassisMouseClicked
        txtSchassis.setText("");
            txtSname.setText("");
            txtScontact.setText("");
            txtSbalance.setText("");
    }//GEN-LAST:event_txtSchassisMouseClicked

    private void btnRsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRsearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRsearchMouseClicked

    private void Rtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rtable1MouseClicked
        try{
           int row = Rtable1.getSelectedRow();
           String table_click = (Rtable1.getModel().getValueAt(row,0).toString());
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           //String   sql="select * from service where s_id = '"+table_click +"' "; 
          // String   sql="SELECT costumer.C_ID, costumer.NAME, costumer.FNAME, costumer.CONTACT, costumer.BALANCE, costumer.ADDRESS, VEHICLE.CHASSIS, VEHICLE.VNAME FROM VEHICLE , costumer where costumer.C_ID  = '"+table_click +"' ";
          String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,service.serviceby,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service,customer where customer.CHASSIS = service.CHASSIS and SERVICE.S_ID  = '"+table_click+"'";  
          PreparedStatement pstmt = con.prepareStatement(sql); 
           ResultSet rs = pstmt.executeQuery();
           //System.out.println(rs);
           while(rs.next())
           {
               
               String add=rs.getString("s_id");
                txtSsearch.setText(add);
               
               String add1=rs.getString("chassis");
                txtSchassis.setText(add1);
                
                String add3=rs.getString("jobtype");
                txtSjobtype.getModel().setSelectedItem(add3);
                
                String add4=rs.getString("hourmeter");
                txtShourmeter.setText(add4);
                
                String add8=rs.getString("nextsmeter");
                txtSnextservicemeter.setText(add8);
               
                String add0=rs.getString("serviceby");
                txtSserviceby.setText(add0);
                
                String add2=rs.getString("remark");
                txtSremark.setText(add2);
               
                String date1 = (rs.getString("indate"));
                java.util.Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
                Sindate.setDate(d1);
               
                String date2 = (rs.getString("outdate"));
                java.util.Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
                Soutdate.setDate(d2);
               
                String date3 = (rs.getString("nextsdate"));
                java.util.Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse(date3);
                Snextsdate.setDate(d3);
             
           }
           rs.close();
           pstmt.close();
           con.close();
           Stable1.setEnabled(false);
           btnSadd.setVisible(false);
           Sindate.setEnabled(false);
           Soutdate.setEnabled(false);
           txtSremark.setEnabled(false);
           txtSserviceby.setEnabled(false);
           txtSnextservicemeter.setEnabled(false);
           txtShourmeter.setEnabled(false);
           //txtSjobtype.setEditable(false);
           txtSjobtype.setEnabled(false);
           txtSchassis.setEnabled(false);
            txtSname.setEnabled(false);
             txtScontact.setEnabled(false);
             txtSbalance.setEnabled(false);
             txtSsearch.setEnabled(false);
           Panel4Reminder.setVisible(false);
           Panel3Service.setVisible(true);
          
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         } catch (ParseException ex) { 
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_Rtable1MouseClicked

    private void txtSchassisCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSchassisCaretUpdate
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String   sql="select * from customer where chassis = ? ";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,txtSchassis.getText());
        
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("name");
                txtSname.setText(add1);
               
                String add3=rs.getString("contact");
                txtScontact.setText(add3);
                
                String add5=rs.getString("balance");
                txtSbalance.setText(add5);
                           
            }
            rs.close();
            pstmt.close();
            con.close();
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
    }//GEN-LAST:event_txtSchassisCaretUpdate

    private void VcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VcomboActionPerformed
         btnVsearch.setEnabled(true);
    }//GEN-LAST:event_VcomboActionPerformed

    private void txtVsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVsearchKeyReleased
        int position = txtVsearch.getCaretPosition();
        txtVsearch.setText(txtVsearch.getText().toUpperCase());
        txtVsearch.setCaretPosition(position);
    }//GEN-LAST:event_txtVsearchKeyReleased

    private void txtRsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRsearchKeyReleased
       int position = txtRsearch.getCaretPosition();
        txtRsearch.setText(txtRsearch.getText().toUpperCase());
        txtRsearch.setCaretPosition(position);
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
           //String   sql="select * from SERVICE where chassis = ?" ; 
           String sql ="SELECT SERVICE.S_ID,SERVICE.NEXTSDATE,SERVICE.CHASSIS,CUSTOMER.NAME,CUSTOMER.CONTACT,SERVICE.JOBTYPE,SERVICE.SERVICEBY,SERVICE.hourmeter,SERVICE.indate,SERVICE.outdate,SERVICE.nextsmeter,SERVICE.remark from service  join customer on customer.CHASSIS = service.CHASSIS WHERE SERVICE.CHASSIS = ?";  
            PreparedStatement pstmt = con.prepareStatement(sql);
             pstmt.setString(1,txtRsearch.getText());
             
            ResultSet rs = pstmt.executeQuery();
            Rtable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pstmt.close();
            con.close();  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
         } 
    }//GEN-LAST:event_txtRsearchKeyReleased

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
       CDisplay();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        SDisplay();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
         VDisplay();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
         RDisplay();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        //in();
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void btnCbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCbrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("file","csv","xls");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txtCpath.setText(filename);
    }//GEN-LAST:event_btnCbrowseActionPerformed

    private void btnCuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuploadActionPerformed
        try{
           BufferedReader read = new BufferedReader (new FileReader(filename));
           String data;
           System.out.println(filename);
           while((data= read.readLine()) != null)
           {
               
            String[] value = data.split(",");
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Reminder2.db");
            String sql ="insert into customer (CHASSIS,NAME,FNAME,CONTACT,BALANCE,ADDRESS) values(?,?,?,?,?,?)";
           
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,value[0]);
            pstmt.setString(2,value[1]);
            pstmt.setString(3,value[2]);
            pstmt.setString(4,value[3]);
            pstmt.setString(5,value[4]); 
            pstmt.setString(6,value[5]);
            
            //pstmt.setString(1,value[0]);
            //pstmt.setString(2,value[1]);
            //pstmt.setString(3,value[2]);
           
               pstmt.executeUpdate();
             
             pstmt.close();
             con.close();
             
           }
            JOptionPane.showMessageDialog(null,"inserted...");
       }
       
       catch(Exception e)
       {
           System.out.println();
       }
    }//GEN-LAST:event_btnCuploadActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        UploadExalPanal.setVisible(true);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
         UploadExalPanal.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void txtSservicebyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSservicebyKeyReleased
        int position = txtSserviceby.getCaretPosition();
        txtSserviceby.setText(txtSserviceby.getText().toUpperCase());
        txtSserviceby.setCaretPosition(position);
    }//GEN-LAST:event_txtSservicebyKeyReleased

    private void btnSclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSclearActionPerformed
        clear();
    }//GEN-LAST:event_btnSclearActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.setVisible(false);
        new LoginForm().setVisible(true);
      
    }//GEN-LAST:event_jLabel23MouseClicked

    
    
    
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1Home;
    private javax.swing.JPanel Panel2Customer;
    private javax.swing.JPanel Panel3Service;
    private javax.swing.JPanel Panel4Reminder;
    private javax.swing.JPanel Panel5ViewAll;
    private javax.swing.JPanel Pclickabout;
    private javax.swing.JPanel Pclickcustomer;
    private javax.swing.JPanel Pclickhome;
    private javax.swing.JPanel Pclickreminder;
    private javax.swing.JPanel Pclickservice;
    private javax.swing.JPanel Pclickviewall;
    private com.toedter.calendar.JDateChooser Rdateend;
    private com.toedter.calendar.JDateChooser Rdatestart;
    private javax.swing.JTable Rtable1;
    private com.toedter.calendar.JDateChooser Sindate;
    private com.toedter.calendar.JDateChooser Snextsdate;
    private com.toedter.calendar.JDateChooser Soutdate;
    private javax.swing.JTable Stable1;
    private javax.swing.JPanel UploadExalPanal;
    private javax.swing.JComboBox<String> Vcombo;
    private javax.swing.JTable Vtable1;
    private javax.swing.JButton btnCadd;
    private javax.swing.JButton btnCbrowse;
    private javax.swing.JButton btnCclear;
    private javax.swing.JButton btnCupdate;
    private javax.swing.JButton btnCupload;
    private javax.swing.JButton btnRsearch;
    private javax.swing.JButton btnSadd;
    private javax.swing.JButton btnSclear;
    private javax.swing.JButton btnSupdate;
    private javax.swing.JButton btnVsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableC1;
    private javax.swing.JTextArea txtCaddress;
    private javax.swing.JTextField txtCbalance;
    private javax.swing.JTextField txtCchassis;
    private javax.swing.JTextField txtCcontact;
    private javax.swing.JTextField txtCfname;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtCpath;
    private javax.swing.JTextField txtCsearch;
    private javax.swing.JTextField txtRsearch;
    private javax.swing.JTextField txtSbalance;
    private javax.swing.JTextField txtSchassis;
    private javax.swing.JTextField txtScontact;
    private javax.swing.JTextField txtShourmeter;
    private javax.swing.JComboBox<String> txtSjobtype;
    private javax.swing.JTextField txtSname;
    private javax.swing.JTextField txtSnextservicemeter;
    private javax.swing.JTextArea txtSremark;
    private javax.swing.JTextField txtSsearch;
    private javax.swing.JTextField txtSserviceby;
    private javax.swing.JTextField txtVsearch;
    // End of variables declaration//GEN-END:variables

public void bar(JLabel lab){
        //Frame3Service.setVisible(false);
        jLabel11.setOpaque(false);
        jLabel8.setOpaque(false);
        jLabel14.setOpaque(false);
        jLabel2.setOpaque(false);
        jLabel5.setOpaque(false);
        jLabel17.setOpaque(false);
        jLabel8.setOpaque(false);
        lab.setOpaque(true);
        jPanel2.repaint();
}    }