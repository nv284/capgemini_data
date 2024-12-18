package pack.cap.module8.io;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   
	   Console c = System.console();
	   
	   if(c!=null) {
		   System.out.printf("console is available !");
		   
	   }else {
		   System.out.printf("No ");
		   return;
	   }
	   
	   System.out.println("Enter your Name :");
	   String name = c.readLine();
	   System.out.println("Hello , "+name);
	   
   }catch (Exception e) {
	// TODO: handle exception
}
	}

}
