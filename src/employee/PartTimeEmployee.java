package employee;

/**
 *
 * @author hp
 */
public class PartTimeEmployee extends Employee {
    
    public PartTimeEmployee() {
        
        super();
    }
    
    public PartTimeEmployee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        
        System.out.println("Part time employee " + this.getName() + " has clocked in!");
    }

    @Override
    public void clockOut() {
        
        System.out.println("Part time employee " + this.getName() + " has clocked out!");
    }

    @Override
    public void trackWorkHours() {
        
        System.out.println("Tracking hours for part time employee " + this.getName());
    }
    
}
