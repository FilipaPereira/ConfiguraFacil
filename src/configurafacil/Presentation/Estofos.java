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
 * @author utilizador
 */
public class Estofos extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private String estofo = "";
    private Configuracao parent;
    private EscolherCarro parent2;
    
    /**
     * Creates new form Estofos
     */
    public Estofos(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
       super(parent, modal);
       initComponents();
       this.configura = c;
       this.parent = (Configuracao) parent;
       this.parent2 = (EscolherCarro) parent2;
       escrevePrecos();
    }
    
    
    public void escrevePrecos(){
        String c1 = Estofo1.getText();
        String c2 = Estofo2.getText();
        String c3 = Estofo3.getText();
        String c4 = Estofo4.getText();
        
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
        Estofo1 = new javax.swing.JRadioButton();
        Estofo2 = new javax.swing.JRadioButton();
        Estofo3 = new javax.swing.JRadioButton();
        Estofo4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        preco2 = new javax.swing.JTextField();
        preco3 = new javax.swing.JTextField();
        preco4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        buttonGroup1.add(Estofo1);
        Estofo1.setText("Couro comfort carvão");
        Estofo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estofo1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Estofo2);
        Estofo2.setText("Couro comfort âmbar");
        Estofo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estofo2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Estofo3);
        Estofo3.setText("Couro comfort maroon brown");
        Estofo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estofo3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Estofo4);
        Estofo4.setText("Couro comfort blond");
        Estofo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estofo4ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Estofos");

        preco1.setEditable(false);

        preco2.setEditable(false);

        preco3.setEditable(false);

        preco4.setEditable(false);
        preco4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        preco4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estofo2)
                    .addComponent(Estofo1)
                    .addComponent(Estofo4)
                    .addComponent(Estofo3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preco3)
                    .addComponent(preco2)
                    .addComponent(preco4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(preco1))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estofo1)
                            .addComponent(preco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estofo2)
                            .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Estofo3))
                    .addComponent(preco2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estofo4)
                    .addComponent(preco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Estofo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estofo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Estofo1ActionPerformed

    private void Estofo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estofo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Estofo2ActionPerformed

    private void Estofo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estofo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Estofo3ActionPerformed

    private void Estofo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estofo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Estofo4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(Estofo1.isSelected()) this.estofo = "Couro comfort carvão";
        if(Estofo2.isSelected()) this.estofo = "Couro comfort âmbar";
        if(Estofo3.isSelected()) this.estofo = "Couro comfort maroon brown";
        if(Estofo4.isSelected()) this.estofo = "Couro comfort blond";
        if(this.estofo.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha um estofo","Estofo não selecionado", 0);
        }
        else {
            Encomenda e = this.parent2.encomenda;
            Componente comp = configura.getComponente(this.estofo);
            Componente c = this.configura.verificaTipo("Estofo",e);
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
    }//GEN-LAST:event_jButton1MouseClicked

    private void preco4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Estofo1;
    private javax.swing.JRadioButton Estofo2;
    private javax.swing.JRadioButton Estofo3;
    private javax.swing.JRadioButton Estofo4;
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
