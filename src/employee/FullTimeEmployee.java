package employee;

/**
 *
 * @author hp
 */
public class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee() {
        
        super();
    }
    
    public FullTimeEmployee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        
        System.out.println("Full time employee " + this.getName() + " has clocked in!");
    }

    @Override
    public void clockOut() {
        
        System.out.println("Full time employee " + this.getName() + " has clocked out!");
    }

    @Override
    public void trackWorkHours() {
        
        System.out.println("Tracking hours for full time employee " + this.getName());
    }
    
}
