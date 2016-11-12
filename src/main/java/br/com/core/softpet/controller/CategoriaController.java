package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.CategoriaDAO;
import java.util.List;

public class CategoriaController<Categoria> implements IController<Categoria> {

    private CategoriaDAO categoriaDao = FactoryDAO.getInstanceCategoriaDao();

    public void salvar(Categoria categoria) {
        categoriaDao.persist(categoria);
    }

    public void alterar(Categoria categoria) {
        categoriaDao.update(categoria);
    }

    public void deletar(Categoria entidade) {
        categoriaDao.delete(entidade);
    }

    public List<Categoria> procurarPorTodos(String query) {
        return categoriaDao.findByAll(query);
    }

    public List<Categoria> procurarPorNome(String query, String descricao) {
        return categoriaDao.findByName(query, descricao);
    }
    
    public List<Categoria> procurarPorParam(String query, String param,String descricao) {
        return categoriaDao.findByParam(query, param, descricao);
    }

    public Categoria procurarPorId(String query, String nomeParametro, int id) {
        return (Categoria) categoriaDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Categoria> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
