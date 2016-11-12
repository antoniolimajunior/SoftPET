package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.UsuarioDAO;
import java.util.List;

public class UsuarioController<Usuario> implements IController<Usuario> {

    private UsuarioDAO usuarioDao = FactoryDAO.getInstanceUsuarioDao();

    public void salvar(Usuario usuario) {
        usuarioDao.persist(usuario);
    }

    public void alterar(Usuario usuario) {
        usuarioDao.update(usuario);
    }

    public void deletar(Usuario entidade) {
        usuarioDao.delete(entidade);
    }

    public List<Usuario> procurarPorTodos(String query) {
        return usuarioDao.findByAll(query);
    }

    public List<Usuario> procurarPorNome(String query, String nome) {
        return usuarioDao.findByName(query, nome);
    }
    
    public List<Usuario> procurarPorParam(String query, String param, String descricao) {
        return usuarioDao.findByParam(query, param, descricao);
    }

    public Usuario procurarPorId(String query, String nomeParametro, int id) {
        return (Usuario) usuarioDao.findById(query, nomeParametro, id);
    }
    
    @Override
    public List<Usuario> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
