package pack.cap.module5.module4;

//super class 
class Employee{
	String name ; int employeeId ; double salary ;


	protected Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public void work() {
		System.out.println(name + "is working as employee ");
	}
	public void getSalary() {
		System.out.println(name+ " Is getting "+salary+ " as a Normal employee ");
	}
	
}

//subclass 
class Manager extends Employee{
	
	String team ;

	protected Manager(String name, int employeeId, double salary, String team) {
		super(name, employeeId, salary);
		this.team = team;
	}
	public void manageTeam() {
		System.out.println(name + " is Managing the Team As a Manager "+ team );
	}
	
}
public class SingleInheritance_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Manager m = new Manager("Sam", 101, 85000.0, "Development Team");
      m.work();m.getSalary();m.manageTeam();
	}

}
