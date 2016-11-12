package br.com.core.softpet.util.model.combo;

import br.com.core.softpet.controller.ProdutoController;
import br.com.core.softpet.model.Produto;
import br.com.core.softpet.controller.IController;

public class ModeloComboProduto extends ModeloComboPadrao<Produto> {

    IController controle = new ProdutoController();

    public ModeloComboProduto() {
        this.montarCombo();
    }

    protected void montarCombo() {
        this.lista = controle.procurarPorTodos("Produto.findAll");
        this.addElement("");
        for(Produto listaIt : lista) {
            this.addElement(listaIt);
        }
    }

}
