package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.VendaController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Venda;

public class ModeloTabelaVenda extends ModeloTabelaPadrao<Venda> {

    IController<Venda> controle = new VendaController<Venda>();
    String[] colunasLocal = {"Venda", "Numero", "Fornecedor"};

    public ModeloTabelaVenda(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Venda.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Venda.findByNumero", "numero", numero);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda venda = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return venda.getId();
        } else if (columnIndex == 1) {
            return venda.getNumero();
        } else if (columnIndex == 2) {
            return venda.getCliente().getNome();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Venda venda = this.lista.get(rowIndex);
        return venda.getId();
    }
}
