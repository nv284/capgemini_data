package pack.cap.module6.Arr;

import java.util.Arrays;

class Employee {
    int empId;
    String name;
    double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
    
    
    
}


public class EmployeeManagement {

	
	public static void printEmp(Employee[] emp) {
		for(Employee e : emp) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee [] emp = { new Employee(101, "Alice", 250000), 
		new Employee(102,"Sam",34000),
		new Employee(103, "David", 50000),new Employee(104, "Eva", 45000)};
	
	System.out.println("Original Employee Data:");
	printEmp(emp);
    Employee [] empCopy ={ new Employee(101, "Alice", 250000), 
    		new Employee(102,"Sam",34000),
    		new Employee(103, "David", 50000),new Employee(104, "Eva", 45000)};
    
    
    boolean isEqual = Arrays.equals(emp, empCopy);
    System.out.println("\nAre the two arrays equal? " + isEqual);
    
    
    
    System.out.println("\nUpdating salaries...");
    Arrays.fill(emp, new Employee(0, "", 10000)); 
    for (Employee e : emp) {
        e.salary += 10000;
    }
    
    
    System.out.println("Employees after salary raise:");
    printEmp(emp);
    
    
    
    Employee[] copiedEmployees = Arrays.copyOf(emp, emp.length);
    System.out.println("\nCopied Employee Data:");
    printEmp(copiedEmployees);

}
}