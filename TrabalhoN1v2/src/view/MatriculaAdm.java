package view;

import javax.swing.JOptionPane;
import model.Administracao;

public class MatriculaAdm extends javax.swing.JInternalFrame {

    Administracao ad = new Administracao();
    String matricula;

    public MatriculaAdm() {
        initComponents();
        //this.matricula =;
        jTextNroMatric.setText(ad.geraMatricula());
    }

    private void recebeMatricula() {
        if (jCheckBoxTga.isSelected()) {
            ad.getDisciplina().add(jCheckBoxTga.getText());
        }
        if (jCheckBoxIntAdm.isSelected()) {
            ad.getDisciplina().add(jCheckBoxIntAdm.getText());
        }
        if (jCheckBoxMatFinan.isSelected()) {
            ad.getDisciplina().add(jCheckBoxMatFinan.getText());
        }
        if (jCheckBoxCont.isSelected()) {
            ad.getDisciplina().add(jCheckBoxCont.getText());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroupTipoPag = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextNroMatric = new javax.swing.JTextField();
        jButtonGeraSenha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxTga = new javax.swing.JCheckBox();
        jCheckBoxMatFinan = new javax.swing.JCheckBox();
        jCheckBoxCont = new javax.swing.JCheckBox();
        jCheckBoxIntAdm = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jRadioButtonPrazo = new javax.swing.JRadioButton();
        jRadioButtonAV = new javax.swing.JRadioButton();
        jSpinnerVzs = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButtonEnviarAdm = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Administração"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jLabel1.setText("Nº Matricula");

        jButtonGeraSenha.setText("Gerar Senha");
        jButtonGeraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeraSenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Disciplinas:");

        jCheckBoxTga.setText("TGA");
        jCheckBoxTga.setActionCommand("TGA");

        jCheckBoxMatFinan.setText("Mat. Financeira");
        jCheckBoxMatFinan.setActionCommand("Mat. Financeira");

        jCheckBoxCont.setText("Contabilidade");
        jCheckBoxCont.setActionCommand("Contabilidade");

        jCheckBoxIntAdm.setText("Introdução ADM");
        jCheckBoxIntAdm.setActionCommand("Introdução ADM");

        jLabel3.setText("Tipo de pagamento:");

        buttonGroupTipoPag.add(jRadioButtonPrazo);
        jRadioButtonPrazo.setText("Parcelado");
        jRadioButtonPrazo.setActionCommand("Parcelado");
        jRadioButtonPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPrazoActionPerformed(evt);
            }
        });

        buttonGroupTipoPag.add(jRadioButtonAV);
        jRadioButtonAV.setText("À vista");
        jRadioButtonAV.setActionCommand("A vista");

        jSpinnerVzs.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        jLabel4.setText("Nro Vezes");

        jButtonEnviarAdm.setText("Enviar");
        jButtonEnviarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarAdmActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jRadioButtonPrazo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButtonAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerVzs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonEnviarAdm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jRadioButtonPrazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonAV)
                .addGap(62, 62, 62))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerVzs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButtonEnviarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPrazo)
                    .addComponent(jRadioButtonAV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerVzs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButtonEnviarAdm))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxMatFinan)
                                    .addComponent(jCheckBoxTga))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxCont)
                                    .addComponent(jCheckBoxIntAdm)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextNroMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButtonGeraSenha)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNroMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGeraSenha))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxTga)
                    .addComponent(jCheckBoxCont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxIntAdm)
                    .addComponent(jCheckBoxMatFinan))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPrazoActionPerformed
    }//GEN-LAST:event_jRadioButtonPrazoActionPerformed

    private void jButtonGeraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraSenhaActionPerformed
        ad.geraSenha();
    }//GEN-LAST:event_jButtonGeraSenhaActionPerformed

    private void jButtonEnviarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarAdmActionPerformed
        try {
            JOptionPane.showMessageDialog(this, jTextNroMatric.getText());
            ad.setMatricula(jTextNroMatric.getText());
            ad.getDisciplina().clear();
            this.recebeMatricula();
            ad.setTipoPag(buttonGroupTipoPag.getSelection().getActionCommand());
            ad.setNroVzs((int) jSpinnerVzs.getValue());
            JOptionPane.showMessageDialog(this, ad.toString(), "Relatório", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButtonEnviarAdmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoPag;
    private javax.swing.JButton jButtonEnviarAdm;
    private javax.swing.JButton jButtonGeraSenha;
    private javax.swing.JCheckBox jCheckBoxCont;
    private javax.swing.JCheckBox jCheckBoxIntAdm;
    private javax.swing.JCheckBox jCheckBoxMatFinan;
    private javax.swing.JCheckBox jCheckBoxTga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButtonAV;
    private javax.swing.JRadioButton jRadioButtonPrazo;
    private javax.swing.JSpinner jSpinnerVzs;
    private javax.swing.JTextField jTextNroMatric;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
