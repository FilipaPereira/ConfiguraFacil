/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.ConfiguraFacil;
import configurafacil.Business.Encomenda;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 30
 */
public class DetalhesEncomenda extends javax.swing.JDialog {
    private ListaEncomendas parent;
    private static ConfiguraFacil configura;
    DefaultTableModel model;
    int row = 0;
    /**
     * Creates new form DetalhesEncomenda
     */
    public DetalhesEncomenda(javax.swing.JDialog parent, boolean modal, ConfiguraFacil c) {
        super(parent, modal);
        initComponents();
        this.configura = c;
        this.parent = (ListaEncomendas) parent;
        setLocationRelativeTo(this);
        preencheDetalhes();    
    }

    private void preencheDetalhes(){
        int n = (Integer) this.parent.model.getValueAt(this.parent.row,0);  
        model =  (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[1];
        Encomenda e = this.configura.getEncomenda(n);
        for(String c: e.getConfig()){
            rowData[0] = c;
            model.addRow(rowData);
        }
        if(e.getPacote()!=null){
            rowData[0] = e.getPacote();
            model.addRow(rowData);
        } 
        rowData[0] = e.getCarro();
        model.addRow(rowData);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detalhes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Por em execução");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Encomenda");

        jButton2.setText("Finalizar encomenda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int n = (Integer) this.parent.model.getValueAt(this.parent.row,0); 
        Encomenda e =  this.configura.getEncomenda(n);
        boolean executavel = true;
        for(String c: e.getConfig()){
            if(this.configura.verificaStock(c) == 0){
               executavel = false;
               javax.swing.JOptionPane.showMessageDialog(this, "Não há stock suficiente.", "Stock indisponivel", 0);
               this.setVisible(false);
               break;
            }
        }
        if(executavel){
            this.configura.alterarEstado(e,1);
            this.parent.alteraEstadoTab(1);
            this.configura.diminuiStock(e);
            this.setVisible(false);
        }
        else this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int n = (Integer) this.parent.model.getValueAt(this.parent.row,0); 
        Encomenda e =  this.configura.getEncomenda(n);
        if(e.getEstado() == 1){
            this.configura.alterarEstado(e,2);
            this.parent.alteraEstadoTab(2);
            this.setVisible(false);
        }
        else javax.swing.JOptionPane.showMessageDialog(this,"A encomenda não se encontra em execução.", "Encomenda não finalizada", 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
