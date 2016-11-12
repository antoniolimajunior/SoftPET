package br.com.core.softpet.util.model.table;

import br.com.core.softpet.util.model.table.*;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.ProdutoController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Produto;

public class ModeloTabelaProduto extends ModeloTabelaPadrao<Produto> {

    IController<Produto> controle = new ProdutoController<Produto>();
    String[] colunasLocal = {"Produto", "Descrição", "Observação"};

    public ModeloTabelaProduto(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Produto.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Produto.findByDescricao", "descricao", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getId();
        } else if (columnIndex == 1) {
            return produto.getDescricao();
        } else if (columnIndex == 2) {
            return produto.getObservacao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Produto produto = this.lista.get(rowIndex);
        return produto.getId();
    }
}
