package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.CategoriaController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Categoria;

public class ModeloTabelaCategoria extends ModeloTabelaPadrao<Categoria> {

    IController<Categoria> controle = new CategoriaController<Categoria>();
    String[] colunasLocal = {"Categoria", "Descrição", "Observação"};

    public ModeloTabelaCategoria(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Categoria.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Categoria.findByDescricao", "descricao", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categoria categoria = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return categoria.getId();
        } else if (columnIndex == 1) {
            return categoria.getDescricao();
        } else if (columnIndex == 2) {
            return categoria.getObservacao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Categoria categoria = this.lista.get(rowIndex);
        return categoria.getId();
    }
}
