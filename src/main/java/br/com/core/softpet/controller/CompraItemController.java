package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.CompraItemDAO;
import java.util.List;

public class CompraItemController<CompraItem> implements IController<CompraItem> {

    private CompraItemDAO compraItemDao = FactoryDAO.getInstanceCompraItemDao();

    public void salvar(CompraItem compraItem) {
        compraItemDao.persist(compraItem);
    }

    public void alterar(CompraItem compraItem) {
        compraItemDao.update(compraItem);
    }

    public void deletar(CompraItem entidade) {
        compraItemDao.delete(entidade);
    }

    public List<CompraItem> procurarPorTodos(String query) {
        return compraItemDao.findByAll(query);
    }

    public List<CompraItem> procurarPorNome(String query, String nome) {
        return compraItemDao.findByName(query, nome);
    }

    public List<CompraItem> procurarPorParam(String query, String param, String descricao) {
        return compraItemDao.findByParam(query, param, descricao);
    }

    public CompraItem procurarPorId(String query, String nomeParametro, int id) {
        return (CompraItem) compraItemDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<CompraItem> procurarPorId(String query, int id) {
        return compraItemDao.findById(query, id);
    }
}
