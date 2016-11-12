package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.EspecieDAO;
import java.util.List;

public class EspecieController<Especie> implements IController<Especie> {

    private EspecieDAO especieDao = FactoryDAO.getInstanceEspecieDao();

    public void salvar(Especie especie) {
        especieDao.persist(especie);
    }

    public void alterar(Especie especie) {
        especieDao.update(especie);
    }

    public void deletar(Especie entidade) {
        especieDao.delete(entidade);
    }

    public List<Especie> procurarPorTodos(String query) {
        return especieDao.findByAll(query);
    }

    public List<Especie> procurarPorNome(String query, String descricao) {
        return especieDao.findByName(query, descricao);
    }
    
    public List<Especie> procurarPorParam(String query, String param,String descricao) {
        return especieDao.findByParam(query, param, descricao);
    }

    public Especie procurarPorId(String query, String nomeParametro, int id) {
        return (Especie) especieDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Especie> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
