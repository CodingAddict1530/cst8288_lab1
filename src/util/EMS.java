package util;

import employee.Employee;
import employee.FullTimeEmployee;
import factory.EmployeeFactory;
import manager.EmployeeManager;

/**
 *
 * @author hp
 */
public class EMS {
    
    public static void main(String[] args) {
        
        for (String emp: new String[] {"0,Alexis,IDK,Servant,34,3000", "1,George,IDK,Janitor,44,1000"}) {
            
            for (EmployeeType et: new EmployeeType[] {EmployeeType.FULL_TIME, EmployeeType.PART_TIME}) {
                
                EmployeeManager.getInstance().addEmployee(EmployeeFactory.createEmployee(
                    et, Integer.parseInt(emp.split(",")[0]), emp.split(",")[1],
                        emp.split(",")[2], emp.split(",")[3], Double.parseDouble(emp.split(",")[4]), Double.parseDouble(emp.split(",")[5])));
                
            }
            
        }
        
        for (Employee e: EmployeeManager.getInstance().retrieveEmployees()) {
            
            System.out.println("Name: " + e.getName() + "\nType: " + ((e instanceof FullTimeEmployee) ? 
                    "Full time" : "Part time") + "\n\n");
        }
        
    }
    
}
