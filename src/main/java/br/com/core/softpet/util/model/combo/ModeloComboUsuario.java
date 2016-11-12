package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.UsuarioController;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.model.Usuario;

public class ModeloComboUsuario extends ModeloComboPadrao<Usuario> {

    IController controle = new UsuarioController();

    public ModeloComboUsuario() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Usuario.findAll");
        this.addElement("");
        for(Usuario listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
