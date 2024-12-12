package pack.cap.module3.ctrl_stmt;

public class CallByValue {
	
	
	int change(int b) {
		++b; // change will be  in the local variable only
		return b; // return statement 
	}
	 int x=20;
	 int demo() {
		 return x;
	 }
	 
	void modify(int x ) {
		System.out.println("Call By Value ");
		x=x+300;
		System.out.println("Value of x after modifcation "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CallByValue c1 = new CallByValue();
       c1.modify(c1.x);//calling method 
       System.out.println("Original value of x :"+ c1.x);
       
       int y = c1.demo();
       System.out.println(y);
       int a = 20 ;
       int x = c1.change(a); //passing a value to the called method
       System.out.println("Value of a after passing : "+a);
       System.out.println("Value of x after modifying :"+x );
       
       
       int u = 100;
       System.out.println("Before return statement ");
       if(u==10)
    	   return ;
       System.out.println("After return statement ");
	}

}