/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import schoolsystem.connection;
/**
 *
 * @author YOGA
 */
public class AdminD extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public AdminD() {
        initComponents();
        conn = connection.connecrDb();
        updateTeacherTable();
        updateStudentTable();
        updateLessonTable();
        loadTeacherData();
        loadStudentData();
        loadLessonData();
    }
    
    private void updateTeacherTable(){
        try{
            String sql = "select * from Teacher ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    private void updateStudentTable(){
        try{
            String sql = "select * from student ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    private void updateLessonTable(){
        try{
            String sql = "select * from lesson ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    private void loadTeacherData(){
        try {
            String sql = "select * from Teacher";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people.getRowCount() > 0){
                ((DefaultTableModel)table_people.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTeacherTable();
    }
    private void loadStudentData(){
        try {
            String sql = "select * from student";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people.getRowCount() > 0){
                ((DefaultTableModel)table_people.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
    }
    private void loadLessonData(){
        try {
            String sql = "select * from lesson";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people.getRowCount() > 0){
                ((DefaultTableModel)table_people.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateLessonTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        sid_text = new javax.swing.JTextField();
        sbt_text = new javax.swing.JTextField();
        sname_txt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        save_botton1 = new javax.swing.JButton();
        del_button1 = new javax.swing.JButton();
        update_text1 = new javax.swing.JButton();
        clear_text1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        bt_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        les_text = new javax.swing.JTextField();
        save_botton = new javax.swing.JButton();
        del_button = new javax.swing.JButton();
        update_text = new javax.swing.JButton();
        clear_text = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_people = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lessons = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lid_text = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        save_botton2 = new javax.swing.JButton();
        del_button2 = new javax.swing.JButton();
        update_text2 = new javax.swing.JButton();
        clear_text2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cap_text = new javax.swing.JTextField();
        students = new javax.swing.JButton();
        teachers = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Search");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        save_botton1.setText("Save");
        save_botton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_botton1MouseClicked(evt);
            }
        });
        save_botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton1ActionPerformed(evt);
            }
        });

        del_button1.setText("Delete");
        del_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_button1ActionPerformed(evt);
            }
        });

        update_text1.setText("Update");
        update_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_text1ActionPerformed(evt);
            }
        });

        clear_text1.setText("Clear");
        clear_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_text1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sbt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(del_button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_botton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clear_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sid_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_botton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_button1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbt_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_text1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear_text1)
                .addGap(39, 39, 39))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setText("ID");

        jLabel6.setText("Name");

        jLabel8.setText("BloodType");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Name");

        jLabel1.setText("ID");

        jLabel4.setText("BloodType");

        jLabel11.setText("Lesson");

        les_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                les_textActionPerformed(evt);
            }
        });

        save_botton.setText("Save");
        save_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_bottonActionPerformed(evt);
            }
        });

        del_button.setText("Delete");
        del_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_buttonActionPerformed(evt);
            }
        });

        update_text.setText("Update");
        update_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_textActionPerformed(evt);
            }
        });

        clear_text.setText("Clear");
        clear_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(les_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(save_botton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(del_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(clear_text, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_botton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_button))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bt_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(les_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_text))
                .addGap(28, 28, 28))
        );

        table_people.setBackground(new java.awt.Color(204, 204, 204));
        table_people.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_people.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_peopleMouseClicked(evt);
            }
        });
        table_people.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_peopleKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_people);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_exit-delete-remove-close-x_2931151.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_minus-remove-delete-minimize_2931142 (2).png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_plus-add-new-create-attach-maximize_2931155 (1).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

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

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Name");

        jLabel10.setText("ID");

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        save_botton2.setText("Save");
        save_botton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton2ActionPerformed(evt);
            }
        });

        del_button2.setText("Delete");
        del_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_button2ActionPerformed(evt);
            }
        });

        update_text2.setText("Update");
        update_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_text2ActionPerformed(evt);
            }
        });

        clear_text2.setText("Clear");
        clear_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_text2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear_text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_botton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_botton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del_button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear_text2)
                .addContainerGap())
        );

        jLabel12.setText("Capacity");

        cap_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cap_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lname_txt)
                    .addComponent(lid_text, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(cap_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lid_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cap_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lessons, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lessons)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        students.setText("Students");
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
        });

        teachers.setText("Teachers");
        teachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersMouseClicked(evt);
            }
        });
        teachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(teachers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(students)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(teachers)
                                .addGap(208, 208, 208))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(students))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        try{
            String sql = "select * from student where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
                String add3 = rs.getString("BloodType");
                sbt_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from student where ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
                String add3 = rs.getString("BloodType");
                sbt_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Teacher where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                id_text.setText(add1);
                String add2 = rs.getString("Name");
                name_txt.setText(add2);
                String add3 = rs.getString("BloodType");
                bt_text.setText(add3);
                String add4 = rs.getString("Lesson");
                les_text.setText(add4);
            }
            rs.close();
            pst.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Teacher where ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                id_text.setText(add1);
                String add2 = rs.getString("Name");
                name_txt.setText(add2);
                String add3 = rs.getString("BloodType");
                bt_text.setText(add3);
                String add4 = rs.getString("Lesson");
                les_text.setText(add4);
            }
            rs.close();
            pst.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from lesson where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Capacity");
                cap_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from lesson where ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                lid_text.setText(add1);
                String add2 = rs.getString("Name");
                lname_txt.setText(add2);
                String add3 = rs.getString("Capacity");
                cap_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_search_txtKeyReleased

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txtActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutMouseClicked

    private void clear_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_textActionPerformed
        id_text.setText("");
        name_txt.setText("");
        bt_text.setText("");
        les_text.setText("");
    }//GEN-LAST:event_clear_textActionPerformed

    private void update_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_textActionPerformed
        
        try{
            String val1 = id_text.getText();
            String val2 = name_txt.getText();
            String val3 = bt_text.getText();
            String val4 = les_text.getText();
            String sql = "update Teacher set ID = '"+val1+"', Name = '"+val2+"', BloodType ='"+val3+"' , Lesson ='"+val4+"' where ID ='"+val1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateTeacherTable();
        loadTeacherData();
        
    }//GEN-LAST:event_update_textActionPerformed

    private void del_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_buttonActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            
            try{
                String sql ="delete from Teacher where ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, id_text.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateTeacherTable();
            loadTeacherData();
        }
    }//GEN-LAST:event_del_buttonActionPerformed

    private void save_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_bottonActionPerformed
        
        try{
            String sql ="Insert into Teacher (Name, BloodType, Lesson) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name_txt.getText());
            pst.setString(2, bt_text.getText());
            pst.setString(3, les_text.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        updateTeacherTable();
        loadTeacherData();
    }//GEN-LAST:event_save_bottonActionPerformed

    private void teachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersActionPerformed
        
        
    }//GEN-LAST:event_teachersActionPerformed

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
        students.setOpaque(true);
        teachers.setOpaque(false);
        lessons.setOpaque(false);
        loadStudentData();
    }//GEN-LAST:event_studentsMouseClicked

    private void teachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersMouseClicked
        teachers.setOpaque(true);
        students.setOpaque(false);
        lessons.setOpaque(false);
        loadTeacherData();
    }//GEN-LAST:event_teachersMouseClicked

    private void save_botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton1ActionPerformed
        
        try{
            String sql ="Insert into student (Name, BloodType) values (?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, sname_txt.getText());
            pst.setString(2, sbt_text.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
        loadStudentData();
    }//GEN-LAST:event_save_botton1ActionPerformed

    private void del_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_button1ActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                String sql ="delete from student where ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, sid_text.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateStudentTable();
            loadStudentData();
        }
    }//GEN-LAST:event_del_button1ActionPerformed

    private void update_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_text1ActionPerformed
        
        try{
            String val1 = sid_text.getText();
            String val2 = sname_txt.getText();
            String val3 = sbt_text.getText();
            String sql = "update student set ID = '"+val1+"', Name = '"+val2+"', BloodType ='"+val3+"' where ID ='"+val1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
        loadStudentData();
    }//GEN-LAST:event_update_text1ActionPerformed

    private void clear_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_text1ActionPerformed
        sid_text.setText("");
        sname_txt.setText("");
        sbt_text.setText("");
    }//GEN-LAST:event_clear_text1ActionPerformed

    private void save_botton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_botton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_save_botton1MouseClicked

    private void save_botton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton2ActionPerformed
        
        try{
            String sql ="Insert into lesson (Name, Capacity) values (?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lname_txt.getText());
            pst.setString(2, cap_text.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateLessonTable();
        loadLessonData();
    }//GEN-LAST:event_save_botton2ActionPerformed

    private void del_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_button2ActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                String sql ="delete from lesson where ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, lid_text.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateLessonTable();
            loadLessonData();
        }
    }//GEN-LAST:event_del_button2ActionPerformed

    private void update_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_text2ActionPerformed

        try{
            String val1 = lid_text.getText();
            String val2 = lname_txt.getText();
            String val3 = cap_text.getText();
            String sql = "update lesson set ID = '"+val1+"', Name = '"+val2+"' , Capacity = '"+val3+"' where ID ='"+val1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        loadLessonData();
        updateLessonTable();
    }//GEN-LAST:event_update_text2ActionPerformed

    private void clear_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_text2ActionPerformed
        lid_text.setText("");
        lname_txt.setText("");
        cap_text.setText("");
    }//GEN-LAST:event_clear_text2ActionPerformed

    private void lessonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsActionPerformed

    private void lessonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsMouseClicked
        lessons.setOpaque(true);
        teachers.setOpaque(false);
        students.setOpaque(false);
        loadLessonData();
    }//GEN-LAST:event_lessonsMouseClicked

    private void les_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_les_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_les_textActionPerformed

    private void cap_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cap_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cap_textActionPerformed

    private void table_peopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_peopleMouseClicked
        
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    id_text.setText(add1);
                    String add2 = rs.getString("Name");
                    name_txt.setText(add2);
                    String add3 = rs.getString("BloodType");
                    bt_text.setText(add3);
                    String add4 = rs.getString("Lesson");
                    les_text.setText(add4);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }  
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from student where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
                    String add3 = rs.getString("BloodType");
                    sbt_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from lesson where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    lid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    lname_txt.setText(add2);
                    String add3 = rs.getString("Capacity");
                    cap_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_table_peopleMouseClicked

    private void table_peopleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_peopleKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_DOWN || evt.getKeyCode()== KeyEvent.VK_UP){
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    id_text.setText(add1);
                    String add2 = rs.getString("Name");
                    name_txt.setText(add2);
                    String add3 = rs.getString("BloodType");
                    bt_text.setText(add3);
                    String add4 = rs.getString("Lesson");
                    les_text.setText(add4);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }  
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from student where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
                    String add3 = rs.getString("BloodType");
                    sbt_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            try{
                int row = table_people.getSelectedRow();
                String click = (table_people.getModel().getValueAt(row,0).toString());
                String sql = "select * from lesson where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    lid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    lname_txt.setText(add2);
                    String add3 = rs.getString("Capacity");
                    cap_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_table_peopleKeyPressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setExtendedState(AdminD.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(this.getExtendedState() != AdminD.MAXIMIZED_BOTH){
            this.setExtendedState(AdminD.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(AdminD.NORMAL);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(AdminD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bt_text;
    private javax.swing.JTextField cap_text;
    private javax.swing.JButton clear_text;
    private javax.swing.JButton clear_text1;
    private javax.swing.JButton clear_text2;
    private javax.swing.JButton del_button;
    private javax.swing.JButton del_button1;
    private javax.swing.JButton del_button2;
    private javax.swing.JTextField id_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField les_text;
    private javax.swing.JButton lessons;
    private javax.swing.JTextField lid_text;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name_txt;
    private javax.swing.JButton save_botton;
    private javax.swing.JButton save_botton1;
    private javax.swing.JButton save_botton2;
    private javax.swing.JTextField sbt_text;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTextField sid_text;
    private javax.swing.JTextField sname_txt;
    private javax.swing.JButton students;
    private javax.swing.JTable table_people;
    private javax.swing.JButton teachers;
    private javax.swing.JButton update_text;
    private javax.swing.JButton update_text1;
    private javax.swing.JButton update_text2;
    // End of variables declaration//GEN-END:variables
}
