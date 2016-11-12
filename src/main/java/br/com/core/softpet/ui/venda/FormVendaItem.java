package br.com.core.softpet.ui.venda;

import br.com.core.softpet.ui.venda.*;
import br.com.core.softpet.app.Main;
import br.com.core.softpet.controller.VendaItemController;
import br.com.core.softpet.util.enums.EnumAcaoTela;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.VendaItem;
import br.com.core.softpet.model.Produto;
import br.com.core.softpet.ui.IFormularioCadastro;
import br.com.core.softpet.ui.IFormularioLista;
import br.com.core.softpet.util.DecimalFormattedField;
import br.com.core.softpet.util.model.combo.ModeloComboProduto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormVendaItem extends javax.swing.JInternalFrame implements IFormularioCadastro {

    private VendaItem vendaItem;
    private VendaItemController vendaItemController;
    private IFormularioLista fl;
    private List<VendaItem> lista;
    private EnumAcaoTela acaoTela;
    private EnumTipoPesquisa tipoPesquisa;
    private ModeloComboProduto modeloComboProduto;

    public FormVendaItem(EnumAcaoTela acaoTela, IFormularioLista fl, VendaItem vendaItem) {
        entrarTela();
        this.fl = fl;
        this.acaoTela = acaoTela;
        switch (acaoTela.getCodigo()) {
            case 1:
                this.vendaItem.setVenda(vendaItem.getVenda());
                break;
            case 2:
                this.vendaItem = vendaItem;
                this.vendaItem.setVenda(vendaItem.getVenda());
                this.txtPercentualDesconto.setText(vendaItem.getPercentualDesconto().toString());
                this.cboProduto.getModel().setSelectedItem(vendaItem.getProduto());
                this.txtQuantidade.setText(vendaItem.getQuantidade().toString());
                this.txtValorDesconto.setText(vendaItem.getValorDesconto().toString());
                this.txtValorTotal.setText(vendaItem.getValorTotal().toString());
                this.txtValorUnitario.setText(vendaItem.getValorUnitario().toString());
                break;
            case 3:
                this.vendaItem = vendaItem;
                this.vendaItem.setVenda(vendaItem.getVenda());
                this.txtPercentualDesconto.setText(vendaItem.getPercentualDesconto().toString());
                this.cboProduto.getModel().setSelectedItem(vendaItem.getProduto());
                this.txtQuantidade.setText(vendaItem.getQuantidade().toString());
                this.txtValorDesconto.setText(vendaItem.getValorDesconto().toString());
                this.txtValorTotal.setText(vendaItem.getValorTotal().toString());
                this.txtValorUnitario.setText(vendaItem.getValorUnitario().toString());

                this.pnlDados.setEnabled(false);
                this.txtPercentualDesconto.setEnabled(false);
                this.cboProduto.setEnabled(false);
                this.txtQuantidade.setEnabled(false);
                this.txtValorDesconto.setEnabled(false);
                this.txtValorTotal.setEnabled(false);
                this.txtValorUnitario.setEnabled(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basicJYButtonUI1 = new de.javasoft.swing.plaf.basic.BasicJYButtonUI();
        pnlDados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboProduto = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtValorUnitario = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        txtPercentualDesconto = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel5 = new javax.swing.JLabel();
        txtValorDesconto = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel9 = new javax.swing.JLabel();
        txtValorTotal = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Venda Item");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Valor Unitário:");

        jLabel7.setText("Produto:"); // NOI18N

        jLabel5.setText("Perc. Desconto:");

        jLabel6.setText("Valor Desconto:");

        jLabel9.setText("Quantidade:");

        jLabel8.setText("Valor Total:");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cboProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pnlDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                    vendaItemController.salvar(vendaItem);
                    JOptionPane.showMessageDialog(null, "VendaItem inserido com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    vendaItemController.alterar(vendaItem);
                    JOptionPane.showMessageDialog(null, "VendaItem alterado com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            this.fl.montarTabela(tipoPesquisa.PORID);
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
    private javax.swing.JComboBox cboProduto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JFormattedTextField txtPercentualDesconto;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValorDesconto;
    private javax.swing.JFormattedTextField txtValorTotal;
    private javax.swing.JFormattedTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables

    public boolean validarEntidade() {
        vendaItem.setVenda(vendaItem.getVenda());
        vendaItem.setPercentualDesconto((double) txtPercentualDesconto.getValue());
        vendaItem.setProduto((Produto) cboProduto.getSelectedItem());
        vendaItem.setQuantidade((double) txtQuantidade.getValue());
        vendaItem.setValorDesconto((double) txtValorDesconto.getValue());
        vendaItem.setValorTotal((double) txtValorTotal.getValue());
        vendaItem.setValorUnitario((double) txtValorUnitario.getValue());
        return true;
    }

    public void entrarTela() {
        try {
            vendaItem = new VendaItem();
            vendaItemController = new VendaItemController();
            initComponents();
            montarCombos();
            setVisible(true);
            Main.jDesktopPane1.add(this);
            setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(FormVendaItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sairTela() {
    }

    public void validarPermissaoBotoes() {
    }

    private void montarCombos() {
        modeloComboProduto = new ModeloComboProduto();
        cboProduto.setModel(modeloComboProduto);
    }
}
