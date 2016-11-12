package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.MarcaController;
import br.com.core.softpet.model.Marca;
import br.com.core.softpet.controller.IController;

public class ModeloComboMarca extends ModeloComboPadrao<Marca> {

    IController controle = new MarcaController();

    public ModeloComboMarca() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Marca.findAll");
        this.addElement("");
        for(Marca listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
