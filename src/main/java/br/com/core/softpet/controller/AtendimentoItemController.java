package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.AtendimentoItemDAO;
import java.util.List;

public class AtendimentoItemController<AtendimentoItem> implements IController<AtendimentoItem> {

    private AtendimentoItemDAO atendimentoItemDao = FactoryDAO.getInstanceAtendimentoItemDao();

    public void salvar(AtendimentoItem atendimentoItem) {
        atendimentoItemDao.persist(atendimentoItem);
    }

    public void alterar(AtendimentoItem atendimentoItem) {
        atendimentoItemDao.update(atendimentoItem);
    }

    public void deletar(AtendimentoItem entidade) {
        atendimentoItemDao.delete(entidade);
    }

    public List<AtendimentoItem> procurarPorTodos(String query) {
        return atendimentoItemDao.findByAll(query);
    }

    public List<AtendimentoItem> procurarPorNome(String query, String nome) {
        return atendimentoItemDao.findByName(query, nome);
    }

    public List<AtendimentoItem> procurarPorParam(String query, String param, String descricao) {
        return atendimentoItemDao.findByParam(query, param, descricao);
    }

    public AtendimentoItem procurarPorId(String query, String nomeParametro, int id) {
        return (AtendimentoItem) atendimentoItemDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<AtendimentoItem> procurarPorId(String query, int id) {
        return atendimentoItemDao.findById(query, id);
    }
}
