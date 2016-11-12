package br.com.core.softpet.util.model.table;

import br.com.core.softpet.controller.EspecieController;
import br.com.core.softpet.controller.IController;
import br.com.core.softpet.util.enums.EnumTipoPesquisa;
import br.com.core.softpet.model.Especie;

public class ModeloTabelaEspecie extends ModeloTabelaPadrao<Especie> {

    IController<Especie> controle = new EspecieController<Especie>();
    String[] colunasLocal = {"Especie", "Descricao"};

    public ModeloTabelaEspecie(EnumTipoPesquisa tipoPesquisa, String nome) {
        this.colunas = colunasLocal;
        switch (tipoPesquisa.getCodigo()) {
            case 1:
                this.lista = controle.procurarPorTodos("Especie.findAll");
                break;
            case 2:
                this.lista = controle.procurarPorParam("Especie.findByDescricao", "descricao", nome);
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Especie especie = this.lista.get(rowIndex);
        if (columnIndex == 0) {
            return especie.getId();
        } else if (columnIndex == 1) {
            return especie.getDescricao();
        } else {
            return null;
        }
    }

    public int retornaId(int rowIndex) {
        Especie especie = this.lista.get(rowIndex);
        return especie.getId();
    }
}
