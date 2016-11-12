package br.com.core.softpet.controller;

import java.util.List;

public interface IController<T> {

    void salvar(T entidade);

    void alterar(T entidade);

    void deletar(T entidade);

    List<T> procurarPorTodos(String query);

    List<T> procurarPorNome(String query, String nome);
    
    List<T> procurarPorId(String query, int id);
    
    List<T> procurarPorParam(String query, String param, String nome);

    T procurarPorId(String query, String nomeParametro, int id);
}
