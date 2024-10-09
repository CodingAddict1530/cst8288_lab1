package builder;

import employee.Employee;

/**
 *
 * @author hp
 */
public class EmployeeDirector {
    
    public static Employee buildEmployee(EmployeeBuilder eb, int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        return eb.setID(id)
                    .setName(name)
                            .setDepartment(department)
                                .setRole(role)
                                    .setWrkingHoursPerWeek(workingHoursPerWeek)
                                        .setSalary(salary)
                                            .getEmployee();
        
    }
    
}
