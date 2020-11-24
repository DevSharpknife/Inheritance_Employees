import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DBAdmin;


import static org.junit.Assert.assertEquals;

public class DBATest {

    DBAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DBAdmin("Shona", "666HELL", 21000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Shona", dbAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("666HELL", dbAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(21000.00, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        dbAdmin.setName("Merry");
        assertEquals("Merry", dbAdmin.getName());
    }

    @Test
    public void cannotChangeNameToNullValue() {
        dbAdmin.setName(null);
        assertEquals("Shona", dbAdmin.getName());
    }


    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(0.03);
        assertEquals(21630.00, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(210.00, dbAdmin.getBonus(), 0.01);
    }
}
