package connections;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPADAO<Object> implements DAO<Object>{
    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    public JPADAO() {
        super();
        emf = javax.persistence.Persistence.createEntityManagerFactory("TransUdescPU");
        em = emf.createEntityManager();
    }
    
    
    public boolean persist(Object obj) throws Exception {
        em.getTransaction().begin();
        
        try {
            em.persist(obj);
            em.getTransaction().commit();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        
        return false;
    }

    public Object finById(Class tipo, long id) throws Exception {
        Object object = null;
        em.getTransaction().begin();
        
        try {
            object = (Object) em.find(tipo, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        
        return object;
    }
}