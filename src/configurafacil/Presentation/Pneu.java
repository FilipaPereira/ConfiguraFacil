/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.ConfiguraFacil;
import java.util.List;

/**
 *
 * @author Grupo 30
 */
public class Pneu extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private String pneu = "";
    private Configuracao parent;
    private EscolherCarro parent2;
      
    /**
     * Creates new form Pneu
     */
    public Pneu(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
       super(parent, modal);
       initComponents();
       this.configura = c;
       this.parent = (Configuracao) parent;
       this.parent2 = (EscolherCarro) parent2;
       escrevePrecos();
    }
    
    public void escrevePrecos(){
        String c1 = Pneu1.getText();
        String c2 = Pneu2.getText();
        String c3 = Pneu3.getText();
        String c4 = Pneu4.getText();
        
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
        Pneu1 = new javax.swing.JRadioButton();
        Pneu2 = new javax.swing.JRadioButton();
        Pneu3 = new javax.swing.JRadioButton();
        Pneu4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        preco2 = new javax.swing.JTextField();
        preco3 = new javax.swing.JTextField();
        preco4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(Pneu1);
        Pneu1.setText("Bridgestone Turanza T005 205/55 R16 91V");
        Pneu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu2);
        Pneu2.setText("Continental ContiEcoContact 5 205/55 R16 91V");
        Pneu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu3);
        Pneu3.setText("Continental PremiumContact 6 205/55 R16 91H");
        Pneu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu4);
        Pneu4.setText("Firestone Roadhawk 205/55 R16 91H");
        Pneu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu4ActionPerformed(evt);
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

        jLabel1.setText("Pneu");

        preco1.setEditable(false);

        preco2.setEditable(false);

        preco3.setEditable(false);

        preco4.setEditable(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Pneu3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pneu2)
                                    .addComponent(Pneu1)))
                            .addComponent(Pneu4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preco1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(preco2)
                            .addComponent(preco3)
                            .addComponent(preco4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pneu1)
                    .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pneu2)
                    .addComponent(preco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pneu3)
                    .addComponent(preco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pneu4)
                    .addComponent(preco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pneu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu1ActionPerformed

    private void Pneu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu2ActionPerformed

    private void Pneu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu3ActionPerformed

    private void Pneu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         if(Pneu1.isSelected()) this.pneu = Pneu1.getText();
        if(Pneu2.isSelected()) this.pneu = Pneu2.getText();
        if(Pneu3.isSelected()) this.pneu = Pneu3.getText();
        if(Pneu4.isSelected()) this.pneu = Pneu4.getText();
        if(this.pneu.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha um pneu","Pneu não selecionado", 0);
        }
        else {
            List<String> componentes = this.parent.getComponentes();
            String p = this.parent.getPacote(); 
            String c = this.configura.verificaTipo("Pneu",this.parent.getComponentes());
            List<String> listInc = this.configura.verificaIncomp(this.pneu,componentes,p);
            List<String> listObrig =  this.configura.verificaObrig(this.pneu,componentes);
            String sbInc = this.configura.listaComponentes(listInc);
            String sbObrig = this.configura.listaComponentes(listObrig);
            if(!listObrig.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Obrigatórias: " + sbObrig , "Componentes obrigatórias",0);
            }
            if(!listInc.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Incompatível com: " + sbInc , "Componentes incompatíveis",0);
            }
            else {
                if(c != null){
                   this.parent.removeComponente(c);
                }
                this.parent.addComponente(this.pneu);
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void preco4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Pneu1;
    private javax.swing.JRadioButton Pneu2;
    private javax.swing.JRadioButton Pneu3;
    private javax.swing.JRadioButton Pneu4;
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
