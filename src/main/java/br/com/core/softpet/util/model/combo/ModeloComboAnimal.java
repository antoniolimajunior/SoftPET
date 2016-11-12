package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.AnimalController;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.model.Animal;

public class ModeloComboAnimal extends ModeloComboPadrao<Animal> {

    IController controle = new AnimalController();

    public ModeloComboAnimal() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Animal.findAll");
        this.addElement("");
        for(Animal listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
