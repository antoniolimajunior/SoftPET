package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.ClienteController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Cliente;

public class ModeloTabelaCliente extends ModeloTabelaPadrao<Cliente> {

    IController<Cliente> controle = new ClienteController<Cliente>();
    String[] colunasLocal = {"Cliente", "Nome", "Telefone"};

    public ModeloTabelaCliente(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Cliente.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorNome("Cliente.findByNome", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getId();
        } else if (columnIndex == 1) {
            return cliente.getNome();
        } else if (columnIndex == 2) {
            return cliente.getTelefone();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Cliente cliente = this.lista.get(rowIndex);
        return cliente.getId();
    }
}
