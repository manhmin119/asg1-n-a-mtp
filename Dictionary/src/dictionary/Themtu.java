/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import xuly.IOFile;
import static java.awt.Frame.NORMAL;
import java.sql.Statement;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.control.Tab;
import javax.swing.JOptionPane;

/**
 *
 * @author THE TESSEN
 */
public class Themtu extends javax.swing.JInternalFrame {

    /**
     * Creates new form Themtu
     */
    public Themtu() {   
        setLocation(110,60);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfWord = new javax.swing.JTextField();
        jltu = new javax.swing.JLabel();
        jlnghia = new javax.swing.JLabel();
        tfMeaning = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        byCancel = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setMaximizable(true);
        setTitle("Add");
        setToolTipText("");
        setAutoscrolls(true);
        setLayer(3);
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        tfWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWordActionPerformed(evt);
            }
        });

        jltu.setText("Word");

        jlnghia.setText("Meaning");

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        byCancel.setText("Cancel");
        byCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlnghia)
                    .addComponent(jltu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfWord, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(tfMeaning))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(byCancel)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jltu))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlnghia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk)
                    .addComponent(byCancel))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        // TODO add your handling code here:
        if(tfWord.getText().equals("")||tfMeaning.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Bạn phải nhập cả từ và nghĩa","Error",NORMAL);
        else{
            
         //   ListW
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void byCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byCancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);   
    }//GEN-LAST:event_byCancelActionPerformed

    private void tfWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfWordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JButton byCancel;
    private javax.swing.JLabel jlnghia;
    private javax.swing.JLabel jltu;
    private javax.swing.JTextField tfMeaning;
    private javax.swing.JTextField tfWord;
    // End of variables declaration//GEN-END:variables
}
