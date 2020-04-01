/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.equipment;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class Equipments_edit extends javax.swing.JFrame {

    /**
     * Creates new form Equipments_edit
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    Vector model = new Vector();
    private ArrayList<Integer> equipmentStatus;
    private ArrayList<Integer> equipmentType;
    
    
    public Equipments_edit() {
        this.equipmentType = new ArrayList<>();
        this.equipmentStatus = new ArrayList<>();
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        show_user();
        combobox();
        combobox1();
    }
    
     private void combobox()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            String sql = "Select * from equipment_types";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                String name = rs.getString("name");
                combotypeedit.addItem(name);
//                 String name1 = rs.getString("name");
//                combotype.addItem(name);
                equipmentType.add(rs.getInt("id"));

            }
                    
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void combobox1()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            String sql = "Select * from equipment_status";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
//            int i = 0;
            while(rs.next())
            {
//                model.addElement( new User1(rs.getInt("id"), rs.getString("name")));
                String name = rs.getString("name");
                combostatusedit.addItem(name);
                equipmentStatus.add(rs.getInt("id"));
                
               //                i++;
//                combostatus.sItem(i);
//                IDHolder.put(a, rs.getInt(1));
//                combostatus.Item.]Value = rs.getInt("id");
            }
            
//            combostatus.setModel(model)
                    
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
     public ArrayList<User> userList()
    {
        ArrayList<User> usersList = new ArrayList<>();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            String query1 = "SELECT * FROM equipments";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while(rs.next())
            {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("equipment_type_id"), rs.getInt("quantity"), rs.getFloat("time_limit"),rs.getString("equipment_status_id"));
                usersList.add(user);
                
                
                }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
         return usersList;
    }
    
    
    
    public void show_user()
    {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)item_tableedit.getModel();
        
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++)
        {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).qetequipment_type_id();
            row[3]=list.get(i).getquantity();
            row[4]=list.get(i).gettime_limit();
            row[5]=list.get(i).getequipment_status_id(); 
            
           
            model.addRow(row);
         
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        item_tableedit = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameedit = new javax.swing.JTextField();
        quantityedit = new javax.swing.JTextField();
        combotypeedit = new javax.swing.JComboBox<>();
        combostatusedit = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit Equipments");

        item_tableedit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Equipment Name", "Equipment Type", "Quantity", "Time Limit", "Status"
            }
        ));
        item_tableedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_tableeditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(item_tableedit);

        jLabel2.setText("Name");

        jLabel3.setText("Quantity");

        jLabel4.setText("Type");

        jLabel5.setText("Status");

        nameedit.setText(" ");
        nameedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameeditActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updatebtnMouseReleased(evt);
            }
        });
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(nameedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantityedit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combostatusedit, 0, 138, Short.MAX_VALUE)
                                    .addComponent(combotypeedit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updatebtn)
                                .addGap(28, 28, 28)
                                .addComponent(deletebtn)))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantityedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combotypeedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combostatusedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn)
                            .addComponent(deletebtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameeditActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            int row = item_tableedit.getSelectedRow();
            String value = (item_tableedit.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE equipments SET name =?, quantity=? where id="+value;
            
             PreparedStatement pstmt = con.prepareStatement(query);
//            
            pstmt.setString(1, nameedit.getText());
            pstmt.setInt(2, Integer.parseInt(quantityedit.getText()));
            
            
            pstmt.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)item_tableedit.getModel();
            model.setRowCount(0);
            show_user();
            
            JOptionPane.showMessageDialog(null,"Data Updated Succesfully","MESSAGE",JOptionPane.PLAIN_MESSAGE);
          
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
         int opt = JOptionPane.showConfirmDialog(null, "Are you sure? ","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0)
        {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            int row = item_tableedit.getSelectedRow();
            String value = (item_tableedit.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM equipments where id="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)item_tableedit.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null,"Data Deleted Successfully","Message",JOptionPane.PLAIN_MESSAGE);
            
            
            
        }
        
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseReleased
        // TODO add your handling code here:
        nameedit.setText("");
        quantityedit.setText("");
        Equipments_table myobj = new Equipments_table();
        myobj.setVisible(true);
        dispose();
    }//GEN-LAST:event_updatebtnMouseReleased

    private void item_tableeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_tableeditMouseClicked
        // TODO add your handling code here:
        boolean a = item_tableedit.isEditing();
        if(a==false)
        {
            //JOptionPane.showMessageDialog(null, "Cant edit this table");
        }
        int i = item_tableedit.getSelectedRow();
        TableModel model = item_tableedit.getModel();
        //        id.setText(model.getValueAt(i, 0).toString());
        nameedit.setText(model.getValueAt(i, 1).toString());
        quantityedit.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_item_tableeditMouseClicked

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
            java.util.logging.Logger.getLogger(Equipments_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipments_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipments_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipments_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipments_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combostatusedit;
    private javax.swing.JComboBox<String> combotypeedit;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable item_tableedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nameedit;
    public javax.swing.JTextField quantityedit;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
