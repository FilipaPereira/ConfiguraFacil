/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.ConfiguraFacil;
import configurafacil.Business.Stand.Cliente;

/**
 *
 * @author Grupo 30
 */
public class DadosCliente extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private String cliente;
    private double limiteEnc;
    
    /**
     * Creates new form DadosCliente
     */
    public DadosCliente(javax.swing.JDialog parent, boolean modal, ConfiguraFacil c) {
        super(parent, modal);
        initComponents();
        this.configura = c;
        this.limiteEnc = -1;
    }
    
    public String getCliente(){
        return this.cliente;
    }
    
    public double getLimite(){
        return this.limiteEnc;
    }
    
    private boolean validaDados() {
        boolean vazio = this.nome.getText().isEmpty() || 
                this.nif.getText().isEmpty()
                || this.contacto.getText().isEmpty() || 
                (checkLimite.isSelected() && this.limite.getText().isEmpty());
        
        if (vazio)
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor preencha todos os dados.", "Dados incompletos", 0);
        
        return !vazio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        nif = new javax.swing.JTextField();
        contacto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        checkLimite = new javax.swing.JRadioButton();
        limite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("NIF");

        jLabel3.setText("Contacto");

        jButton2.setText("Escolher carro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        checkLimite.setText("Limite preço?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(checkLimite)
                        .addGap(18, 18, 18)
                        .addComponent(limite, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(nif)
                            .addComponent(contacto))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkLimite)
                    .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double limite = 0;
        if (this.validaDados()) {
            this.cliente = this.nif.getText();
            String nome = this.nome.getText();
            String nif = this.nif.getText();
            String contacto = this.contacto.getText();
            Cliente c = null;
            if(checkLimite.isSelected()) limiteEnc = Double.parseDouble(this.limite.getText());
            if(!this.configura.getStand().getClientes().containsKey(nif)){
                c = new Cliente(nome,nif,contacto,null);
                this.configura.getStand().addCliente(c);
            }
            this.setVisible(false);
            new EscolherCarro(this, true, configura).setVisible(true); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton checkLimite;
    private javax.swing.JTextField contacto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField limite;
    private javax.swing.JTextField nif;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
