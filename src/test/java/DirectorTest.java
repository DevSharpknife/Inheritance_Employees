import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Wanda", "999HELP", 50000.00, "Research and Development", 12000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Wanda", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("999HELP", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Frodo");
        assertEquals("Frodo", director.getName());
    }

    @Test
    public void cannotChangeNameToNullValue() {
        director.setName(null);
        assertEquals("Wanda", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.03);
        assertEquals(51500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000.00, director.getBonus(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Research and Development", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(12000000.00, director.getBudget(), 0.01);
    }
}