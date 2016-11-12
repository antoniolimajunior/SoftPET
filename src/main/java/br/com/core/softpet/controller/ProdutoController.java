package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController<Produto> implements IController<Produto> {

    private ProdutoDAO produtoDao = FactoryDAO.getInstanceProdutoDao();

    public void salvar(Produto produto) {
        produtoDao.persist(produto);
    }

    public void alterar(Produto produto) {
        produtoDao.update(produto);
    }

    public void deletar(Produto entidade) {
        produtoDao.delete(entidade);
    }

    public List<Produto> procurarPorTodos(String query) {
        return produtoDao.findByAll(query);
    }

    public List<Produto> procurarPorNome(String query, String descricao) {
        return produtoDao.findByName(query, descricao);
    }
    
    public List<Produto> procurarPorParam(String query, String param,String descricao) {
        return produtoDao.findByParam(query, param, descricao);
    }

    public Produto procurarPorId(String query, String nomeParametro, int id) {
        return (Produto) produtoDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Produto> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
