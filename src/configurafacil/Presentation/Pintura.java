/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

/**
 *
 * @author jessica
 */
public class Pintura extends javax.swing.JDialog {
    public static EscolherCarro c;
    private String pintura = "";
    /**
     * Creates new form Pintura
     */
    public Pintura(EscolherCarro parent, boolean modal) {
       this.c = parent;
       this.setModal(modal);
       initComponents();
       setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cor3 = new javax.swing.JRadioButton();
        Cor1 = new javax.swing.JRadioButton();
        Cor2 = new javax.swing.JRadioButton();
        Cor4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cor3.setText("Branco");
        Cor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor3ActionPerformed(evt);
            }
        });

        Cor1.setText("Cinzento");
        Cor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor1ActionPerformed(evt);
            }
        });

        Cor2.setText("Preto");
        Cor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor2ActionPerformed(evt);
            }
        });

        Cor4.setText("Azul");
        Cor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor4ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pintura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cor4)
                            .addComponent(Cor3)
                            .addComponent(Cor2)
                            .addComponent(Cor1))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cor1)
                .addGap(18, 18, 18)
                .addComponent(Cor2)
                .addGap(18, 18, 18)
                .addComponent(Cor3)
                .addGap(18, 18, 18)
                .addComponent(Cor4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor1ActionPerformed

    private void Cor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor2ActionPerformed

    private void Cor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor3ActionPerformed

    private void Cor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Cor1.isSelected()) this.pintura = "Cizento";
        if(Cor2.isSelected()) this.pintura = "Preto";
        if(Cor3.isSelected()) this.pintura = "Branco";
        if(Cor4.isSelected()) this.pintura = "Azul";
        if(this.pintura.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha a pintura","Pintura não selecionada", 0);
        }
        else {
            c.encomenda.addToConfiguração(this.pintura);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pintura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pintura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pintura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pintura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Pintura dialog = new Pintura(c, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cor1;
    private javax.swing.JRadioButton Cor2;
    private javax.swing.JRadioButton Cor3;
    private javax.swing.JRadioButton Cor4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
