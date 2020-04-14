package polymorphismPureProtected.drivers;

public class MongoDatabaseDriver implements DatabaseDriver {

    @Override
    public void persist(Object object) {
        System.out.println("Object was persisted in MongoDB.");
    }

    @Override
    public void delete(Object object) {
        System.out.println("Object was deleted in MongoDB!");
    }
}
