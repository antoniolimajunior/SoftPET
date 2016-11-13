package br.com.core.softpet.ui.venda;

import br.com.core.softpet.app.Main;
import br.com.core.softpet.controller.VendaController;
import br.com.core.softpet.controller.VendaItemController;
import br.com.core.softpet.model.Cliente;
import br.com.core.softpet.util.enums.EnumAcaoTela;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Venda;
import br.com.core.softpet.model.VendaItem;
import br.com.core.softpet.model.Usuario;
import br.com.core.softpet.ui.IFormularioCadastro;
import br.com.core.softpet.ui.IFormularioLista;
import br.com.core.softpet.util.DecimalFormattedField;
import br.com.core.softpet.util.model.combo.ModeloComboCliente;
import br.com.core.softpet.util.model.combo.ModeloComboUsuario;
import br.com.core.softpet.util.model.table.ModeloTabelaVendaItem;
import br.com.core.softpet.util.model.table.colunas.ModeloColuna;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormVenda extends javax.swing.JInternalFrame implements IFormularioCadastro, IFormularioLista {

    private Venda venda;
    private VendaItem vendaItem;
    private VendaController vendaController;
    private VendaItemController vendaItemController;
    private IFormularioLista fl;
    private List<Venda> lista;
    private EnumAcaoTela acaoTela;
    private EnumTipoPesquisa tipoPesquisa;
    private ModeloComboUsuario modeloComboUsuario;
    private ModeloComboCliente modeloComboCliente;
    private ModeloTabelaVendaItem modeloTabela;
    private int linha;

    public FormVenda(EnumAcaoTela acaoTela, IFormularioLista fl, Venda venda) {
        entrarTela();
        this.fl = fl;
        this.acaoTela = acaoTela;
        switch (acaoTela.getCodigo()) {
            case 1:
                break;
            case 2:
                this.venda = venda;
                this.txtNumero.setText(venda.getNumero());
                this.cboCliente.getModel().setSelectedItem(venda.getCliente());
                this.cboUsuario.getModel().setSelectedItem(venda.getUsuario());
                this.dpDataEmissao.setDate(venda.getDataVenda());
                this.txtTipoPagamento.setText(venda.getTipoPagamento());
                this.txtValorTotalDesconto.setText(venda.getValorTotalDesconto().toString());
                this.txtValorTotalFrete.setText(venda.getValorTotalFrete().toString());
                this.txtValorTotal.setText(venda.getValorTotal().toString());
                this.txtObservacao.setText(venda.getObservacao());
                this.cbFinalizado.setSelected(venda.getSituacao());
                break;
            case 3:
                this.venda = venda;
                this.txtNumero.setText(venda.getNumero());
                this.cboCliente.getModel().setSelectedItem(venda.getCliente());
                this.cboUsuario.getModel().setSelectedItem(venda.getUsuario());
                this.dpDataEmissao.setDate(venda.getDataVenda());
                this.txtTipoPagamento.setText(venda.getTipoPagamento());
                this.txtValorTotalDesconto.setText(venda.getValorTotalDesconto().toString());
                this.txtValorTotalFrete.setText(venda.getValorTotalFrete().toString());
                this.txtValorTotal.setText(venda.getValorTotal().toString());
                this.txtObservacao.setText(venda.getObservacao());
                this.cbFinalizado.setSelected(venda.getSituacao());

                this.pnlDados.setEnabled(false);
                this.txtNumero.setEnabled(false);
                this.cboCliente.setEnabled(false);
                this.cboUsuario.setEnabled(false);
                this.dpDataEmissao.setEnabled(false);
                this.txtTipoPagamento.setEnabled(false);
                this.txtValorTotalDesconto.setEnabled(false);
                this.txtValorTotalFrete.setEnabled(false);
                this.txtValorTotal.setEnabled(false);
                this.txtObservacao.setEnabled(false);
                this.cbFinalizado.setEnabled(false);
                this.btnNovo.setEnabled(false);
                this.btnEditar.setEnabled(false);
                this.btnRemover.setEnabled(false);
                break;
        }
        montarTabela(tipoPesquisa.PORID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basicJYButtonUI1 = new de.javasoft.swing.plaf.basic.BasicJYButtonUI();
        pnlDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTipoPagamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        dpDataEmissao = new org.jdesktop.swingx.JXDatePicker();
        txtValorTotalDesconto = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel5 = new javax.swing.JLabel();
        txtValorTotalFrete = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jLabel6 = new javax.swing.JLabel();
        txtValorTotal = new DecimalFormattedField(DecimalFormattedField.NUMERO);
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cbFinalizado = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Vendas");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Número:");

        jLabel2.setText("Forma Pgto:");

        jLabel3.setText("Data Emissão:");

        jLabel4.setText("Valor Desconto:");

        jLabel7.setText("Cliente:"); // NOI18N

        jLabel8.setText("Usuário:"); // NOI18N

        jLabel5.setText("Valor Frete:");

        jLabel6.setText("Valor Total:");

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane.setViewportView(tblDados);

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\add.png")); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\pencil.png")); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\cross.png")); // NOI18N
        btnRemover.setToolTipText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\icons\\magnifier.png")); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Itens", jPanel1);

        jLabel10.setText("Observação:");

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Observação", jPanel2);

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(11, 11, 11)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(dpDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(txtValorTotalDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorTotalFrete))
                    .addComponent(cboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoPagamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCliente, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(txtValorTotal)
                .addGap(240, 240, 240))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dpDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorTotalFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtValorTotalDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
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

        cbFinalizado.setText("Finalizado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbFinalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFinalizado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validarEntidade()) {
            switch (this.acaoTela.getCodigo()) {
                case 1:
                    if (venda.getId() == null) {
                        vendaController.salvar(venda);
                    } else {
                        vendaController.alterar(venda);
                    }
                    JOptionPane.showMessageDialog(null, "Venda inserido com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    vendaController.alterar(venda);
                    JOptionPane.showMessageDialog(null, "Venda alterado com sucesso", "SUCESSO",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            this.fl.montarTabela(tipoPesquisa.TUDO);
            this.dispose();
        }
}//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        switch (acaoTela.getCodigo()) {
            case 1:
                if (venda.getId() != null) {
                    vendaController.deletar(venda);
                }
                break;
        }
        dispose();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        switch (acaoTela.getCodigo()) {
            case 1:
                if (venda.getId() == null) {
                    vendaController.salvar(venda);
                }
                break;
        }

        VendaItem vendaItem = new VendaItem();
        vendaItem.setVenda(venda);
        new FormVendaItem(acaoTela.INSERIR, this, vendaItem);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        linha = this.tblDados.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela para poder alterar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = this.modeloTabela.retornaId(linha);
            vendaItem = (VendaItem) vendaItemController.procurarPorId("VendaItem.findById", "id", id);
            new FormVendaItem(acaoTela.ALTERAR, this, vendaItem);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        linha = this.tblDados.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela para poder excluir",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = this.modeloTabela.retornaId(linha);
            vendaItem = (VendaItem) vendaItemController.procurarPorId("VendaItem.findById", "id", id);
            int op = JOptionPane.showConfirmDialog(null, "Você deseja mesmo excluir este registro: " + vendaItem.getProduto().getDescricao() + " ?",
                    "Questão", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                vendaItemController.deletar(vendaItem);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso", "Exclusão", JOptionPane.ERROR_MESSAGE);
                this.montarTabela(tipoPesquisa.TUDO);
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        linha = this.tblDados.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela para poder consultar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = this.modeloTabela.retornaId(linha);
            vendaItem = (VendaItem) vendaItemController.procurarPorId("VendaItem.findById", "id", id);
            new FormVendaItem(acaoTela.PESQUISAR, this, vendaItem);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.javasoft.swing.plaf.basic.BasicJYButtonUI basicJYButtonUI1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbFinalizado;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboUsuario;
    private org.jdesktop.swingx.JXDatePicker dpDataEmissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtTipoPagamento;
    private javax.swing.JFormattedTextField txtValorTotal;
    private javax.swing.JFormattedTextField txtValorTotalDesconto;
    private javax.swing.JFormattedTextField txtValorTotalFrete;
    // End of variables declaration//GEN-END:variables

    public boolean validarEntidade() {
        if (txtNumero.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Existem campo(s) obrigatorio(s) nao preenchido(s)...", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {

            if (venda.getId() != null) {
                vendaItemController = new VendaItemController<VendaItem>();
                List<VendaItem> ci = vendaItemController.procurarPorId("VendaItem.findByVenda", venda.getId());
                if (ci != null) {
                    venda.getVendaItem().addAll(ci);
                }
            }
            venda.setNumero(this.txtNumero.getText());
            venda.setCliente((Cliente) this.cboCliente.getSelectedItem());
            venda.setUsuario((Usuario) this.cboUsuario.getSelectedItem());
            venda.setDataVenda(this.dpDataEmissao.getDate());
            venda.setTipoPagamento(this.txtTipoPagamento.getText());
            venda.setValorTotalDesconto((double) this.txtValorTotalDesconto.getValue());
            venda.setValorTotalFrete((double) this.txtValorTotalFrete.getValue());
            venda.setValorTotal((double) this.txtValorTotal.getValue());
            venda.setObservacao(this.txtObservacao.getText());
            venda.setSituacao(this.cbFinalizado.isSelected());
            return true;
        }
    }

    public void entrarTela() {
        try {
            venda = new Venda();
            vendaController = new VendaController();
            vendaItemController = new VendaItemController();
            initComponents();
            montarCombos();
            setVisible(true);
            Main.jDesktopPane1.add(this);
            setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(FormVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sairTela() {
    }

    public void validarPermissaoBotoes() {
    }

    private void montarCombos() {
        modeloComboUsuario = new ModeloComboUsuario();
        cboUsuario.setModel(modeloComboUsuario);

        modeloComboCliente = new ModeloComboCliente();
        cboCliente.setModel(modeloComboCliente);
    }

    @Override
    public void montarTabela(EnumTipoPesquisa tipoPesquisa) {
        switch (acaoTela.getCodigo()) {
            case 1:
                if (venda.getId() != null) {
                    modeloTabela = new ModeloTabelaVendaItem(tipoPesquisa.PORID, venda.getId().toString());
                }
                break;
            default:
                modeloTabela = new ModeloTabelaVendaItem(tipoPesquisa.PORID, venda.getId().toString());
                break;
        }
        this.tblDados.setModel(modeloTabela);
        ModeloColuna.setarColunas(tblDados, 100, 250, 200);
    }
}
