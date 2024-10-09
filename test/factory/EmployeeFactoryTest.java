package factory;

import employee.FullTimeEmployee;
import employee.PartTimeEmployee;
import org.junit.Test;
import static org.junit.Assert.*;
import util.EmployeeType;

/**
 *
 * @author hp
 */
public class EmployeeFactoryTest {

    /**
     * Test of createEmployee method, of class EmployeeFactory.
     * Testing if it correctly creates different employees.
     */
    @Test
    public void testCreateEmployee() {
        
        assertTrue(EmployeeFactory.createEmployee(EmployeeType.FULL_TIME, 1, "Jack", "", "Guard", 4, 400) instanceof FullTimeEmployee);
        assertTrue(EmployeeFactory.createEmployee(EmployeeType.PART_TIME, 1, "Jack", "", "Guard", 4, 400) instanceof PartTimeEmployee);
        
    }
    
}
