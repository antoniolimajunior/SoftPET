package br.com.core.softpet.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseDAO<T> implements IBaseDAO<T> {

    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("SOFTPETPU");

    public void persist(T entidade) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(entidade);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void update(T entidade) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(entidade);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void delete(T entidade) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            if (!em.contains(entidade)) {
                entidade = em.merge(entidade);
            }
            em.remove(entidade);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<T> findByAll(String query) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public List<T> findByName(String query, String nome) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).setParameter("nome", "%" + nome.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public List<T> findByParam(String query, String param, String nome) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).setParameter(param, "%" + nome.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    public List<T> findById(String query, int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).setParameter("id", id).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public T findById(String query, String nomeParametro, int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return (T) em.createNamedQuery(query).setParameter(nomeParametro, id).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
}
