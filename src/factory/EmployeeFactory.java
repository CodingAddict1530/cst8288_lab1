package factory;

import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import builder.PartTimeEmployeeBuilder;
import employee.Employee;
import util.EmployeeType;

/**
 * Creates different types of employees depending on the input.
 */
public class EmployeeFactory {
    
    /**
     * Creates an Employee object.
     * The type of the employee depends on the EmployeeType input.
     * 
     * @param type The type of the employee.
     * @param id The id of the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The role of the employee.
     * @param workingHoursPerWeek The working hours per week of the employee.
     * @param salary The salary of the employee.
     * @return The Employee Object.
     */
    public static Employee createEmployee(EmployeeType type, int id, String name, 
            String department, String role, double workingHoursPerWeek, double salary) {
        
        return EmployeeDirector.buildEmployee(((type == EmployeeType.FULL_TIME) ? new FullTimeEmployeeBuilder() :
                new PartTimeEmployeeBuilder()), id, name, department, role, workingHoursPerWeek, salary);
        
    }
    
}
