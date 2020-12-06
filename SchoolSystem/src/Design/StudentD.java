/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import schoolsystem.connection;
public class StudentD extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public StudentD() {
        initComponents();
        conn = connection.connecrDb();
        updateStudentTable();
        loadStudentData();
    }

    public void close(){
        WindowEvent winClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
        
    }
    
    private void updateStudentTable(){
        try{
            String sql = "select * from Lesson_Stable ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    private void loadStudentData(){
        try {
            String sql = "select * from Student_table";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people1.getRowCount() > 0){
                ((DefaultTableModel)table_people1.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people1.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        logout1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_people1 = new javax.swing.JTable();
        search_txt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lid_text = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        save_botton3 = new javax.swing.JButton();
        del_button3 = new javax.swing.JButton();
        clear_text3 = new javax.swing.JButton();
        lessons = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tech_text = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_people2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        logout1.setText("Logout");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        table_people1.setBackground(new java.awt.Color(204, 204, 204));
        table_people1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson ID", "Lesson Name", "Teacher Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_people1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_people1MouseClicked(evt);
            }
        });
        table_people1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_people1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_people1);

        search_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txt1ActionPerformed(evt);
            }
        });
        search_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txt1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Search");

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setText("Lesson");

        jLabel14.setText("ID");

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        save_botton3.setText("Save");
        save_botton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton3ActionPerformed(evt);
            }
        });

        del_button3.setText("Delete");
        del_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_button3ActionPerformed(evt);
            }
        });

        clear_text3.setText("Clear");
        clear_text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_text3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear_text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_botton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_botton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del_button3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear_text3)
                .addContainerGap())
        );

        lessons.setText("Lessons");
        lessons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonsMouseClicked(evt);
            }
        });
        lessons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonsActionPerformed(evt);
            }
        });

        jLabel1.setText("Teacher");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lessons, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lname_txt)
                    .addComponent(lid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tech_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(lid_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lessons))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tech_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_minus-remove-delete-minimize_2931142 (2).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_plus-add-new-create-attach-maximize_2931155 (1).png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_exit-delete-remove-close-x_2931151.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        table_people2.setBackground(new java.awt.Color(204, 204, 204));
        table_people2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson ID", "Lesson Name", "Teacher Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_people2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_people2MouseClicked(evt);
            }
        });
        table_people2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_people2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(table_people2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(logout1)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        close();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_logout1MouseClicked

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    private void table_people1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_people1MouseClicked

        try{
            int row = table_people1.getSelectedRow();
            String click = (table_people1.getModel().getValueAt(row, 0).toString());
            String sql ="select * from Student_table where Lesson_ID = '"+click+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Lesson_ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Lesson_Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Teacher_Name");
                tech_text.setText(add3);

            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table_people1MouseClicked

    private void table_people1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_people1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){
            
            try{
                int row = table_people1.getSelectedRow();
                String click = (table_people1.getModel().getValueAt(row, 0).toString());
                String sql ="select * from Student_table where Lesson_ID = '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("Lesson_ID");
                    lid_text.setText(add1);
                    String add2 = rs.getString("Lesson_Name");
                    lname_txt.setText(add2);
                    String add3 = rs.getString("Teacher_Name");
                    tech_text.setText(add3);
                }
                rs.close();
                pst.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_table_people1KeyPressed

    private void search_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txt1ActionPerformed

    private void search_txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txt1KeyReleased
        try{
            String sql = "select * from Student_table where Teacher_Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Lesson_ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Lesson_Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Teacher_Name");
                tech_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Student_table where Lesson_ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Lesson_ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Lesson_Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Teacher_Name");
                tech_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Student_table where Lesson_Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Lesson_ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Lesson_Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Teacher_Name");
                tech_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_search_txt1KeyReleased

    private void lessonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsMouseClicked
        lessons.setOpaque(true);
        loadStudentData();
    }//GEN-LAST:event_lessonsMouseClicked

    private void lessonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsActionPerformed

    private void save_botton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton3ActionPerformed
        try{
            String sql ="Insert into Lesson_Stable (Lesson_ID, Lesson_Name, Teacher_Name) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lid_text.getText());
            pst.setString(2, lname_txt.getText());
            pst.setString(3, tech_text.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
    }//GEN-LAST:event_save_botton3ActionPerformed

    private void del_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_button3ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                String sql ="delete from Lesson_Stable where Lesson_ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, lid_text.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateStudentTable();
        }
    }//GEN-LAST:event_del_button3ActionPerformed

    private void clear_text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_text3ActionPerformed
        lid_text.setText("");
        lname_txt.setText("");
        tech_text.setText("");
    }//GEN-LAST:event_clear_text3ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setExtendedState(AdminD.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(this.getExtendedState() != AdminD.MAXIMIZED_BOTH){
            this.setExtendedState(AdminD.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(AdminD.NORMAL);
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void table_people2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_people2MouseClicked
        try{
            int row = table_people2.getSelectedRow();
            String click = (table_people2.getModel().getValueAt(row, 0).toString());
            String sql ="select * from Lesson_Stable where Lesson_ID = '"+click+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Lesson_ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Lesson_Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Teacher_Name");
                tech_text.setText(add3);

            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table_people2MouseClicked

    private void table_people2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_people2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){
            
            try{
                int row = table_people2.getSelectedRow();
                String click = (table_people2.getModel().getValueAt(row, 0).toString());
                String sql ="select * from Lesson_Stable where Lesson_ID = '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("Lesson_ID");
                    lid_text.setText(add1);
                    String add2 = rs.getString("Lesson_Name");
                    lname_txt.setText(add2);
                    String add3 = rs.getString("Teacher_Name");
                    tech_text.setText(add3);
                }
                rs.close();
                pst.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_table_people2KeyPressed

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
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_text1;
    private javax.swing.JButton clear_text3;
    private javax.swing.JButton del_button1;
    private javax.swing.JButton del_button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton lessons;
    private javax.swing.JTextField lid_text;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JButton save_botton1;
    private javax.swing.JButton save_botton3;
    private javax.swing.JTextField sbt_text;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTextField search_txt1;
    private javax.swing.JTextField sid_text;
    private javax.swing.JTextField sname_txt;
    private javax.swing.JButton students;
    private javax.swing.JTable table_people;
    private javax.swing.JTable table_people1;
    private javax.swing.JTable table_people2;
    private javax.swing.JTextField tech_text;
    private javax.swing.JButton update_text1;
    // End of variables declaration//GEN-END:variables
}
