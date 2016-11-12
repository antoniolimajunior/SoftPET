package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.AtendimentoItemController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.AtendimentoItem;

public class ModeloTabelaAtendimentoItem extends ModeloTabelaPadrao<AtendimentoItem> {

    IController<AtendimentoItem> controle = new AtendimentoItemController<AtendimentoItem>();
    String[] colunasLocal = {"AtendimentoItem", "Produto"};

    public ModeloTabelaAtendimentoItem(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("AtendimentoItem.findAll");
                break;
            case 3:
                this.lista = controle.procurarPorId("AtendimentoItem.findByAtendimento", Integer.parseInt(numero));
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AtendimentoItem atendimentoItem = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return atendimentoItem.getId();
        } else if (columnIndex == 1) {
            return atendimentoItem.getProduto().getDescricao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        AtendimentoItem atendimentoItem = this.lista.get(rowIndex);
        return atendimentoItem.getId();
    }
}
