/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import orm.exceptions.NonexistentEntityException;

/**
 *
 * @author anayo
 */
public class OrmProductoJpaController implements Serializable {

    public OrmProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OrmProducto ormProducto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ormProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrmProducto ormProducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ormProducto = em.merge(ormProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ormProducto.getId();
                if (findOrmProducto(id) == null) {
                    throw new NonexistentEntityException("The ormProducto with id " + id + " no longer exists.");
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
            OrmProducto ormProducto;
            try {
                ormProducto = em.getReference(OrmProducto.class, id);
                ormProducto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ormProducto with id " + id + " no longer exists.", enfe);
            }
            em.remove(ormProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrmProducto> findOrmProductoEntities() {
        return findOrmProductoEntities(true, -1, -1);
    }

    public List<OrmProducto> findOrmProductoEntities(int maxResults, int firstResult) {
        return findOrmProductoEntities(false, maxResults, firstResult);
    }

    private List<OrmProducto> findOrmProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrmProducto.class));
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

    public OrmProducto findOrmProducto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrmProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrmProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrmProducto> rt = cq.from(OrmProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        public List< OrmProducto > findProducto(String dato) {
            EntityManager em = getEntityManager();
            TypedQuery<OrmProducto> query = em.createNamedQuery("OrmProducto.findProducto", OrmProducto.class);
            query.setParameter("nombre", dato);
            return (List<OrmProducto>)query.getResultList();
    }
    
}
