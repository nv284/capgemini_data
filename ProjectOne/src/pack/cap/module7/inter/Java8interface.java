package pack.cap.module7.inter;

public interface Java8interface {

	//abstract 
	void calculate (int x , int y , int z );
	
	//java 8 --> default method 
	default void call() {
		System.out.println(" This is a default method ");
	}
	
	
	// java 8 ---> static method  
	static void pay() {
		System.out.println(" This is static method ");
	}
	
	
	
}