package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.AnimalController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Animal;

public class ModeloTabelaAnimal extends ModeloTabelaPadrao<Animal> {

    IController<Animal> controle = new AnimalController<Animal>();
    String[] colunasLocal = {"Animal", "Nome", "Cliente"};

    public ModeloTabelaAnimal(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Animal.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorNome("Animal.findByNome", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return animal.getId();
        } else if (columnIndex == 1) {
            return animal.getNome();
        } else if (columnIndex == 2) {
            return animal.getCliente().getNome();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Animal animal = this.lista.get(rowIndex);
        return animal.getId();
    }
}
