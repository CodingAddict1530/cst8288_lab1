package builder;

import employee.Employee;

/**
 * Represents a Builder for the Employee class.
 */
public interface EmployeeBuilder {
    
    /**
     * Updates the id of the Employee.
     * 
     * @param id The new id.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setID(int id);
    
    /**
     * Updates the name of the Employee.
     * 
     * @param name The new name.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setName(String name);
    
    /**
     * Updates the department of the Employee.
     * 
     * @param department The new department.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setDepartment(String department);
    
    /**
     * Updates the role of the Employee.
     * 
     * @param role The new role.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setRole(String role);
    
    /**
     * Updates the working hours per week of the Employee.
     * 
     * @param workingHoursPerWeek The new workingHoursPerWeel.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setWrkingHoursPerWeek(double workingHoursPerWeek);
    
    /**
     * Updates the salary of the Employee.
     * 
     * @param salary The new salary.
     * @return The EmployeeBuilder.
     */
    public EmployeeBuilder setSalary(double salary);
    
    /**
     * Returns the Employee object.
     * 
     * @return The Employee.
     */
    public Employee getEmployee();
    
}
