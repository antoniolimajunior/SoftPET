package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.AtendimentoDAO;
import java.util.List;

public class AtendimentoController<Atendimento> implements IController<Atendimento> {

    private AtendimentoDAO atendimentoDao = FactoryDAO.getInstanceAtendimentoDao();

    public void salvar(Atendimento atendimento) {
        atendimentoDao.persist(atendimento);
    }

    public void alterar(Atendimento atendimento) {
        atendimentoDao.update(atendimento);
    }

    public void deletar(Atendimento entidade) {
        atendimentoDao.delete(entidade);
    }

    public List<Atendimento> procurarPorTodos(String query) {
        return atendimentoDao.findByAll(query);
    }

    public List<Atendimento> procurarPorNome(String query, String nome) {
        return atendimentoDao.findByName(query, nome);
    }
    
    public List<Atendimento> procurarPorParam(String query, String param, String descricao) {
        return atendimentoDao.findByParam(query, param, descricao);
    }

    public Atendimento procurarPorId(String query, String nomeParametro, int id) {
        return (Atendimento) atendimentoDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Atendimento> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
