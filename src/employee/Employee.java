package employee;

/**
 * Represents an Employee.
 */
public abstract class Employee {
    
    /**
     * The id of the employee.
     */
    private int id;
    
    /**
     * The name of the employee.
     */
    private String name;
    
    /**
     * The department of the employee.
     */
    private String department;
    
    /**
     * The role of the employee.
     */
    private String role;
    
    /**
     * The working hours per week of the employee.
     */
    private double workingHoursPerWeek;
    
    /**
     * The salary of the employee.
     */
    private double salary;
    
    /**
     * Instantiates a new Employee Object with attribute being default values.
     */
    public Employee() {
    
    }
    
    /**
     * Instantiates a new Employee Object with attributes reflecting parameter passed in.
     * 
     * @param id The id of the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The role of the employee.
     * @param workingHoursPerWeek The working hours per week of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
        
    }
    
    /**
     * Updates the id of the Employee.
     * 
     * @param id The new id.
     */
    public void setID(int id) {
        
        this.id = id;
    }
    
    /**
     * Updates the name of the Employee.
     * 
     * @param name The new name.
     */
    public void setName(String name) {
        
        this.name = name;
    }
    
    /**
     * Updates the department of the Employee.
     * 
     * @param department The new department.
     */
    public void setDepartment(String department) {
        
        this.department = department;
    }
    /**
     * Updates the role of the Employee.
     * 
     * @param role The new role.
     */
    public void setRole(String role) {
        
        this.role = role;
    }
    
    /**
     * Updates the working hours per week of the Employee.
     * 
     * @param workingHoursPerWeek The new workingHoursPerWeek.
     */
    public void setWrkingHoursPerWeek(double workingHoursPerWeek) {
        
        this.workingHoursPerWeek = workingHoursPerWeek;
    }
    
    /**
     * Updates the salary of the Employee.
     * 
     * @param salary The new salary.
     */
    public void setSalary(double salary) {
        
        this.salary = salary;
    }
    
    /**
     * Retrieves the id of the Employee.
     * 
     * @return id The id.
     */
    public int getID() {
        
        return this.id;
    }
    
    /**
     * Retrieves the name of the Employee.
     * 
     * @return name The name.
     */
    public String getName() {
        
        return this.name;
    }
    
    /**
     * Retrieves the department of the Employee.
     * 
     * @return department The department.
     */
    public String getDepartment() {
        
        return this.department;
    }
    
    /**
     * Retrieves the role of the Employee.
     * 
     * @return role The role.
     */
    public String getRole() {
        
        return this.role;
    }
    
    /**
     * Retrieves the working hours per week of the Employee.
     * 
     * @return workingHoursPerWeek The workingHoursPerWeek.
     */
    public double getWorkingHoursPerWeek() {
        
        return this.workingHoursPerWeek;
    }
    
    /**
     * Retrieves the salary of the Employee.
     * 
     * @return salary The salary.
     */
    public double getSalary() {
        
        return this.salary;
    }
    
    /**
     * Clocks in the employee
     */
    public abstract void clockIn();
    
    /**
     * Clocks out the employee
     */
    public abstract void clockOut();
    
    /**
     * Tracks the hours the employee has worked.
     */
    public abstract void trackWorkHours();
    
}
