package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.FornecedorDAO;
import java.util.List;

public class FornecedorController<Fornecedor> implements IController<Fornecedor> {

    private FornecedorDAO fornecedorDao = FactoryDAO.getInstanceFornecedorDao();

    public void salvar(Fornecedor fornecedor) {
        fornecedorDao.persist(fornecedor);
    }

    public void alterar(Fornecedor fornecedor) {
        fornecedorDao.update(fornecedor);
    }

    public void deletar(Fornecedor entidade) {
        fornecedorDao.delete(entidade);
    }

    public List<Fornecedor> procurarPorTodos(String query) {
        return fornecedorDao.findByAll(query);
    }

    public List<Fornecedor> procurarPorNome(String query, String nome) {
        return fornecedorDao.findByName(query, nome);
    }
    
    public List<Fornecedor> procurarPorParam(String query, String param, String descricao) {
        return fornecedorDao.findByParam(query, param, descricao);
    }

    public Fornecedor procurarPorId(String query, String nomeParametro, int id) {
        return (Fornecedor) fornecedorDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Fornecedor> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
