package builder;


import employee.Employee;
import employee.FullTimeEmployee;

/**
 *
 * @author hp
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    
    private final Employee employee;
    
    public FullTimeEmployeeBuilder() {
        
        this.employee = new FullTimeEmployee();
    }

    @Override
    public EmployeeBuilder setID(int id) {
        
        this.employee.setID(id);
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        
        this.employee.setName(name);
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        
        this.employee.setDepartment(department);
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        
        this.employee.setRole(role);
        return this;
    }

    @Override
    public EmployeeBuilder setWrkingHoursPerWeek(double workingHoursPerWeek) {
        
        this.employee.setWrkingHoursPerWeek(workingHoursPerWeek);
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        
        this.employee.setSalary(salary);
        return this;
    }
    
    @Override
    public Employee getEmployee() {
        
        return this.employee;
    }
    
}
