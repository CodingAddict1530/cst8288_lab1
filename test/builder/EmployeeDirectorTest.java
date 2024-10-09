package builder;

import employee.Employee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author hp
 */
public class EmployeeDirectorTest {

    /**
     * Test of buildEmployee method, of class EmployeeDirector.
     * Testing if it correctly creates employees.
     */
    @Test
    public void testBuildEmployee() {
        
        Employee employee = EmployeeDirector.buildEmployee(new FullTimeEmployeeBuilder(),
                3, "Alexis", "Home", "Janitor", 34, 500);
        assertEquals(employee.getID(), 3);
        assertEquals(employee.getName(), "Alexis");
        assertEquals(employee.getDepartment(), "Home");
        assertEquals(employee.getRole(), "Janitor");
        assertTrue(employee.getWorkingHoursPerWeek() == 34);
        assertTrue(employee.getSalary() == 500);
        
    }
    
}
