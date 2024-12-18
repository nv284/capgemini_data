package pack.cap.module9.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
}

public class EmployeeList {

	public static void printData(ArrayList<Employee> e) {
		for(Employee e1 : e) {
			System.out.println(e1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      ArrayList<Employee> emp = new ArrayList<Employee>();
      emp.add(new Employee("Jhon", "1234, High Street"));
      emp.add(new Employee("Kim", "444, pine Street"));
      emp.add(new Employee("Bob", "1634, Avenu Street"));
      emp.add(new Employee("Sam", "224, Maple Lane"));
      
      //display 
      System.out.println("Employee data ");
      printData(emp);
      
      // find employee 
      System.out.println(" \n Enter the name of employee to find ");
      String findName = sc.nextLine();
      boolean found = false;
      for(Employee e1: emp) {
    	  if(e1.getName().equalsIgnoreCase(findName)) {
    		  System.out.println("Employee found :"+emp);
    		  found = true ;
    		  break;
    	  }
    	  
      }if(! found) {
    	  System.out.println("Employee Not found ");
      }
      
      //remove 
      System.out.println("Enter the name of the employee to remove ");
      String rem = sc.nextLine();
      emp.removeIf(emp1->emp1.getName().equalsIgnoreCase(rem));
      System.out.println("Employee removed and list after remiving ");
      printData(emp);
      
      
      
      
   // Add a new employee at a specific position
      System.out.print("\nEnter the name and address of the new employee to add (at a specific position): ");
      String newName = sc.nextLine();
      String newAddress = sc.nextLine();
      System.out.print("Enter the position to add the new employee: ");
      int position = sc.nextInt();
      emp.add(position, new Employee(newName, newAddress));

      System.out.println("\nEmployee List after Adding New Employee:");
      printData(emp);

      // Final list where employee names and addresses are shown together
      System.out.println("\nFinal Employee List with Names and Addresses:");
      for (Employee e : emp) {
          System.out.println(emp);
      }
      
      
      
      
	}

}
