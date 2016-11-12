package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.MarcaDAO;
import java.util.List;

public class MarcaController<Marca> implements IController<Marca> {

    private MarcaDAO marcaDao = FactoryDAO.getInstanceMarcaDao();

    public void salvar(Marca marca) {
        marcaDao.persist(marca);
    }

    public void alterar(Marca marca) {
        marcaDao.update(marca);
    }

    public void deletar(Marca entidade) {
        marcaDao.delete(entidade);
    }

    public List<Marca> procurarPorTodos(String query) {
        return marcaDao.findByAll(query);
    }

    public List<Marca> procurarPorNome(String query, String descricao) {
        return marcaDao.findByName(query, descricao);
    }
    
    public List<Marca> procurarPorParam(String query, String param,String descricao) {
        return marcaDao.findByParam(query, param, descricao);
    }

    public Marca procurarPorId(String query, String nomeParametro, int id) {
        return (Marca) marcaDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Marca> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
