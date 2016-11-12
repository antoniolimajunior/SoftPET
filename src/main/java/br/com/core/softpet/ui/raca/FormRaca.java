package br.com.core.softpet.ui.raca;

import br.com.core.softpet.app.Main;
import br.com.core.softpet.controller.RacaController;
import br.com.core.softpet.model.Especie;
import br.com.core.softpet.util.enums.EnumAcaoTela;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Raca;
import br.com.core.softpet.ui.IFormularioCadastro;
import br.com.core.softpet.ui.IFormularioLista;
import br.com.core.softpet.util.model.combo.ModeloComboEspecie;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormRaca extends javax.swing.JInternalFrame implements IFormularioCadastro {

    private Raca raca;
    private RacaController racaController;
    private IFormularioLista fl;
    private List<Raca> lista;
    private EnumAcaoTela acaoTela;
    private EnumTipoPesquisa tipoPesquisa;
    private ModeloComboEspecie modeloComboEspecie;

    public FormRaca(EnumAcaoTela acaoTela, IFormularioLista fl, Raca raca) {
        entrarTela();
        this.fl = fl;
        this.acaoTela = acaoTela;
        switch (acaoTela.getCodigo()) {
            case 1:
                break;
            case 2:
                this.raca = raca;
                cboEspecie.getModel().setSelectedItem(raca.getEspecie());
                txtDescricao.setText(raca.getDescricao());
                break;
            case 3:
                this.raca = raca;                
                cboEspecie.getModel().setSelectedItem(raca.getEspecie());                
                txtDescricao.setText(raca.getDescricao());
                this.pnlDados.setEnabled(false);
                
                cboEspecie.setEnabled(false);
                txtDescricao.setEnabled(false);
                
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboEspecie = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Raças");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Descrição:");

        jLabel7.setText("Espécie:"); // NOI18N

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(cboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
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
                    racaController.salvar(raca);
                    JOptionPane.showMessageDialog(null, "Raca inserido com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    racaController.alterar(raca);
                    JOptionPane.showMessageDialog(null, "Raca alterado com sucesso", "SUCESSO",
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
    private javax.swing.JComboBox cboEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

    public boolean validarEntidade() {
        if (txtDescricao.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Existem campo(s) obrigatorio(s) nao preenchido(s)...", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            raca.setEspecie((Especie) cboEspecie.getSelectedItem());
            raca.setDescricao(txtDescricao.getText().trim());
            return true;
        }
    }

    public void entrarTela() {
        try {
            raca = new Raca();
            racaController = new RacaController();
            initComponents();
            montarCombos();
            setVisible(true);
            Main.jDesktopPane1.add(this);
            
            setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(FormRaca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sairTela() {
    }

    public void validarPermissaoBotoes() {
    }
    
    private void montarCombos() {
        modeloComboEspecie = new ModeloComboEspecie();
        cboEspecie.setModel(modeloComboEspecie);      
    }
}
