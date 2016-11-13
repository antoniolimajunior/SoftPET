package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.VendaItemController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.VendaItem;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ModeloTabelaVendaItem extends ModeloTabelaPadrao<VendaItem> {

    IController<VendaItem> controle = new VendaItemController<VendaItem>();
    String[] colunasLocal = {"VendaItem", "Produto", "Valor Total"};

    public ModeloTabelaVendaItem(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("VendaItem.findAll");
                break;
            case 3:
                this.lista = controle.procurarPorId("VendaItem.findByVenda", Integer.parseInt(numero));
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendaItem vendaItem = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaItem.getId();
        } else if (columnIndex == 1) {
            return vendaItem.getProduto().getDescricao();
        } else if (columnIndex == 2) {
            DecimalFormat df = new DecimalFormat("0.00");
            String dx = df.format(vendaItem.getValorTotal());
            return dx;
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        VendaItem vendaItem = this.lista.get(rowIndex);
        return vendaItem.getId();
    }
}
