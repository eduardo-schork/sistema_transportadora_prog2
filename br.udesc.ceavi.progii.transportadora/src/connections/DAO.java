package connections;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author André Cristen
 */
public class DAO {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public DAO() {
        emf = javax.persistence.Persistence.createEntityManagerFactory("TransUdescPU");
        em = emf.createEntityManager();
    }

    public boolean insert(Object obj) throws Exception {
        em.getTransaction().begin();
        try {
            em.persist(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        return false;
    }

    public boolean update(Object obj) throws Exception {
        em.getTransaction().begin();
        try {
            em.merge(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        return false;
    }
    
    public boolean delete(Object obj) throws Exception {
        em.getTransaction().begin();
        try {
            em.remove(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        return false;
    }

    public Object findById(Class tipo, long id) throws Exception {
        Object object = null;
        em.getTransaction().begin();
        try {
            object = em.find(tipo, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return object;
    }

}
