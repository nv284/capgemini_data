package pack.cap.module7.inter;


public interface MyfunctionalInterface {
	
	void apply(); //SAM
	void show();
	
	//default method 
	default void deafultMethod() {
		System.out.println("This is a default method ....");
	}
	
	//static method 
	static void  staticMethod() {
		System.out.println("this is a static method .....");
	}

}