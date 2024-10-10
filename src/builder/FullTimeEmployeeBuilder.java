package builder;

import employee.Employee;
import employee.FullTimeEmployee;

/**
 * Builds a FullTimeEmployee object.
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    
    /**
     * The Employee.
     */
    private final Employee employee;
    
    /**
     * Instantiates a new FullTimeEmployeeBuilder object.
     */
    public FullTimeEmployeeBuilder() {
        
        this.employee = new FullTimeEmployee();
    }

    /**
     * Updates the id of the Employee.
     * 
     * @param id The new id.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setID(int id) {
        
        this.employee.setID(id);
        return this;
    }

    /**
     * Updates the name of the Employee.
     * 
     * @param name The new name.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setName(String name) {
        
        this.employee.setName(name);
        return this;
    }

    /**
     * Updates the department of the Employee.
     * 
     * @param department The new department.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setDepartment(String department) {
        
        this.employee.setDepartment(department);
        return this;
    }

    /**
     * Updates the role of the Employee.
     * 
     * @param role The new role.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setRole(String role) {
        
        this.employee.setRole(role);
        return this;
    }

    /**
     * Updates the working hours per week of the Employee.
     * 
     * @param workingHoursPerWeek The new workingHoursPerWeel.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setWrkingHoursPerWeek(double workingHoursPerWeek) {
        
        this.employee.setWrkingHoursPerWeek(workingHoursPerWeek);
        return this;
    }

    /**
     * Updates the salary of the Employee.
     * 
     * @param salary The new salary.
     * @return The EmployeeBuilder.
     */
    @Override
    public EmployeeBuilder setSalary(double salary) {
        
        this.employee.setSalary(salary);
        return this;
    }
    
    /**
     * Returns the Employee object.
     * 
     * @return The Employee.
     */
    @Override
    public Employee getEmployee() {
        
        return this.employee;
    }
    
}
