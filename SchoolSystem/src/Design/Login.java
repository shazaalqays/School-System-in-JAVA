/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;
import Model.School;
import Model.Admin;
import Model.*;
import java.util.Scanner;
import Model.LessonType;
import Operations.*;
import java.util.List;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import schoolsystem.connection;
public class Login extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        conn = connection.connecrDb();
        
    }
    public void close(){
        WindowEvent winClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JButton();
        usernametxt = new javax.swing.JTextField();
        passwordtext = new javax.swing.JPasswordField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Login.setLabel("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        usernametxt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });

        passwordtext.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        passwordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextActionPerformed(evt);
            }
        });
        passwordtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtextKeyPressed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        username.setText("Username");

        password.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        password.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Login))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordtext, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(usernametxt))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String sql = "Select * from student where Username = ? and Password = ? ";
//        JOptionPane.showMessageDialog(null, "ok");
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, usernametxt.getText());
//            JOptionPane.showMessageDialog(null, usernametxt);
            pst.setString(2, passwordtext.getText());
//            JOptionPane.showMessageDialog(null, passwordtext);
//            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){ // not working without ! 
//                JOptionPane.showMessageDialog(null, "username and password is correct");
                rs.close();
                pst.close();
                close();
                AdminD sd = new AdminD();
                sd.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "username and password is not correct");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
//        String user = username.getText();
//        String pass = password.getText();
//        if (username.equals(a.getUsername()) && password.equals(a.getPassword())) {
////            System.out.println("You logged in as an admin");
//            AdminD ad = new AdminD();
//            ad.setVisible(true);
//        } else if (susernames.contains(username)) {
////            System.out.println("You signed in as a student");
//            StudentD sd = new StudentD();
//            sd.setVisible(true);
//        } else if (tusernames.contains(username)) {
////            System.out.println("You signed in as a teacher");
//            TeacherD td = new TeacherD();
//            td.setVisible(true);
//        }
        
    }//GEN-LAST:event_LoginActionPerformed
    
    
    
    private void passwordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
//        String user = usernametxt.getText();
//        String pass = passwordtext.getText();
//        if (user.equals(a.getUsername()) && pass.equals(a.getPassword())) {
////            System.out.println("You logged in as an admin");
//            AdminD ad = new AdminD();
//            ad.setVisible(true);
//        } else if (susernames.contains(user)) {
////            System.out.println("You signed in as a student");
//            StudentD sd = new StudentD();
//            sd.setVisible(true);
//        } else if (tusernames.contains(user)) {
////            System.out.println("You signed in as a teacher");
//            TeacherD td = new TeacherD();
//            td.setVisible(true);
//        }
    }//GEN-LAST:event_LoginMouseClicked

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void passwordtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
//        JOptionPane.showMessageDialog(null, "ok");
            try{
                String sql = "Select * from ADMIN where Username = ? and Password = ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, usernametxt.getText());
//              JOptionPane.showMessageDialog(null, usernametxt);
                pst.setString(2, passwordtext.getText());
//              JOptionPane.showMessageDialog(null, passwordtext);
//              pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){ // not working without ! 
//                  JOptionPane.showMessageDialog(null, "username and password is correct");
                    rs.close();
                    pst.close();
                    close();
                    AdminD ad = new AdminD();
                    ad.setVisible(true);
                
                }
//                else{
//                    JOptionPane.showMessageDialog(null, "username and password is not correct");
//                }  
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            try{
                String sql = "Select * from student where Username = ? and Password = ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, usernametxt.getText());
//              JOptionPane.showMessageDialog(null, usernametxt);
                pst.setString(2, passwordtext.getText());
//              JOptionPane.showMessageDialog(null, passwordtext);
//              pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){ // not working without ! 
//                  JOptionPane.showMessageDialog(null, "username and password is correct");
                    rs.close();
                    pst.close();
                    close();
                    StudentD sd = new StudentD();
                    sd.setVisible(true);
                
                }
//                else{
//                    JOptionPane.showMessageDialog(null, "username and password is not correct");
//                }  
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            try{
                String sql = "Select * from Teacher where Username = ? and Password = ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, usernametxt.getText());
//              JOptionPane.showMessageDialog(null, usernametxt);
                pst.setString(2, passwordtext.getText());
//              JOptionPane.showMessageDialog(null, passwordtext);
//              pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){ // not working without ! 
//                  JOptionPane.showMessageDialog(null, "username and password is correct");
                    rs.close();
                    pst.close();
                    close();
                    TeacherD teach = new TeacherD();
                    teach.setVisible(true);
                
                }
//                else{
//                    JOptionPane.showMessageDialog(null, "username and password is not correct");
//                }  
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_passwordtextKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
