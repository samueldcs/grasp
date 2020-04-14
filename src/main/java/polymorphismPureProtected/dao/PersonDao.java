package polymorphismPureProtected.dao;

import polymorphismPureProtected.domain.Person;
import polymorphismPureProtected.drivers.DatabaseDriver;

public class PersonDao {

    private final DatabaseDriver driver;

    public PersonDao(DatabaseDriver driver) {
        this.driver = driver;
    }

    public void save(Person person) {
        this.driver.persist(person);
    }

    public void delete(Person person) {
        this.driver.delete(person);
    }
}
