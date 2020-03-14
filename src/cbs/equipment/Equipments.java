/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.equipment;


//import com.lowagie.text.Document;
//import com.lowagie.text.DocumentException;
//import com.lowagie.text.pdf.PdfPTable;
//import com.lowagie.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
//import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Admin
 */
public class Equipments extends javax.swing.JFrame {

    /**
     * Creates new form Equipments
     * 
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    Vector model = new Vector();
    private ArrayList<Integer> equipmentStatus;
    private ArrayList<Integer> equipmentType;
    
    public Equipments() {
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
                combotype.addItem(name);
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
                combostatus.addItem(name);
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
//        DefaultTableModel model = (DefaultTableModel)item_table.getModel();
        
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++)
        {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).qetequipment_type_id();
            row[3]=list.get(i).getquantity();
            row[4]=list.get(i).gettime_limit();
            row[5]=list.get(i).getequipment_status_id(); 
            
           
//            model.addRow(row);
         
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combotype = new javax.swing.JComboBox<>();
        combostatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Quantity");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submitMouseReleased(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Add Equipment(s)");

        jLabel5.setText("Type");

        jLabel6.setText("Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(clear))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(42, 42, 42)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantity)
                                    .addComponent(name)
                                    .addComponent(combotype, 0, 140, Short.MAX_VALUE)
                                    .addComponent(combostatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combostatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(clear))
                .addGap(122, 122, 122))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbs_db","root", "");
            String sql = "INSERT INTO `equipments`(`name`, `equipment_type_id`,  `quantity`,  `equipment_status_id`) VALUES (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, name.getText());
            
            String itm;
//            itm = combotype.getSelectedItem().toString();
              pstmt.setInt(2, equipmentType.get(combotype.getSelectedIndex()));
            
            pstmt.setInt(3, Integer.parseInt(quantity.getText()));
            
            
            String itm1;
//            itm1 = combostatus.getSelectedItem().toString();
            pstmt.setInt(4, equipmentStatus.get(combostatus.getSelectedIndex()));
            
            pstmt.executeUpdate();
//            DefaultTableModel model = (DefaultTableModel)item_table.getModel();
//            model.setRowCount(0);
            show_user();
            
            JOptionPane.showMessageDialog(null,"Data Added Succesfully","MESSAGE",JOptionPane.PLAIN_MESSAGE);
            con.close();
//            show_user();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        quantity.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseReleased
        // TODO add your handling code here:
        name.setText("");
        quantity.setText("");
        combotype.setSelectedIndex(0);
        combostatus.setSelectedIndex(0);
        Equipments_table myobj = new Equipments_table();
        myobj.setVisible(true);
        dispose();
    }//GEN-LAST:event_submitMouseReleased

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
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> combostatus;
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
