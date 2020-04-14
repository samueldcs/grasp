package polymorphismPureProtected.drivers;

public interface DatabaseDriver {
    void persist(Object object);
    void delete(Object object);
}
