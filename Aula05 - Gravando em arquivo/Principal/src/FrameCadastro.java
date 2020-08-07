
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usrlab06
 */
public class FrameCadastro extends javax.swing.JFrame {

    /**
     * Creates new form NJPrincipal
     */
    public FrameCadastro() {
        initComponents();
    }
    
    public void limparCampos(){
            jTFNome.setText("");
            jTFTelefone.setText("");
            jComboBoxProfissao.setSelectedIndex(-1);
            jTAObservacao.setText("");
            jCheckWhatsApp.setSelected(false);
            buttonGroup1.clearSelection();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jLabelProfissao = new javax.swing.JLabel();
        jComboBoxProfissao = new javax.swing.JComboBox<>();
        jLabelObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObservacao = new javax.swing.JTextArea();
        jLabelGenero = new javax.swing.JLabel();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFeminino = new javax.swing.JRadioButton();
        jTBSalvar = new javax.swing.JToggleButton();
        jTBConsultar = new javax.swing.JToggleButton();
        jCheckWhatsApp = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLabelTelefone.setText("Telefone:");

        jLabelProfissao.setText("Profissão:");

        jComboBoxProfissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analista", "Estudante", "Motorista" }));
        jComboBoxProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfissaoActionPerformed(evt);
            }
        });

        jLabelObservacao.setText("Observacoes:");

        jTAObservacao.setColumns(20);
        jTAObservacao.setRows(5);
        jScrollPane1.setViewportView(jTAObservacao);

        jLabelGenero.setText("Gênero:");

        buttonGroup1.add(jRBMasculino);
        jRBMasculino.setText("Masculino");

        buttonGroup1.add(jRBFeminino);
        jRBFeminino.setText("Feminino");

        jTBSalvar.setText("Salvar");
        jTBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBSalvarActionPerformed(evt);
            }
        });

        jTBConsultar.setText("Consultar");
        jTBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBConsultarActionPerformed(evt);
            }
        });

        jCheckWhatsApp.setText("WhatsApp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jTBConsultar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jLabelObservacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jRBFeminino)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxProfissao, javax.swing.GroupLayout.Alignment.LEADING, 0, 105, Short.MAX_VALUE)
                            .addComponent(jLabelProfissao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGenero)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckWhatsApp)
                                    .addComponent(jRBMasculino))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckWhatsApp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelProfissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBSalvar)
                    .addComponent(jTBConsultar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jComboBoxProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfissaoActionPerformed

    private void jTBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBSalvarActionPerformed
        Pessoa pessoa = new Pessoa();
        pessoa.nome = jTFNome.getText();
        pessoa.telefone = jTFTelefone.getText();
        if(jCheckWhatsApp.isSelected()){
            pessoa.whatsApp = true;
        }
        else {
            pessoa.whatsApp = false;
        }
        pessoa.profissao = jComboBoxProfissao.getSelectedItem() + "";
        pessoa.obervacoes = jTAObservacao.getText();
        if(jRBMasculino.isSelected()){
            pessoa.genero='M';
        }
        else {
            pessoa.genero='F';
        }
        Arquivo arquivo = new Arquivo();
        arquivo.salvar(pessoa);
        JOptionPane.showMessageDialog(this, "A pessoa " + pessoa.nome + " Foi cadastrada no arquivo");
        limparCampos();
    }//GEN-LAST:event_jTBSalvarActionPerformed

    private void jTBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBConsultarActionPerformed
        Arquivo arquivo = new Arquivo();
        String vetor[] = arquivo.consultar(jTFNome.getText());
        jTFTelefone.setText(vetor[1]);
        jComboBoxProfissao.setSelectedItem(vetor[2]);
    }//GEN-LAST:event_jTBConsultarActionPerformed
                               
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
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckWhatsApp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxProfissao;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelProfissao;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAObservacao;
    private javax.swing.JToggleButton jTBConsultar;
    private javax.swing.JToggleButton jTBSalvar;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}