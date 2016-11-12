package br.com.core.softpet.ui.animal;

import br.com.core.softpet.app.Main;
import br.com.core.softpet.controller.AnimalController;
import br.com.core.softpet.util.enums.EnumAcaoTela;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Animal;
import br.com.core.softpet.model.Cliente;
import br.com.core.softpet.model.Raca;
import br.com.core.softpet.ui.IFormularioCadastro;
import br.com.core.softpet.ui.IFormularioLista;
import br.com.core.softpet.util.DecimalFormattedField;
import br.com.core.softpet.util.model.combo.ModeloComboCliente;
import br.com.core.softpet.util.model.combo.ModeloComboRaca;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormAnimal extends javax.swing.JInternalFrame implements IFormularioCadastro {

    private Animal animal;
    private AnimalController animalController;
    private IFormularioLista fl;
    private List<Animal> lista;
    private EnumAcaoTela acaoTela;
    private EnumTipoPesquisa tipoPesquisa;
    private ModeloComboRaca modeloComboRaca;
    private ModeloComboCliente modeloComboCliente;

    public FormAnimal(EnumAcaoTela acaoTela, IFormularioLista fl, Animal animal) {
        entrarTela();
        this.fl = fl;
        this.acaoTela = acaoTela;
        switch (acaoTela.getCodigo()) {
            case 1:
                break;
            case 2:
                this.animal = animal;
                this.txtNome.setText(animal.getNome());
                this.cboCliente.getModel().setSelectedItem(animal.getCliente());
                this.cboRaca.getModel().setSelectedItem(animal.getRaca());
                this.dpNascimento.setDate(animal.getNascimento());
                this.cbSexo.setSelected(animal.getSexo());                
                this.txtPeso.setText(animal.getPeso().toString());                
                this.txtCor.setText(animal.getCor());
                this.txtObservacao.setText(animal.getObservacao());
                break;
            case 3:
                this.animal = animal;
                this.txtNome.setText(animal.getNome());
                this.cboCliente.getModel().setSelectedItem(animal.getCliente());
                this.cboRaca.getModel().setSelectedItem(animal.getRaca());
                this.dpNascimento.setDate(animal.getNascimento());
                this.cbSexo.setSelected(animal.getSexo());
                this.txtPeso.setText(animal.getPeso().toString());                
                this.txtCor.setText(animal.getCor());
                this.txtObservacao.setText(animal.getObservacao());

                this.pnlDados.setEnabled(false);
                this.txtNome.setEnabled(false);
                this.cboCliente.setEnabled(false);
                this.cboRaca.setEnabled(false);
                this.txtPeso.setEnabled(false);
                this.cbSexo.setEnabled(false);
                this.txtCor.setEnabled(false);
                this.txtObservacao.setEnabled(false);
                this.dpNascimento.setEnabled(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basicJYButtonUI1 = new de.javasoft.swing.plaf.basic.BasicJYButtonUI();
        pnlDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cboRaca = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        dpNascimento = new org.jdesktop.swingx.JXDatePicker();
        txtPeso = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Animais");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Nome:");

        jLabel2.setText("Cor:");

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        jLabel10.setText("Observação:");

        cbSexo.setText("Macho");

        jLabel3.setText("Nascimento:");

        jLabel4.setText("Peso:");

        jLabel7.setText("Cliente:"); // NOI18N

        jLabel8.setText("Raça:"); // NOI18N

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(11, 11, 11)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboRaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDadosLayout.createSequentialGroup()
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlDadosLayout.createSequentialGroup()
                                        .addComponent(dpNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbSexo))))))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSexo)
                    .addComponent(dpNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\cross.png")); // NOI18N
        btnCancelar.setToolTipText("Cancelar operação");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\accept.png")); // NOI18N
        btnSalvar.setToolTipText("Salvar registro");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validarEntidade()) {
            switch (this.acaoTela.getCodigo()) {
                case 1:
                    animalController.salvar(animal);
                    JOptionPane.showMessageDialog(null, "Animal inserido com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    animalController.alterar(animal);
                    JOptionPane.showMessageDialog(null, "Animal alterado com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            this.fl.montarTabela(tipoPesquisa.TUDO);
            this.dispose();
        }
}//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
}//GEN-LAST:event_btnCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.javasoft.swing.plaf.basic.BasicJYButtonUI basicJYButtonUI1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbSexo;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboRaca;
    private org.jdesktop.swingx.JXDatePicker dpNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JFormattedTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    public boolean validarEntidade() {
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Existem campo(s) obrigatorio(s) nao preenchido(s)...", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            animal.setNome(this.txtNome.getText());
            animal.setCliente((Cliente) cboCliente.getSelectedItem());
            animal.setRaca((Raca) cboRaca.getSelectedItem());
            animal.setNascimento(this.dpNascimento.getDate());
            animal.setSexo(this.cbSexo.isSelected());
            animal.setPeso((double) this.txtPeso.getValue());
            animal.setCor(this.txtCor.getText());
            animal.setObservacao(this.txtObservacao.getText());
            return true;
        }
    }

    public void entrarTela() {
        try {
            animal = new Animal();
            animalController = new AnimalController();
            initComponents();
            montarCombos();
            setVisible(true);
            Main.jDesktopPane1.add(this);
            setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(FormAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sairTela() {
    }

    public void validarPermissaoBotoes() {
    }

    private void montarCombos() {
        modeloComboRaca = new ModeloComboRaca();
        cboRaca.setModel(modeloComboRaca);

        modeloComboCliente = new ModeloComboCliente();
        cboCliente.setModel(modeloComboCliente);
    }
}
