package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        
        
        employees.add(new Employee(101, "Dhiwagar", 50000,"Chennai"));
        employees.add(new Employee(102, "Anbarasan", 55000,"Cuddalore"));
        employees.add(new Employee(103, "Arunkumar", 60000,"Coimbatore"));
        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
