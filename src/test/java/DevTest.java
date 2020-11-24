import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;


import static org.junit.Assert.assertEquals;

public class DevTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Shania", "321SAN", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Shania", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("321SAN", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.setName("Pippin");
        assertEquals("Pippin", developer.getName());
    }

    @Test
    public void cannotChangeNameToNullValue() {
        developer.setName(null);
        assertEquals("Shania", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(0.03);
        assertEquals(25750.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250.00, developer.getBonus(), 0.01);
    }
}
