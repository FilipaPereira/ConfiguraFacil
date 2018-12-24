/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.Componente;
import configurafacil.Business.ConfiguraFacil;
import configurafacil.Business.Encomenda;
import java.util.List;

/**
 *
 * @author jessica
 */
public class Pintura extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private Configuracao parent;
    private EscolherCarro parent2;
    private String pintura = "";
    /**
     * Creates new form Pintura
     */
    public Pintura(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
       super(parent, modal);
       initComponents();
       this.configura = c;
       this.parent = (Configuracao) parent;
       this.parent2 = (EscolherCarro) parent2;
       escrevePrecos();
    }
    
    public void escrevePrecos(){
        String c1 = Cor1.getText();
        String c2 = Cor2.getText();
        String c3 = Cor3.getText();
        String c4 = Cor4.getText();
        
        Double p1 = configura.getComponente(c1).getPreco();
        Double p2 = configura.getComponente(c2).getPreco();
        Double p3 = configura.getComponente(c3).getPreco();
        Double p4 = configura.getComponente(c4).getPreco();
        preco1.setText(Double.toString(p1));
        preco2.setText(Double.toString(p2));
        preco3.setText(Double.toString(p3));
        preco4.setText(Double.toString(p4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cor3 = new javax.swing.JRadioButton();
        Cor1 = new javax.swing.JRadioButton();
        Cor2 = new javax.swing.JRadioButton();
        Cor4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        preco2 = new javax.swing.JTextField();
        preco3 = new javax.swing.JTextField();
        preco4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(Cor3);
        Cor3.setText("Branco");
        Cor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor1);
        Cor1.setText("Cinzento");
        Cor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor2);
        Cor2.setText("Preto");
        Cor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor4);
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

        jLabel2.setText("Preço");

        preco1.setEditable(false);

        preco2.setEditable(false);
        preco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco2ActionPerformed(evt);
            }
        });

        preco3.setEditable(false);

        preco4.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cor1)
                            .addComponent(Cor2)
                            .addComponent(Cor3)
                            .addComponent(Cor4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(preco4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(preco3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(preco2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor1)
                    .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor2)
                    .addComponent(preco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor3)
                    .addComponent(preco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor4)
                    .addComponent(preco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(Cor1.isSelected()) this.pintura = "Cinzento";
        if(Cor2.isSelected()) this.pintura = "Preto";
        if(Cor3.isSelected()) this.pintura = "Branco";
        if(Cor4.isSelected()) this.pintura = "Azul";
        System.out.println(this.parent2.encomenda.getPacote());
        if(this.pintura.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha a pintura","Pintura não selecionada", 0);
        }
        else {
            Encomenda e = this.parent2.encomenda;
            Componente comp = configura.getComponente(this.pintura);
            Componente c = this.configura.verificaTipo("Pintura",e);
            List<String> listInc = e.verificaIncomp(comp,this.configura.getPacote(e.getPacote()));
            List<String> listObrig = e.verificaObrig(comp);
            StringBuilder sbInc = new StringBuilder();
            StringBuilder sbObrig = new StringBuilder();
            for (String i : listObrig){
                sbObrig.append(i);
                sbObrig.append("; ");
            }
            if(!listObrig.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Obrigatórias: " + sbObrig , "Componentes obrigatórias",0);
            }
            for (String i : listInc){
                sbInc.append(i);
                sbInc.append("; ");
            }
            if(!listInc.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Incompatível com: " + sbInc , "Componentes incompatíveis",0);
            }
            else {
                if(c != null){
                    e.removeDaConfiguracao(c.getNome());
                }
                e.addToConfiguracao(comp.getNome());
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void preco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cor1;
    private javax.swing.JRadioButton Cor2;
    private javax.swing.JRadioButton Cor3;
    private javax.swing.JRadioButton Cor4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField preco1;
    private javax.swing.JTextField preco2;
    private javax.swing.JTextField preco3;
    private javax.swing.JTextField preco4;
    // End of variables declaration//GEN-END:variables
}
