package br.com.core.softpet.util.model.table;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public abstract class ModeloTabelaPadrao<T> extends AbstractTableModel {    

    protected List<T> lista;
    protected String[] colunas;

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public abstract Object getValueAt(int rowIndex, int columnIndex);
}