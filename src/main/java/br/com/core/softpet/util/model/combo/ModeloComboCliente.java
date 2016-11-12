package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.ClienteController;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.model.Cliente;

public class ModeloComboCliente extends ModeloComboPadrao<Cliente> {

    IController controle = new ClienteController();

    public ModeloComboCliente() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Cliente.findAll");
        this.addElement("");
        for(Cliente listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
