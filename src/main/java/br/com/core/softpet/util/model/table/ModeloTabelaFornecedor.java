package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.FornecedorController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Fornecedor;

public class ModeloTabelaFornecedor extends ModeloTabelaPadrao<Fornecedor> {

    IController<Fornecedor> controle = new FornecedorController<Fornecedor>();
    String[] colunasLocal = {"Fornecedor", "Nome", "CNPJ", "Telefone"};

    public ModeloTabelaFornecedor(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Fornecedor.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorNome("Fornecedor.findByNome", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedor.getId();
        } else if (columnIndex == 1) {
            return fornecedor.getNome();
        } else if (columnIndex == 2) {
            return fornecedor.getCnpj();
        } else if (columnIndex == 3) {
            return fornecedor.getTelefone();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Fornecedor fornecedor = this.lista.get(rowIndex);
        return fornecedor.getId();
    }
}
