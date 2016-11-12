package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.EspecieController;
import br.com.core.softpet.model.Especie;
import br.com.core.softpet.controller.IController;

public class ModeloComboEspecie extends ModeloComboPadrao<Especie> {

    IController controle = new EspecieController();

    public ModeloComboEspecie() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Especie.findAll");
        this.addElement("");
        for(Especie listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
