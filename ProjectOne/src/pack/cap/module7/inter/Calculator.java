package pack.cap.module7.inter;

public class Calculator  {
	
	//Method to perform operation using a Mathoperation functional interface 
	public static double performOperation(double a , double b , MathOperation operation) {
		return operation.apply(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10 , y=5;
		MathOperation addition = (a,b)->MathOperation.add(a, b);
		MathOperation sub = (a,b)->MathOperation.subtract(a, b);
		MathOperation multi = (a,b)-> MathOperation.multiply(a, b);
		MathOperation div = (a,b)->MathOperation.divide(a, b);
		
		System.out.println("addition = "+performOperation(x, y, addition));
		System.out.println("subtraction = "+performOperation(x, y, sub));
		System.out.println(" Multiplication = "+ performOperation(x, y, multi));
		System.out.println("Divison = "+ performOperation(x, y, div));
		
		double result = performOperation(x, 0, div);
		if(Double.isNaN(result)) {
			System.out.println("Divison by zero returend an error ");
		}
		
		MathOperation safeDivide = (a,b)->a/b;
		System.out.println("Safe divison : "+ safeDivide.safeDivide(y, 0));
	}
	

	

}