package br.com.core.softpet.dao;

import java.util.List;

public interface IBaseDAO<T> {

    void persist(T entidade);

    List<T> findByAll(String query);

    List<T> findByName(String query, String nome);

    List<T> findByParam(String query, String param, String nome);
    
    List<T> findById(String query, int nome);
}
