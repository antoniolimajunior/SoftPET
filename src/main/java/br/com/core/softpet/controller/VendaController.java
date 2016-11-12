package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.VendaDAO;
import java.util.List;

public class VendaController<Venda> implements IController<Venda> {

    private VendaDAO vendaDao = FactoryDAO.getInstanceVendaDao();

    public void salvar(Venda venda) {
        vendaDao.persist(venda);
    }

    public void alterar(Venda venda) {
        vendaDao.update(venda);
    }

    public void deletar(Venda entidade) {
        vendaDao.delete(entidade);
    }

    public List<Venda> procurarPorTodos(String query) {
        return vendaDao.findByAll(query);
    }

    public List<Venda> procurarPorNome(String query, String nome) {
        return vendaDao.findByName(query, nome);
    }
    
    public List<Venda> procurarPorParam(String query, String param, String descricao) {
        return vendaDao.findByParam(query, param, descricao);
    }

    public Venda procurarPorId(String query, String nomeParametro, int id) {
        return (Venda) vendaDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Venda> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
