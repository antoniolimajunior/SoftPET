package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.IController;
import br.com.core.softpet.controller.MarcaController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Marca;

public class ModeloTabelaMarca extends ModeloTabelaPadrao<Marca> {

    IController<Marca> controle = new MarcaController<Marca>();
    String[] colunasLocal = {"Marca", "Descricao"};

    public ModeloTabelaMarca(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Marca.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Marca.findByDescricao", "descricao", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca marca = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return marca.getId();
        } else if (columnIndex == 1) {
            return marca.getDescricao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Marca marca = this.lista.get(rowIndex);
        return marca.getId();
    }
}
