/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs;

import java.awt.Color;
//import java.awt.Image;
//import java.awt.Toolkit;
//import javax.swing.ImageIcon;

/**
 *
 * @author Ken Zedric Cortes
 */
public class Homepage extends javax.swing.JFrame {
    
//    private JPanel contentPane;
//    Timer tm1,tm2,tm3;
// // the panels default height = 60
//    Integer pl1 = 60,pl2 = 60,pl3 = 60;
    

    public Homepage() {
        //jTable1.setVisible(false);
        initComponents();
//       ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("header1maliit.png")));
//    
//    Image img1= myimage.getImage();
//    Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
//    ImageIcon i=new ImageIcon(img2);
//    
//    jLabel1.setIcon(i);
    

//        jButton1.setBackground(new Color(255,255,255,2));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnStudents2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel2.setLayout(null);

        btnBack.setBackground(new java.awt.Color(126, 14, 9));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(1030, 580, 40, 50);

        btnStudents.setBackground(new java.awt.Color(204, 204, 204));
        btnStudents.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnStudents.setText("EQUIPMENTS");
        btnStudents.setToolTipText("");
        btnStudents.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudents.setBorderPainted(false);
        btnStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudents.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStudents.setFocusPainted(false);
        btnStudents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudents.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStudents.setIconTextGap(10);
        btnStudents.setSelected(true);
        btnStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentsMouseExited(evt);
            }
        });
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudents);
        btnStudents.setBounds(40, 300, 230, 70);

        btnStudents2.setBackground(new java.awt.Color(204, 204, 204));
        btnStudents2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnStudents2.setText("STUDENTS");
        btnStudents2.setToolTipText("");
        btnStudents2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudents2.setBorderPainted(false);
        btnStudents2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudents2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnStudents2.setFocusPainted(false);
        btnStudents2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudents2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStudents2.setIconTextGap(10);
        btnStudents2.setSelected(true);
        btnStudents2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudents2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudents2MouseExited(evt);
            }
        });
        btnStudents2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudents2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudents2);
        btnStudents2.setBounds(40, 220, 230, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kzcor\\Downloads\\header1maliit.png")); // NOI18N

        jButton3.setBackground(new java.awt.Color(126, 14, 9));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1320, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudents2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudents2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudents2ActionPerformed

    private void btnStudents2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudents2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudents2MouseExited

    private void btnStudents2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudents2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudents2MouseEntered

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentsMouseExited
        btnStudents.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btnStudentsMouseExited

    private void btnStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentsMouseEntered
        btnStudents.setBackground(new Color(126,14,9));
    }//GEN-LAST:event_btnStudentsMouseEntered

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        LoginForm myobj = new LoginForm();
        myobj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnStudents2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
