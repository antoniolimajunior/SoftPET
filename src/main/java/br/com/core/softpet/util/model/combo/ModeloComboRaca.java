package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.RacaController;
import br.com.core.softpet.model.Raca;
import br.com.core.softpet.controller.IController;

public class ModeloComboRaca extends ModeloComboPadrao<Raca> {

    IController controle = new RacaController();

    public ModeloComboRaca() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Raca.findAll");
        this.addElement("");
        for(Raca listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
