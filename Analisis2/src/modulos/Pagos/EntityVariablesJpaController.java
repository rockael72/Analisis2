/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;

import Conexcion.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modulos.Pagos.EntityVariables;

/**
 *
 * @author USUARIO
 */
public class EntityVariablesJpaController implements Serializable {

    public EntityVariablesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EntityVariables entityVariables) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entityVariables);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EntityVariables entityVariables) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entityVariables = em.merge(entityVariables);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = entityVariables.getId();
                if (findEntityVariables(id) == null) {
                    throw new NonexistentEntityException("The entityVariables with id " + id + " no longer exists.");
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
            EntityVariables entityVariables;
            try {
                entityVariables = em.getReference(EntityVariables.class, id);
                entityVariables.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entityVariables with id " + id + " no longer exists.", enfe);
            }
            em.remove(entityVariables);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EntityVariables> findEntityVariablesEntities() {
        return findEntityVariablesEntities(true, -1, -1);
    }

    public List<EntityVariables> findEntityVariablesEntities(int maxResults, int firstResult) {
        return findEntityVariablesEntities(false, maxResults, firstResult);
    }

    private List<EntityVariables> findEntityVariablesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EntityVariables.class));
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

    public EntityVariables findEntityVariables(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EntityVariables.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntityVariablesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EntityVariables> rt = cq.from(EntityVariables.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
