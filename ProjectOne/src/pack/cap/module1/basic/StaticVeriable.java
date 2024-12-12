package pack.cap.module1.basic;


/*(static variable)
 * class variable - it is always declared with static keyword and shared by all the instance of the class .
 * scope -> accessible by all methods , constructor , block . can be access without object 
 * lifetime - it is tide to the lifetime of the class . created when class is loaded and ended when program ended 
 * 
 * */
public class StaticVeriable {
	
	//class variable or static variable
	static int count = 0;
	void increment () {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StaticVeriable s1 = new StaticVeriable();
    StaticVeriable s2 = new StaticVeriable();
    s1.increment();
    s2.increment();
    System.out.println("Total count : "+StaticVeriable.count);
	}

}
