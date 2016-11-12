package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.CompraItemController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.CompraItem;

public class ModeloTabelaCompraItem extends ModeloTabelaPadrao<CompraItem> {

    IController<CompraItem> controle = new CompraItemController<CompraItem>();
    String[] colunasLocal = {"CompraItem", "Produto"};

    public ModeloTabelaCompraItem(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("CompraItem.findAll");
                break;
            case 3:
                this.lista = controle.procurarPorId("CompraItem.findByCompra", Integer.parseInt(numero));
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CompraItem compraItem = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return compraItem.getId();
        } else if (columnIndex == 1) {
            return compraItem.getProduto().getDescricao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        CompraItem compraItem = this.lista.get(rowIndex);
        return compraItem.getId();
    }
}
