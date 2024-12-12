package pack.cap.module1.basic;

/*
 * Local variable - method,  constructor  , 
 * block -< scope -limited to the block in which is declared -> 
 * lifetime -> till the method or block is executing , destroyed once execution is finished 
 * 
 * */
public class LocalVeriableDemo {
	//Instance variable 
	String model ; int year ;
	void displayInfo() {
		System.out.println(" Model :"+ model );
		System.out.println(" Year :"+ year );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Local variable 		
 int localVar = 100;
 System.out.println("Localvariable = " + localVar);
 LocalVeriableDemo l1 = new LocalVeriableDemo();
 l1.displayInfo();
 
	}

}
