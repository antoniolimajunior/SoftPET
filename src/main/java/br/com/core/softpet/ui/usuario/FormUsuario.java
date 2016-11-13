package br.com.core.softpet.ui.usuario;

import br.com.core.softpet.app.Main;
import br.com.core.softpet.controller.UsuarioController;
import br.com.core.softpet.util.enums.EnumAcaoTela;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Usuario;
import br.com.core.softpet.ui.IFormularioCadastro;
import br.com.core.softpet.ui.IFormularioLista;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormUsuario extends javax.swing.JInternalFrame implements IFormularioCadastro {

    private Usuario usuario;
    private UsuarioController usuarioController;
    private IFormularioLista fl;
    private List<Usuario> lista;
    private EnumAcaoTela acaoTela;
    private EnumTipoPesquisa tipoPesquisa;

    public FormUsuario(EnumAcaoTela acaoTela, IFormularioLista fl, Usuario usuario) {
        entrarTela();
        this.fl = fl;
        this.acaoTela = acaoTela;
        switch (acaoTela.getCodigo()) {
            case 1:
                break;
            case 2:
                this.usuario = usuario;
                this.txtNome.setText(usuario.getNome());
                this.txtUsuario.setText(usuario.getUsuario());
                this.txtSenha.setText(usuario.getSenha());
                this.txtFCPF.setText(usuario.getCpf());
                this.txtEndereco.setText(usuario.getEndereco());
                this.txtBairro.setText(usuario.getBairro());
                this.txtCidade.setText(usuario.getCidade());
                this.txtComplemento.setText(usuario.getComplemento());
                this.txtFCEP.setText(usuario.getCep());
                this.txtFTelefone.setText(usuario.getTelefone());
                this.txtEmail.setText(usuario.getEmail());
                this.txtObservacao.setText(usuario.getObservacao());
                this.cbEAdmin1.setSelected(usuario.geteAdmin());
                this.cbEVeterinario.setSelected(usuario.geteVeterinario());
                break;
            case 3:
                this.usuario = usuario;
                this.txtNome.setText(usuario.getNome());
                this.txtUsuario.setText(usuario.getUsuario());
                this.txtSenha.setText(usuario.getSenha());
                this.txtFCPF.setText(usuario.getCpf());
                this.txtEndereco.setText(usuario.getEndereco());
                this.txtBairro.setText(usuario.getBairro());
                this.txtCidade.setText(usuario.getCidade());
                this.txtComplemento.setText(usuario.getComplemento());
                this.txtFCEP.setText(usuario.getCep());
                this.txtFTelefone.setText(usuario.getTelefone());
                this.txtEmail.setText(usuario.getEmail());
                this.txtObservacao.setText(usuario.getObservacao());
                this.cbEAdmin1.setSelected(usuario.geteAdmin());
                this.cbEVeterinario.setSelected(usuario.geteVeterinario());

                this.pnlDados.setEnabled(false);
                this.txtNome.setEnabled(false);
                this.txtUsuario.setEnabled(false);
                this.txtSenha.setEnabled(false);
                this.txtFCPF.setEnabled(false);
                this.txtEndereco.setEnabled(false);
                this.txtBairro.setEnabled(false);
                this.txtCidade.setEnabled(false);
                this.txtComplemento.setEnabled(false);
                this.txtFCEP.setEnabled(false);
                this.txtFTelefone.setEnabled(false);
                this.txtEmail.setEnabled(false);
                this.txtObservacao.setEnabled(false);
                this.cbEAdmin1.setEnabled(false);
                this.cbEVeterinario.setEnabled(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtFCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFCEP = new javax.swing.JFormattedTextField();
        txtFTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cbEVeterinario = new javax.swing.JCheckBox();
        cbEAdmin1 = new javax.swing.JCheckBox();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuários");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        try {
            txtFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("CPF:");

        jLabel4.setText("Bairro:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("Complemento:");

        jLabel7.setText("CEP:");

        try {
            txtFCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Telefone:");

        jLabel9.setText("E-mail:");

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        jLabel10.setText("Observação:");

        cbEVeterinario.setText("É Veterinário");

        cbEAdmin1.setText("É Administrador");

        jLabel11.setText("Usuário");

        jLabel12.setText("Senha:");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtBairro)
                                    .addComponent(txtCidade)
                                    .addComponent(txtComplemento)
                                    .addComponent(txtEmail)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSenha)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(cbEAdmin1)
                                .addGap(26, 26, 26)
                                .addComponent(cbEVeterinario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEVeterinario)
                    .addComponent(cbEAdmin1))
                .addContainerGap())
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validarEntidade()) {
            switch (this.acaoTela.getCodigo()) {
                case 1:
                    usuarioController.salvar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    usuarioController.alterar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso", "SUCESSO",
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbEAdmin1;
    private javax.swing.JCheckBox cbEVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFCEP;
    private javax.swing.JFormattedTextField txtFCPF;
    private javax.swing.JFormattedTextField txtFTelefone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public boolean validarEntidade() {
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Existem campo(s) obrigatorio(s) nao preenchido(s)...", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            usuario.setNome(this.txtNome.getText());
            usuario.setUsuario(this.txtUsuario.getText());
            usuario.setSenha(new String(this.txtSenha.getPassword()));
            usuario.setCpf(this.txtFCPF.getText());
            usuario.setEndereco(this.txtEndereco.getText());
            usuario.setBairro(this.txtBairro.getText());
            usuario.setCidade(this.txtCidade.getText());
            usuario.setComplemento(this.txtComplemento.getText());
            usuario.setCep(this.txtFCEP.getText());
            usuario.setTelefone(this.txtFTelefone.getText());
            usuario.setEmail(this.txtEmail.getText());
            usuario.setObservacao(this.txtObservacao.getText());
            usuario.seteAdmin(this.cbEAdmin1.isSelected());
            usuario.seteVeterinario(this.cbEVeterinario.isSelected());
            return true;
        }
    }

    public void entrarTela() {
        try {
            usuario = new Usuario();
            usuarioController = new UsuarioController();
            initComponents();
            setVisible(true);
            Main.jDesktopPane1.add(this);
            setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sairTela() {
    }

    public void validarPermissaoBotoes() {
    }
}
