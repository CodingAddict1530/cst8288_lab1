package manager;

import employee.Employee;
import java.util.ArrayList;

/**
 * Manages all employees.
 */
public class EmployeeManager {
    
    /**
     * The one and only instance of this class.
     */
    private static final EmployeeManager employeeManager = new EmployeeManager();
    
    /**
     * A list containing all employees.
     */
    private final ArrayList<Employee> employees = new ArrayList<>();
    
    /**
     * Instantiates a new EmployeeManager object.
     * It is private hence limiting further creation of Objects.
     */
    private EmployeeManager() {
        
    }
    
    /**
     * Retrieves the instance of EmployeeManager.
     * 
     * @return an EmployeeManager instance.
     */
    public static EmployeeManager getInstance() {
        
        return employeeManager;
    }
    /**
     * Adds an employee to the list of Employees.
     * 
     * @param e The Employee.
     * @return Whether the operation was a success or not.
     */
    public boolean addEmployee(Employee e) {
        
        return this.employees.add(e);
    }
    
    /**
     * Removes an employee from the list of Employees.
     * 
     * @param e The Employee.
     * @return Whether the operation was a success or not.
     */
    public boolean removeEmployee(Employee e) {
        
        return this.employees.remove(e);
    }
    
    /**
     * Retrieves the whole list of Employees.
     * 
     * @return The list of Employees.
     */
    public ArrayList<Employee> retrieveEmployees() {
        
        return this.employees;
    }
    
}
