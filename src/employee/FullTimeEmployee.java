package employee;

/**
 * Represents a Full time employee.
 */
public class FullTimeEmployee extends Employee {
    
    /**
     * Instantiates a new FullTimeEmployee Object with attribute being default values.
     */
    public FullTimeEmployee() {
        
        super();
    }
    
    /**
     * Instantiates a new FullTimeEmployee Object with attributes reflecting parameter passed in.
     * 
     * @param id The id of the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The role of the employee.
     * @param workingHoursPerWeek The working hours per week of the employee.
     * @param salary The salary of the employee.
     */
    public FullTimeEmployee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /**
     * Clocks in the employee
     */
    @Override
    public void clockIn() {
        
        System.out.println("Full time employee " + this.getName() + " has clocked in!");
    }

    /**
     * Clocks out the employee
     */
    @Override
    public void clockOut() {
        
        System.out.println("Full time employee " + this.getName() + " has clocked out!");
    }

    /**
     * Tracks the hours the employee has worked.
     */
    @Override
    public void trackWorkHours() {
        
        System.out.println("Tracking hours for full time employee " + this.getName());
    }
    
}
