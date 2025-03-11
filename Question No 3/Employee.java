package Employee;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String location;
    
    public Employee(int id, String name, double salary, String location) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs." + salary+", Location: "+location);
    }
}
