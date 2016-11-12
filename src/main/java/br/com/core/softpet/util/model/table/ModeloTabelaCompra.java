package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.CompraController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Compra;

public class ModeloTabelaCompra extends ModeloTabelaPadrao<Compra> {

    IController<Compra> controle = new CompraController<Compra>();
    String[] colunasLocal = {"Compra", "Numero", "Fornecedor"};

    public ModeloTabelaCompra(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Compra.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Compra.findByNumero", "numero", numero);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Compra compra = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return compra.getId();
        } else if (columnIndex == 1) {
            return compra.getNumero();
        } else if (columnIndex == 2) {
            return compra.getFornecedor().getNome();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Compra compra = this.lista.get(rowIndex);
        return compra.getId();
    }
}
