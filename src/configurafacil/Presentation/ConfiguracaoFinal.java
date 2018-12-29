/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.ConfiguraFacil;
import configurafacil.Business.Fabrica.GestaoEncomenda.Componente;
import configurafacil.Business.Fabrica.GestaoEncomenda.Pacote;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 30
 */
public class ConfiguracaoFinal extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    DefaultTableModel model;
    private int row = 0;
    private Configuracao parent;
    private EscolherCarro parent2;
    private String componente = "";
    private String pacoteSelect = null;
    private String pacote = null;
    private String nome;
    private double preco = 0;
    List<String> config = new ArrayList<>();
    
    /**
     * Creates new form ConfiguracaoFinal
     */
    public ConfiguracaoFinal(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
        super(parent, modal);
        initComponents();
        this.configura = c;
        this.parent = (Configuracao) parent;
        this.parent2 = (EscolherCarro) parent2;
        config = this.parent2.encomenda.getConfig();
        pacote = this.parent2.encomenda.getPacote();
        insereConfigTabela();
        precoTotal.setText(Double.toString(preco));
        
    }

    public void insereConfigTabela(){
        model =  (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[2];
        for(String s : config){
            Componente c = this.configura.getComponente(s);
            rowData[0] = c.getNome();
            rowData[1] = c.getPreco();
            model.addRow(rowData);
            preco += c.getPreco();
        }
        String p = this.parent2.encomenda.getPacote();
        if(p!=null) { 
            rowData[0] = this.configura.getPacote(p).getNome();
            rowData[1] = this.configura.getPacote(p).getPreco();
            model.addRow(rowData);
            preco += this.configura.getPacote(p).getPreco();
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

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        precoTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Componente", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Configuração Final");

        precoTotal.setEditable(false);

        jLabel2.setText("Preço Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(jLabel1))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model =  (DefaultTableModel) jTable1.getModel();
        Componente c = null;
        Pacote p = null;
        if (!componente.isEmpty()){
            c = this.configura.getComponente(componente);
            this.parent2.encomenda.removeDaConfiguracao(componente);
            preco -= c.getPreco();
            if(c.getTipo().equals("Teto")) this.parent.setTeto();
            else if(c.getTipo().equals("Pára-choque")) this.parent.setParaChoques();
            else if(c.getTipo().equals("Luzes")) this.parent.setLuz();
            else if(c.getTipo().equals("Vidro")) this.parent.setVidro();
        }
        else if (pacoteSelect!=null){
            p = this.configura.getPacote(pacoteSelect);
            this.parent2.encomenda.setPacote(null);
            System.out.println("pa" + this.parent2.encomenda.getPacote());
            preco -= p.getPreco();
            this.parent.setPacotes();
            pacoteSelect = null;
        }
        model.removeRow(row);
        precoTotal.setText(Double.toString(preco));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        nome = (String)model.getValueAt(row, 0);
        System.out.println("nome" + nome);
        for(String c : config)
            if(c.equals(nome))
                this.componente = c;
       if(pacote!=null && pacote.equals(nome))
                this.pacoteSelect = nome;
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField precoTotal;
    // End of variables declaration//GEN-END:variables
}
