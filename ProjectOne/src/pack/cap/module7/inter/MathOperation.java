package pack.cap.module7.inter;

@FunctionalInterface
public interface MathOperation {
	
	double apply (double a , double b );

	default double safeDivide(double a , double b ) {
		if(b==0) {
			System.out.println("Error Cannot divide by zero");
			return Double.NaN;
		}
		return a/b;
	}
	
	static double add(double a , double b ) {
		return a+b;
	}
	static double subtract(double a , double b ) {
		return a-b;
	}
	static double multiply(double a , double b ) {
		return a*b;
	}
	static double divide(double a , double b ) {
		if(b==0) {
			System.out.println("Error Cannot divide by zero");
			return Double.NaN;
		}
		return a/b;
	}
}
