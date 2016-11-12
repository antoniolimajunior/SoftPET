package br.com.core.softpet.util;

import javax.swing.text.MaskFormatter;

public class Mascaras {

    public static MaskFormatter mascaraData() {
        try {
            MaskFormatter formatoData = new MaskFormatter("##/##/####");
            formatoData.setValidCharacters("0123456789");
            return formatoData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static MaskFormatter mascaraMoeda() {
        try {
            MaskFormatter formatoMoeda = new MaskFormatter();
            formatoMoeda.setValidCharacters("0123456789,");
            return formatoMoeda;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
