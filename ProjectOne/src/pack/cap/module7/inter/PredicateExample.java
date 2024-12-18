package pack.cap.module7.inter;
import java.util.function.*;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> isEven = (num) ->num%2 == 0;
		
		Predicate<Integer> isGreaterThen  = (num) ->num > 100 ;
		
		
		//combined predicate 
		Predicate<Integer> isEvenAndGreaterThen  =  isEven.and(isGreaterThen);
		
		//combined predicate with or 
		Predicate<Integer> isEvenAndGreaterThenHundred  =  isEven.or(isGreaterThen);
		
		Predicate<Integer> isNotEven =  isEven.negate();
		
		// Define a Supplier that returns a default message
        Supplier<String> messageSupplier = () -> "Hello, welcome to Java 8!";

        // Get the message by invoking the get() method of the Supplier
        String message = messageSupplier.get();
        System.out.println(message);
		
        
        // define a consumer messagePrinter 
        Consumer<String> messageresult = (msg)-> System.out.println(msg);
        
        messageresult.accept("This is a message to print ");
		
	}

}