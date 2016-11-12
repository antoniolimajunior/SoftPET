package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.UsuarioController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Usuario;

public class ModeloTabelaUsuario extends ModeloTabelaPadrao<Usuario> {

    IController<Usuario> controle = new UsuarioController<Usuario>();
    String[] colunasLocal = {"Usuario", "Nome", "CPF", "Telefone"};

    public ModeloTabelaUsuario(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Usuario.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorNome("Usuario.findByNome", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuario.getId();
        } else if (columnIndex == 1) {
            return usuario.getNome();
        } else if (columnIndex == 2) {
            return usuario.getCpf();
        } else if (columnIndex == 3) {
            return usuario.getTelefone();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Usuario usuario = this.lista.get(rowIndex);
        return usuario.getId();
    }
}
