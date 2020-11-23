import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DBAdmin;
import staff.techstaff.Developer;

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
}
