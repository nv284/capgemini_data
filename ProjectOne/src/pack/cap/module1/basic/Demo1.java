package pack.cap.module1.basic;

public class Demo1 {
	
	/*(non- static variable )
	 * instance variable = declared within class but oytside the any method , constructor , block . every object can has 
	 * its own copy of instance variable .
	 * scope = are accessible by all methods , block , constructors 
	 * lifetime -> it is tide to the lifetime of the object they belong to 
	 * */
	
	
	/*(static variable)
	 * class variable - it is always declared with static keyword and shared by all the instance of the class .
	 * scope -> accessible by all methods , constructor , block . can be access without object 
	 * lifetime - it is tide to the lifetime of the class . created when class is loaded and ended when program ended 
	 * 
	 * */
	 // Instance variable
	int instancevar = 10;
	// Class variable (static)
	static int classvar = 20;
	void display() {
		// Local variable
		int localVar = 30;
		System.out.println("Instance variable = "+instancevar);
		System.out.println("Local Variable = "+localVar);
		System.out.println("Static variable = "+classvar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Class variable or static variable => "+ classvar);
        Demo1 d1 = new Demo1();
        System.out.println("Instance variable => "+d1.instancevar);
        d1.display();
	}

}
