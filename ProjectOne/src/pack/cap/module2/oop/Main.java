package pack.cap.module2.oop;
//one -to - one Association 

class Passport {
	private String passportNumber;
	
	
	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}


	public String getPassportNumber() {
		return passportNumber;
	}
	
}
class Person {
	private String name ; 
	private Passport pp ; // one to one Association 
	
	
	public Person(String name, Passport pp) {
		super();
		this.name = name;
		this.pp = pp;
	}


	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Passport Number : "+pp.getPassportNumber());
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Passport p1 = new Passport("A12346HJ");
		Person p2 = new Person("Mike" , p1);
		p2.displayInfo();
	}

}