package br.com.core.softpet.ui;

import br.com.core.softpet.util.enums.EnumTipoPesquisa;

public interface IFormularioLista extends IFormulario {

    void entrarTela();

    void sairTela();

    void validarPermissaoBotoes();

    void montarTabela(EnumTipoPesquisa tipoPesquisa);
}
