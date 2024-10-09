package employee;

/**
 *
 * @author hp
 */
public abstract class Employee {
    
    private int id;
    private String name;
    private String department;
    private String role;
    private double workingHoursPerWeek;
    private double salary;
    
    public Employee() {
    
    }
    
    public Employee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
        
    }
    
    public void setID(int id) {
        
        this.id = id;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public void setDepartment(String department) {
        
        this.department = department;
    }
    
    public void setRole(String role) {
        
        this.role = role;
    }
    
    public void setWrkingHoursPerWeek(double workingHoursPerWeek) {
        
        this.workingHoursPerWeek = workingHoursPerWeek;
    }
    
    public void setSalary(double salary) {
        
        this.salary = salary;
    }
    
    public int getID() {
        
        return this.id;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public String getDepartment() {
        
        return this.department;
    }
    
    public String getRole() {
        
        return this.role;
    }
    
    public double getWorkingHoursPerWeek() {
        
        return this.workingHoursPerWeek;
    }
    
    public double getSalary() {
        
        return this.salary;
    }
    
    public abstract void clockIn();
    
    public abstract void clockOut();
    
    public abstract void trackWorkHours();
    
}
