import staff.management.Manager;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
    manager = new Manager("Gerry", "NAS123", 28000.00, "Human Resources");
    }

    @Test
    public void hasName() {
        assertEquals("Gerry", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NAS123", manager.getNiNumber());
    }
    
    @Test
    public void hasSalary() {
        assertEquals(28000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Bilbo");
        assertEquals("Bilbo", manager.getName());
    }

    @Test
    public void cannotChangeNameToNullValue() {
        manager.setName(null);
        assertEquals("Gerry", manager.getName());
    }
    
   @Test
   public void canRaiseSalary() {
       manager.raiseSalary(0.03);
       assertEquals(28840.00, manager.getSalary(), 0.01);
   }

   @Test
   public void canPayBonus() {
        assertEquals(280.00, manager.getBonus(), 0.01);
   }

   @Test
   public void hasDeptName() {
        assertEquals("Human Resources", manager.getDeptName());
   }
}
