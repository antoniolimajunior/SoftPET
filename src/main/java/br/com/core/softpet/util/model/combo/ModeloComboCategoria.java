package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.CategoriaController;
import br.com.core.softpet.model.Categoria;
import br.com.core.softpet.controller.IController;

public class ModeloComboCategoria extends ModeloComboPadrao<Categoria> {

    IController controle = new CategoriaController();

    public ModeloComboCategoria() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Categoria.findAll");
        this.addElement("");
        for(Categoria listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
