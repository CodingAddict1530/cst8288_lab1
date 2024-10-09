package manager;


import employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class EmployeeManager {
    
    private static final EmployeeManager employeeManager = new EmployeeManager();
    private final ArrayList<Employee> employees = new ArrayList<>();
    
    private EmployeeManager() {
        
    }
    
    public static EmployeeManager getInstance() {
        
        return employeeManager;
    }
    
    public boolean addEmployee(Employee e) {
        
        return this.employees.add(e);
    }
    
    public boolean removeEmployee(Employee e) {
        
        return this.employees.remove(e);
    }
    
    public ArrayList<Employee> retrieveEmployees() {
        
        return this.employees;
    }
    
}
