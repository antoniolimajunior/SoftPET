package br.com.core.softpet.dao;

import javax.persistence.EntityManager;

public class UsuarioDAO<Usuario> extends BaseDAO<Usuario> {

    public Usuario findByLogin(String query, String usuario, String senha) {
        EntityManager em = super.emf.createEntityManager();
        try {
            return (Usuario) em.createNamedQuery(query).setParameter("usuario", usuario).setParameter("senha", senha).getSingleResult();
        } catch (Exception ex) {
            return null;
        } finally {
            em.close();
        }
    }
}
