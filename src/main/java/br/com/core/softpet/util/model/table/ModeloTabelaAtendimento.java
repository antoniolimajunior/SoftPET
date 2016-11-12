package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.AtendimentoController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Atendimento;

public class ModeloTabelaAtendimento extends ModeloTabelaPadrao<Atendimento> {

    IController<Atendimento> controle = new AtendimentoController<Atendimento>();
    String[] colunasLocal = {"Atendimento", "Numero", "Cliente"};

    public ModeloTabelaAtendimento(EnumTipoPesquisa tipoPesquisa, String numero) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Atendimento.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Atendimento.findByNumero", "numero", numero);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendimento atendimento = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return atendimento.getId();
        } else if (columnIndex == 1) {
            return atendimento.getNumero();
        } else if (columnIndex == 2) {
            return atendimento.getCliente().getNome();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Atendimento atendimento = this.lista.get(rowIndex);
        return atendimento.getId();
    }
}
