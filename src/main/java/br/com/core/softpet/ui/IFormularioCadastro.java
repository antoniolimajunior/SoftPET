package br.com.core.softpet.ui;

public interface IFormularioCadastro extends IFormulario {
    
    boolean validarEntidade();

    void entrarTela();

    void sairTela();

    void validarPermissaoBotoes();

}
