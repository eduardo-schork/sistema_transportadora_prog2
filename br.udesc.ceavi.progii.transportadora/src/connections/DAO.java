package connections;

public interface DAO<X> {
    
    boolean persist(X obj) throws Exception;
    boolean update(X obj)throws Exception;
    boolean delete(X obj) throws Exception;
    public Object finById(Class tipo, long id) throws Exception;
    
}
