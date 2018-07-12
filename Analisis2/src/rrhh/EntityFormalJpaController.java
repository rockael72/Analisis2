/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

import Conexcion.exceptions.NonexistentEntityException;
import RRHH.EntityFormal;
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
public class EntityFormalJpaController implements Serializable {

    public EntityFormalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EntityFormal entityFormal) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entityFormal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EntityFormal entityFormal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entityFormal = em.merge(entityFormal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = entityFormal.getId();
                if (findEntityFormal(id) == null) {
                    throw new NonexistentEntityException("The entityFormal with id " + id + " no longer exists.");
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
            EntityFormal entityFormal;
            try {
                entityFormal = em.getReference(EntityFormal.class, id);
                entityFormal.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entityFormal with id " + id + " no longer exists.", enfe);
            }
            em.remove(entityFormal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EntityFormal> findEntityFormalEntities() {
        return findEntityFormalEntities(true, -1, -1);
    }

    public List<EntityFormal> findEntityFormalEntities(int maxResults, int firstResult) {
        return findEntityFormalEntities(false, maxResults, firstResult);
    }

    private List<EntityFormal> findEntityFormalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EntityFormal.class));
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

    public EntityFormal findEntityFormal(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EntityFormal.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntityFormalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EntityFormal> rt = cq.from(EntityFormal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
