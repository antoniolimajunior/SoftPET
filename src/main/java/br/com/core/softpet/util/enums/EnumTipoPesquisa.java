package br.com.core.softpet.util.enums;

public enum EnumTipoPesquisa {

    TUDO(1),
    PORNOME(2),
    PORID(3),;

    private int codigo;

    private EnumTipoPesquisa(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
