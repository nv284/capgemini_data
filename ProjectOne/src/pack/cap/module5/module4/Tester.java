package pack.cap.module5.module4;

class Outer1 
{ 
 int a = 20; 
 static int b = 30; 
 static class Inner1 
 { 
  void show() 
  { 
 // System.out.println(a); // Compile time error. 
    System.out.println(b); 
   } 
  } 
 } 
public class Tester {
	public static void main(String[] args) 
{ 
  System.out.println(Outer1.b); 
  Outer1.Inner1 i = new Outer1.Inner1(); 
    i.show(); 
  } 
}
