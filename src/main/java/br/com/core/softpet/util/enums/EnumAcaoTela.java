package br.com.core.softpet.util.enums;

public enum EnumAcaoTela {
    
    INSERIR(1,"Inserindo"),
    ALTERAR(2,"Alterando"),
    PESQUISAR(3,"Pesquisando");

    private int codigo;
    private String nomeExibicao;

    private EnumAcaoTela(int codigo,String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }
    
    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public int getCodigo() {
        return codigo;
    }

}
