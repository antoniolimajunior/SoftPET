package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.ClienteDAO;
import java.util.List;

public class ClienteController<Cliente> implements IController<Cliente> {

    private ClienteDAO clienteDao = FactoryDAO.getInstanceClienteDao();

    public void salvar(Cliente cliente) {
        clienteDao.persist(cliente);
    }

    public void alterar(Cliente cliente) {
        clienteDao.update(cliente);
    }

    public void deletar(Cliente entidade) {
        clienteDao.delete(entidade);
    }

    public List<Cliente> procurarPorTodos(String query) {
        return clienteDao.findByAll(query);
    }

    public List<Cliente> procurarPorNome(String query, String nome) {
        return clienteDao.findByName(query, nome);
    }
    
    public List<Cliente> procurarPorParam(String query, String param, String descricao) {
        return clienteDao.findByParam(query, param, descricao);
    }

    public Cliente procurarPorId(String query, String nomeParametro, int id) {
        return (Cliente) clienteDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Cliente> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
