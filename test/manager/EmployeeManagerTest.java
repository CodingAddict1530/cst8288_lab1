package manager;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author hp
 */
public class EmployeeManagerTest {

    /**
     * Test of getInstance method, of class EmployeeManager.
     * This tests the singleton behavior.
     */
    @Test
    public void testGetInstance() {
        
        assertEquals(EmployeeManager.getInstance(), EmployeeManager.getInstance());
    }
    
}
