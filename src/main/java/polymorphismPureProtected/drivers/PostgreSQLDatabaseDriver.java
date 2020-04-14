package polymorphismPureProtected.drivers;

public class PostgreSQLDatabaseDriver implements DatabaseDriver {

    @Override
    public void persist(Object object) {
        System.out.println("Object was persisted in PGSQL.");
    }

    @Override
    public void delete(Object object) {
        System.out.println("Object was deleted in PGSQL!");
    }
}
