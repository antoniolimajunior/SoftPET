package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.FornecedorController;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.model.Fornecedor;

public class ModeloComboFornecedor extends ModeloComboPadrao<Fornecedor> {

    IController controle = new FornecedorController();

    public ModeloComboFornecedor() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Fornecedor.findAll");
        this.addElement("");
        for(Fornecedor listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
