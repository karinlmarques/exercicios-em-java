package view;

import javax.swing.JOptionPane;
import model.Informatica;

public class MatriculaInformatica extends javax.swing.JInternalFrame {

    Informatica i = new Informatica();

    public MatriculaInformatica() {
        initComponents();
        jTextMatric.setText(i.geraMatricula());
    }

    private void recebeMatricula() {
        if (jCheckBoxBD.isSelected()) {
            i.getDisciplina().add(jCheckBoxBD.getText());
        }
        if (jCheckBoxIngles.isSelected()) {
            i.getDisciplina().add(jCheckBoxIngles.getText());
        }
        if (jCheckBoxJava.isSelected()) {
            i.getDisciplina().add(jCheckBoxJava.getText());
        }
        if (jCheckBoxLogica.isSelected()) {
            i.getDisciplina().add(jCheckBoxLogica.getText());
        }
        if (jCheckBoxMat.isSelected()) {
            i.getDisciplina().add(jCheckBoxMat.getText());
        }
        if (jCheckBoxPHP.isSelected()) {
            i.getDisciplina().add(jCheckBoxPHP.getText());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroupPagamento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextMatric = new javax.swing.JTextField();
        jButtonGerarSenha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxLogica = new javax.swing.JCheckBox();
        jCheckBoxMat = new javax.swing.JCheckBox();
        jCheckBoxIngles = new javax.swing.JCheckBox();
        jCheckBoxBD = new javax.swing.JCheckBox();
        jCheckBoxJava = new javax.swing.JCheckBox();
        jCheckBoxPHP = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jRadioButtonParcela = new javax.swing.JRadioButton();
        jRadioButtonAvista = new javax.swing.JRadioButton();
        jSpinnerNroVzs = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButtonEnviarInfo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Informática"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jLabel1.setText("Nº Matricula:");

        jButtonGerarSenha.setText("Gerar Senha");
        jButtonGerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarSenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Disciplinas");

        jCheckBoxLogica.setText("Lógica");
        jCheckBoxLogica.setActionCommand("Lógica");

        jCheckBoxMat.setText("Matemática");
        jCheckBoxMat.setActionCommand("Matemática");

        jCheckBoxIngles.setText("Inglês");
        jCheckBoxIngles.setActionCommand("Inglês");

        jCheckBoxBD.setText("Banco de dados");
        jCheckBoxBD.setActionCommand("Banco de Dados");

        jCheckBoxJava.setText("JAVA");
        jCheckBoxJava.setActionCommand("JAVA");

        jCheckBoxPHP.setText("PHP");
        jCheckBoxPHP.setActionCommand("PHP");

        jLabel3.setText("Tipo de pagamento:");

        buttonGroupPagamento.add(jRadioButtonParcela);
        jRadioButtonParcela.setText("Parcelado");
        jRadioButtonParcela.setActionCommand("Parcelado");

        buttonGroupPagamento.add(jRadioButtonAvista);
        jRadioButtonAvista.setText("À vista");
        jRadioButtonAvista.setActionCommand("A vista");

        jSpinnerNroVzs.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        jLabel4.setText("Nro de vezes:");

        jButtonEnviarInfo.setText("Enviar");
        jButtonEnviarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarInfoActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jRadioButtonParcela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButtonAvista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerNroVzs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonEnviarInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonParcela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonAvista)
                        .addGap(47, 47, 47))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonEnviarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinnerNroVzs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonParcela)
                    .addComponent(jRadioButtonAvista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerNroVzs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButtonEnviarInfo))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLayeredPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxLogica)
                                    .addComponent(jCheckBoxMat))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxBD)
                                    .addComponent(jCheckBoxIngles)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBoxPHP)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonGerarSenha)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBoxJava)
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerarSenha))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLogica)
                    .addComponent(jCheckBoxIngles)
                    .addComponent(jCheckBoxJava, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMat)
                    .addComponent(jCheckBoxBD)
                    .addComponent(jCheckBoxPHP))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarInfoActionPerformed
        try {
            i.getDisciplina().clear();
            this.recebeMatricula();
            i.setMatricula(jTextMatric.getText());
            i.setTipoPag(buttonGroupPagamento.getSelection().getActionCommand());
            i.setNroVzs((int) jSpinnerNroVzs.getValue());
            JOptionPane.showMessageDialog(this, i.toString(), "Relatório", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro " + e);
        }
    }//GEN-LAST:event_jButtonEnviarInfoActionPerformed

    private void jButtonGerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarSenhaActionPerformed
        i.geraSenha();
    }//GEN-LAST:event_jButtonGerarSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPagamento;
    private javax.swing.JButton jButtonEnviarInfo;
    private javax.swing.JButton jButtonGerarSenha;
    private javax.swing.JCheckBox jCheckBoxBD;
    private javax.swing.JCheckBox jCheckBoxIngles;
    private javax.swing.JCheckBox jCheckBoxJava;
    private javax.swing.JCheckBox jCheckBoxLogica;
    private javax.swing.JCheckBox jCheckBoxMat;
    private javax.swing.JCheckBox jCheckBoxPHP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButtonAvista;
    private javax.swing.JRadioButton jRadioButtonParcela;
    private javax.swing.JSpinner jSpinnerNroVzs;
    private javax.swing.JTextField jTextMatric;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
