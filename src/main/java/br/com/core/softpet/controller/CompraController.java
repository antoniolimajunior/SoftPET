package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.CompraDAO;
import java.util.List;

public class CompraController<Compra> implements IController<Compra> {

    private CompraDAO compraDao = FactoryDAO.getInstanceCompraDao();

    public void salvar(Compra compra) {
        compraDao.persist(compra);
    }

    public void alterar(Compra compra) {
        compraDao.update(compra);
    }

    public void deletar(Compra entidade) {
        compraDao.delete(entidade);
    }

    public List<Compra> procurarPorTodos(String query) {
        return compraDao.findByAll(query);
    }

    public List<Compra> procurarPorNome(String query, String nome) {
        return compraDao.findByName(query, nome);
    }
    
    public List<Compra> procurarPorParam(String query, String param, String descricao) {
        return compraDao.findByParam(query, param, descricao);
    }

    public Compra procurarPorId(String query, String nomeParametro, int id) {
        return (Compra) compraDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Compra> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
