package pack.cap.module6.Arr;

import java.util.Scanner;

/*You are tasked with developing a program that calculates and adjusts employee salaries based on various criteria. 
 * The program should
 *  handle the following:

Salary Increment: If an employee's salary is greater than or equal to 30,000, provide a 10% increment to their salary.

Bonus: If an employee's salary is equal to 20,000, provide a bonus of 2,000.

Salary Improvement Advice: If an employee's salary is less than 15,000, print a message asking them to improve their work 
in order to 
get a higher salary.

Additional Allowances: Provide the following additional allowances for each employee:

House Rent Allowance (HRA): 10% of the current salary.
Travel Allowance (TA): 5% of the current salary.
Dearness Allowance (DA): 8% of the current salary.
The program should use a 1D array to store the salaries of employees and perform these operations for each employee.*/
public class OneDArrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int numberOfEmp = 5;
         double[] salaries = new double[numberOfEmp];
         System.out.println("Enter the salaries of "+numberOfEmp + "employees: ");
         for(int i = 0;i< numberOfEmp ; i++) {
        	 System.out.println("salary of employee "+(i+1)+" :");
        	 salaries[i] = sc.nextDouble();
        	 
         }
         for(int i =0;i<numberOfEmp ; i++) {
        	 double salary = salaries[i];
        	 double increment =0;
        	 double bonus = 0; 
        	 double hra = 0; 
        	 double ta = 0; 
        	 double da=0;
        	 
        	 
        	 if(salary >= 30000) {
        		 increment = salary *0.10;
        		 salary += increment;
        		 
        	 }
        	 if(salary == 20000) {
        		 bonus = 2000;
        		 salary +=bonus;
        	 }
        	 if(salary<15000) {
        		 System.out.println("Employee "+(i+1) +" has a salary of "+ salaries[i]+"please improve your work to get higher salary ");
        		hra = salary *0.10;
        		ta = salary*0.05;
        		da = salary *0.08;
        		 
        	 }
        	 System.out.println("Employee "+(i+1) +" original salary  "+ salaries[i]);
        	 System.out.println("updated salary "+ salary );
        	 System.out.println("HRA :"+hra);
        	 System.out.println("TA :"+ta);
        	 System.out.println("DA : "+da);
        	 System.out.println("Total salary after allowances : "+(salary + hra + da ));
        	 
        	 
        	 
         }
         
         sc.close();
         
	}

}
