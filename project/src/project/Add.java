/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author mattw
 */
public class Add extends javax.swing.JFrame {
    DataBaseConnection db = new DataBaseConnection();

    /**
     * Creates new form Add
     */
    public Add() {
        initComponents();
        db = new DataBaseConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelSymbol = new javax.swing.JLabel();
        jLabelCredits = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldCredits = new javax.swing.JTextField();
        jTextFieldSymbol = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jButtonAfter = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/maryville.jpg"))); // NOI18N

        jLabelName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelName.setText("Class Name");

        jLabelSymbol.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelSymbol.setText("Class Symbol");

        jLabelCredits.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelCredits.setText("Credits");

        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldCredits.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreditsActionPerformed(evt);
            }
        });

        jTextFieldSymbol.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSymbolActionPerformed(evt);
            }
        });

        jTextFieldID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelID.setText("Class ID");

        jButtonAfter.setBackground(new java.awt.Color(255, 51, 51));
        jButtonAfter.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonAfter.setText("BACK");
        jButtonAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAfterActionPerformed(evt);
            }
        });

        jButtonModify.setBackground(new java.awt.Color(255, 51, 51));
        jButtonModify.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonModify.setText("MODIFY");
        jButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(255, 51, 51));
        jButtonAdd.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSymbol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCredits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jTextFieldCredits)
                            .addComponent(jTextFieldID)
                            .addComponent(jTextFieldName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabelIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModify, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreditsActionPerformed

    private void jTextFieldSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSymbolActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfterActionPerformed
        // TODO add your handling code here:
        After a = new After();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAfterActionPerformed

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyActionPerformed
        // TODO add your handling code here:
        try {
            String query = "UPDATE classes SET class_id = ?, name = ?, symbol = ?, credits = ? WHERE class_id = ?";
            PreparedStatement pst = db.con.prepareStatement(query);
            pst.setString(1, jTextFieldID.getText());
            pst.setString(2, jTextFieldName.getText());
            pst.setString(3, jTextFieldSymbol.getText());
            pst.setString(4, jTextFieldCredits.getText());
            pst.setString(5, jTextFieldID.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            
            pst.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonModifyActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO classes (class_id, name, symbol, credits) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = db.con.prepareStatement(query);
            pst.setString(1, jTextFieldID.getText());
            pst.setString(2, jTextFieldName.getText());
            pst.setString(3, jTextFieldSymbol.getText());
            pst.setString(4, jTextFieldCredits.getText());
            
            
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            
            pst.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String query = "DELETE FROM classes WHERE class_id = ?";
            PreparedStatement pst = db.con.prepareStatement(query);
            pst.setString(1, jTextFieldID.getText());
            
            
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            
            pst.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAfter;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JLabel jLabelCredits;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JTextField jTextFieldCredits;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSymbol;
    // End of variables declaration//GEN-END:variables
}