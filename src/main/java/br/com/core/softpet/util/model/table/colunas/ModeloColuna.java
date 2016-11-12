package br.com.core.softpet.util.model.table.colunas;

import javax.swing.JTable;

public class ModeloColuna {

    public ModeloColuna() {
    }

    public static void setarColunas(JTable jtb, int...widths) {
        for(int i = 0; i < widths.length; i++) {
            jtb.getColumnModel().getColumn(i).setMaxWidth(widths[i]);
            jtb.getColumnModel().getColumn(i).setResizable(true);
            jtb.setCellSelectionEnabled(false);
        }
    }
    
}