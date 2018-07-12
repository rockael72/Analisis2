/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import orm.exceptions.NonexistentEntityException;

/**
 *
 * @author rocka
 */
public class OrmUsuarioJpaController implements Serializable {

    public OrmUsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
   
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OrmUsuario ormUsuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ormUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrmUsuario ormUsuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ormUsuario = em.merge(ormUsuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ormUsuario.getId();
                if (findOrmUsuario(id) == null) {
                    throw new NonexistentEntityException("The ormUsuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            OrmUsuario ormUsuario;
            try {
                ormUsuario = em.getReference(OrmUsuario.class, id);
                ormUsuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ormUsuario with id " + id + " no longer exists.", enfe);
            }
            em.remove(ormUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrmUsuario> findOrmUsuarioEntities() {
        return findOrmUsuarioEntities(true, -1, -1);
    }

    public List<OrmUsuario> findOrmUsuarioEntities(int maxResults, int firstResult) {
        return findOrmUsuarioEntities(false, maxResults, firstResult);
    }

    private List<OrmUsuario> findOrmUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrmUsuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public OrmUsuario findOrmUsuario(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrmUsuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrmUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrmUsuario> rt = cq.from(OrmUsuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
