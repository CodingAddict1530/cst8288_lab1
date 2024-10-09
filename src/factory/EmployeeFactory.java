package factory;

import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import builder.PartTimeEmployeeBuilder;
import employee.Employee;
import util.EmployeeType;

/**
 *
 * @author hp
 */
public class EmployeeFactory {
    
    public static Employee createEmployee(EmployeeType type, int id, String name, 
            String department, String role, double workingHoursPerWeek, double salary) {
        
        return EmployeeDirector.buildEmployee(((type == EmployeeType.FULL_TIME) ? new FullTimeEmployeeBuilder() :
                new PartTimeEmployeeBuilder()), id, name, department, role, workingHoursPerWeek, salary);
        
    }
    
}
