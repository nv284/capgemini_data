package pack.cap.module3.ctrl_stmt;

import java.util.Scanner;

public class NestedIfelse_demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter the number of copies to be printed");
	     int noOfCopies = sc.nextInt();
	     if(noOfCopies  > 0 && noOfCopies < 100) {
	    	 double pricePerCopies = 0.30;
	    	 System.out.println("price per copy : "+ " "+pricePerCopies);
	    	double totalcost = noOfCopies * pricePerCopies;
	    	System.out.println("Total cost is : "+ totalcost);
	     }
	     else if(noOfCopies  > 100 && noOfCopies < 500) {
	    	 double pricePerCopies = 0.28;
	    	 System.out.println("price per copy : "+ " "+pricePerCopies);
	    	double totalcost = noOfCopies * pricePerCopies;
	    	System.out.println("Total cost is : "+ totalcost);
	     }
	     else if(noOfCopies  > 500 && noOfCopies < 800) {
	    	 double pricePerCopies = 0.27;
	    	 System.out.println("price per copy : "+ " "+pricePerCopies);
	    	double totalcost = noOfCopies * pricePerCopies;
	    	System.out.println("Total cost is : "+ totalcost);
	     }
	     else if(noOfCopies  > 800 && noOfCopies < 1000) {
	    	 double pricePerCopies = 0.26;
	    	 System.out.println("price per copy : "+ " "+pricePerCopies);
	    	double totalcost = noOfCopies * pricePerCopies;
	    	System.out.println("Total cost is : "+ totalcost);
	     }
	     else {
	    	  
	 	    	 double pricePerCopies = 0.25;
	 	    	 System.out.println("price per copy : "+ " "+pricePerCopies);
	 	    	double totalcost = noOfCopies * pricePerCopies;
	 	    	System.out.println("Total cost is : "+ totalcost);
	 	     }
	     }
	}

