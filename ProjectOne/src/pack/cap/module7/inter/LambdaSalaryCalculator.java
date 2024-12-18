package pack.cap.module7.inter;


@FunctionalInterface
interface SalaryCalculator{
	double calculateSalary( double baseSalary);
	/*
	 * String authorwinningPrize(String stmt);
	 * */
}


public class LambdaSalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double baseSalary = 50000;
		
		SalaryCalculator withBouns = (sal) -> sal+(sal*0.10);
		
		
		//calculate salary with a deduction of 5% 
		SalaryCalculator withDeduction = (sal)-> sal-(sal*0.05);
		
		// if provide increment 
		SalaryCalculator withIncrement = (sal)->{
			if(sal <20000) {
				return sal+(sal*0.15);} else {
					return sal;
				}
		};
		
		 SalaryCalculator noChange = (salary) -> salary;
		 System.out.println("Base salary "+ baseSalary);
		 System.out.println("Salary without change : "+ noChange.calculateSalary(baseSalary));
		 System.out.println(" Salary with Bounous : "+ withBouns.calculateSalary(baseSalary));
		 System.out.println("salary with deduction of 5%  : "+ withDeduction.calculateSalary(baseSalary));
		 System.out.println(" Salary incremetn for those whos salary is less then 20k :" + withIncrement.calculateSalary(baseSalary));

	}

}
