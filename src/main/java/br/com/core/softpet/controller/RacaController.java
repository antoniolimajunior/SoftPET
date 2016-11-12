package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.RacaDAO;
import java.util.List;

public class RacaController<Raca> implements IController<Raca> {

    private RacaDAO racaDao = FactoryDAO.getInstanceRacaDao();

    public void salvar(Raca raca) {
        racaDao.persist(raca);
    }

    public void alterar(Raca raca) {
        racaDao.update(raca);
    }

    public void deletar(Raca entidade) {
        racaDao.delete(entidade);
    }

    public List<Raca> procurarPorTodos(String query) {
        return racaDao.findByAll(query);
    }

    public List<Raca> procurarPorNome(String query, String descricao) {
        return racaDao.findByName(query, descricao);
    }
    
    public List<Raca> procurarPorParam(String query, String param,String descricao) {
        return racaDao.findByParam(query, param, descricao);
    }

    public Raca procurarPorId(String query, String nomeParametro, int id) {
        return (Raca) racaDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Raca> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
