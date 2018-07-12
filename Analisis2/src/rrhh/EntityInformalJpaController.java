/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

import Conexcion.exceptions.NonexistentEntityException;
import RRHH.EntityInformal;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USUARIO
 */
public class EntityInformalJpaController implements Serializable {

    public EntityInformalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EntityInformal entityInformal) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entityInformal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EntityInformal entityInformal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entityInformal = em.merge(entityInformal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = entityInformal.getId();
                if (findEntityInformal(id) == null) {
                    throw new NonexistentEntityException("The entityInformal with id " + id + " no longer exists.");
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
            EntityInformal entityInformal;
            try {
                entityInformal = em.getReference(EntityInformal.class, id);
                entityInformal.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entityInformal with id " + id + " no longer exists.", enfe);
            }
            em.remove(entityInformal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EntityInformal> findEntityInformalEntities() {
        return findEntityInformalEntities(true, -1, -1);
    }

    public List<EntityInformal> findEntityInformalEntities(int maxResults, int firstResult) {
        return findEntityInformalEntities(false, maxResults, firstResult);
    }

    private List<EntityInformal> findEntityInformalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EntityInformal.class));
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

    public EntityInformal findEntityInformal(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EntityInformal.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntityInformalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EntityInformal> rt = cq.from(EntityInformal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
