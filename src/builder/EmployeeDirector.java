package builder;

import employee.Employee;

/**
 * Uses an EmployeeBuilder to construct an Employee.
 */
public class EmployeeDirector {
    
    /**
     * Assigns values to the attributes of en Employee object created by an EmployeeBuilder.
     * 
     * @param eb The EmployeeBuilder.
     * @param id The id of the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The role of the employee.
     * @param workingHoursPerWeek The working hours per week of the employee.
     * @param salary The salary of the employee.
     * @return 
     */
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
