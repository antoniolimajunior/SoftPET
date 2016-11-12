package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.RacaController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Raca;

public class ModeloTabelaRaca extends ModeloTabelaPadrao<Raca> {

    IController<Raca> controle = new RacaController<Raca>();
    String[] colunasLocal = {"Raca", "Descrição"};

    public ModeloTabelaRaca(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Raca.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Raca.findByDescricao", "descricao", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Raca raca = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return raca.getId();
        } else if (columnIndex == 1) {
            return raca.getDescricao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Raca raca = this.lista.get(rowIndex);
        return raca.getId();
    }
}
