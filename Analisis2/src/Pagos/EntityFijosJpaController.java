/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Pagos.EntityFijos;
import exceptions.NonexistentEntityException;

/**
 *
 * @author USUARIO
 */
public class EntityFijosJpaController implements Serializable {

    public EntityFijosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EntityFijos entityFijos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entityFijos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EntityFijos entityFijos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entityFijos = em.merge(entityFijos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = entityFijos.getId();
                if (findEntityFijos(id) == null) {
                    throw new NonexistentEntityException("The entityFijos with id " + id + " no longer exists.");
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
            EntityFijos entityFijos;
            try {
                entityFijos = em.getReference(EntityFijos.class, id);
                entityFijos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entityFijos with id " + id + " no longer exists.", enfe);
            }
            em.remove(entityFijos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EntityFijos> findEntityFijosEntities() {
        return findEntityFijosEntities(true, -1, -1);
    }

    public List<EntityFijos> findEntityFijosEntities(int maxResults, int firstResult) {
        return findEntityFijosEntities(false, maxResults, firstResult);
    }

    private List<EntityFijos> findEntityFijosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EntityFijos.class));
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

    public EntityFijos findEntityFijos(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EntityFijos.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntityFijosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EntityFijos> rt = cq.from(EntityFijos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
