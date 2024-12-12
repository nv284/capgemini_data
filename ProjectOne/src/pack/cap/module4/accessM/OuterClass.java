package pack.cap.module4.accessM;
/*
 * Non-static Nested class , static nested class , local class , anonymous class 
 * Non-static Nested Class: When the inner class logically depends on the instance of the outer class and needs to access its non-static members.
Static Nested Class: When the inner class does not need to access instance variables of the outer class and can work with static members only.
Local Class: When you need a class that is only used within the context of a specific method.
Anonymous Class: When you need a short-lived class to implement an interface or extend a class without creating a separate named class.
  */

//Anonymous Class
interface Greet {
	void sayHello();
}


class Outer {
	private int outerValue = 100;
	private static int staticvalue = 20;
	//non static inner class 
	  class Inner {
		   void disp() {
			   System.out.println("Outer class value : "+ outerValue);
		   }
	  }
	   void createInner() {
		   Inner in = new Inner();
		   in.disp();
	   }
	   //static inner class 
	   static class StaticNested {
		   void display() {
			   System.out.println("Static vlaue from outer class : "+staticvalue );
		   }
	   }
	   
	 //outer class method
	   void outerMethod() {
		   int local_var = 200;
		   //local class 
		   class Local {
			   void dispLocal() {
				   System.out.println("Inside Local class "+local_var);
			   }
		   }
		   Local l1 = new Local();
		   l1.dispLocal();
	   }
	   
}


public class OuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer out = new Outer();
       out.createInner();
       Outer.StaticNested nested = new Outer.StaticNested();
       nested.display();
       out.outerMethod();
       //Anonymous class 
         Greet g1 = new Greet() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class ");
			}
		};
	}

}
