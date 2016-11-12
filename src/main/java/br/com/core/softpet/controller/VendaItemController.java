package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.VendaItemDAO;
import java.util.List;

public class VendaItemController<VendaItem> implements IController<VendaItem> {

    private VendaItemDAO vendaItemDao = FactoryDAO.getInstanceVendaItemDao();

    public void salvar(VendaItem vendaItem) {
        vendaItemDao.persist(vendaItem);
    }

    public void alterar(VendaItem vendaItem) {
        vendaItemDao.update(vendaItem);
    }

    public void deletar(VendaItem entidade) {
        vendaItemDao.delete(entidade);
    }

    public List<VendaItem> procurarPorTodos(String query) {
        return vendaItemDao.findByAll(query);
    }

    public List<VendaItem> procurarPorNome(String query, String nome) {
        return vendaItemDao.findByName(query, nome);
    }

    public List<VendaItem> procurarPorParam(String query, String param, String descricao) {
        return vendaItemDao.findByParam(query, param, descricao);
    }

    public VendaItem procurarPorId(String query, String nomeParametro, int id) {
        return (VendaItem) vendaItemDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<VendaItem> procurarPorId(String query, int id) {
        return vendaItemDao.findById(query, id);
    }
}
