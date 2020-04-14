package polymorphismAndPureFabrication.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import polymorphismPureProtected.dao.PersonDao;
import polymorphismPureProtected.domain.Person;
import polymorphismPureProtected.drivers.DatabaseDriver;
import polymorphismPureProtected.drivers.MongoDatabaseDriver;
import polymorphismPureProtected.drivers.PostgreSQLDatabaseDriver;

class PersonDaoTest {

    private Person person;

    @BeforeEach
    private void generatePerson() {
        this.person = new Person("Pessoa", "ABC Street, 123", 12,Boolean.TRUE);
    }

    @Test
    @DisplayName("Should be able to insert a new person into a PGSQL database.")
    private void shouldSaveUsingPostgres() {
        DatabaseDriver driver = new PostgreSQLDatabaseDriver();
        var personDao = new PersonDao(driver);

        personDao.save(this.person);
    }

    @Test
    @DisplayName("Should be able to insert a new person into a Mongo database.")
    private void shouldSaveUsingMongo() {
        DatabaseDriver driver = new MongoDatabaseDriver();
        PersonDao personDao = new PersonDao(driver);

        personDao.save(this.person);
    }
}