/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;


import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class Practica2 extends javax.swing.JFrame {

    /**
     * Creates new form Practica2
     */
    public Practica2() {
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

        lbLimInf = new javax.swing.JLabel();
        lblLimSup = new javax.swing.JLabel();
        spLimInf = new javax.swing.JSpinner();
        spLimSup = new javax.swing.JSpinner();
        lbNumGen = new javax.swing.JLabel();
        tfNumGen = new javax.swing.JTextField();
        btGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbLimInf.setText("Límite inferior");

        lblLimSup.setText("Límite superior");

        spLimInf.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spLimInfStateChanged(evt);
            }
        });

        spLimSup.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spLimSupStateChanged(evt);
            }
        });

        lbNumGen.setText("Número generado");

        tfNumGen.setEditable(false);
        tfNumGen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfNumGen.setText("0");
        tfNumGen.setFocusable(false);
        tfNumGen.setRequestFocusEnabled(false);

        btGenerar.setText("Generar");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLimInf)
                            .addComponent(lblLimSup)
                            .addComponent(lbNumGen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumGen, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLimSup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLimInf, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btGenerar)))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLimInf)
                    .addComponent(spLimInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimSup)
                    .addComponent(spLimSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumGen)
                    .addComponent(tfNumGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btGenerar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed
        // TODO add your handling code here:
        int numGenerado = 0;
        int nLimInf = (int) this.spLimInf.getValue();
        int nLimSup = (int) this.spLimSup.getValue();
        Random oRnd = new Random();
        
        numGenerado = oRnd.nextInt(Math.abs(nLimSup-nLimInf))+nLimInf;
        
        this.tfNumGen.setText(Integer.toString(numGenerado));
        
    }//GEN-LAST:event_btGenerarActionPerformed

    private void spLimInfStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spLimInfStateChanged
        // TODO add your handling code here:
        this.validarLimites();
    }//GEN-LAST:event_spLimInfStateChanged

    private void spLimSupStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spLimSupStateChanged
        // TODO add your handling code here:
        this.validarLimites();
    }//GEN-LAST:event_spLimSupStateChanged

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
            java.util.logging.Logger.getLogger(Practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerar;
    private javax.swing.JLabel lbLimInf;
    private javax.swing.JLabel lbNumGen;
    private javax.swing.JLabel lblLimSup;
    private javax.swing.JSpinner spLimInf;
    private javax.swing.JSpinner spLimSup;
    private javax.swing.JTextField tfNumGen;
    // End of variables declaration//GEN-END:variables

    private void validarLimites() {
        int nLimInf = (int) this.spLimInf.getValue();
        int nLimSup = (int) this.spLimSup.getValue();
        
        if (nLimInf>nLimSup){
            JOptionPane.showMessageDialog(this, "El limite inferior debe ser menor que el limite superior", "Error en valores", JOptionPane.WARNING_MESSAGE);
            this.spLimInf.setValue(this.spLimSup.getValue());
        }
    }
}
