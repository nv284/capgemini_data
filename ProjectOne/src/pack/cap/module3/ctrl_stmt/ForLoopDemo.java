package pack.cap.module3.ctrl_stmt;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =5 , factorial =1;
       for(int i= 1 ;i<=10 ; i++) {
    	   System.out.println(i+ "  ");
       }
       for(int i =1 ; i<number ;i++) {
    	   factorial *=1;
       }
       System.out.println("Factorial of "+ number +" is :"+factorial);
       int a, b;
       
       for(a=1,b=5;a<=5 ;a++,b-- ) {
    	   System.out.println(a+ " \t"+ b);
    	  
       }
       for(a=1 ;a< 20 && b<20 ;b++) {
    	   b= b+a ;
       }
       System.out.println("sum = "+ b);
	}
	
	/*  ForEach Loop 
	 * for(data_type identifier : expression)
	 * {
	 *       loop body 
	 * } * */

}
