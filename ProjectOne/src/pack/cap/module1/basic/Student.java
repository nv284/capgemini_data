package pack.cap.module1.basic;

public class Student {
	//variable 

	int roll_no ;
	String name ; 
	
	//method
	void display() {
		System.out.println("name :"+name);
		System.out.println("roll_no :"+ roll_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 88;
		float f = 10.6f; //0.0f
		double d = 1345.6; //0.0d
		//double and float 
		double pi ,r ;
		r= 5.5;
		pi=3.1416;
		double area = pi*r*r;
		System.out.println("Area of Circle : "+area );
		short num = 220;
		int lightSpeed =186282 ; 
		long days =1000;
		long second =days*24*60*60 ;
		long distance = lightSpeed * second;
		
		System.out.println(" In 100 days distance travled by light : "+ distance +" miles ");
		
		System.out.println("byte :" + num );
		// object initialization by using consturtor 
         Student s1 = new Student();
         s1.display();
         
	}

}
