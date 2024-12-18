package pack.cap.module7.inter;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		Stream<int []> num = Arrays.stream(new int[][] {numbers});
		                                  //number [] [] 
		
		//stream<E>()
		
		num.flatMapToInt(Arrays::stream)// Flatten the 2D array to a 1D stream
		.filter(num1->num1%2==0)// Filter even numbers
		.map(num1->num1*2)// Double the numbers
		.forEach(System.out::println); // Print the results
		
		
		int [] data = {2,4,14,25,23,35,45,6,78,90};
		
		IntStream  numberStream = Arrays.stream(data);
		
		Stream<String> strm = Stream.of("java" , "is " , "one of the " ,"Perfact programming language" );
		
		strm.map(String :: toString).forEach(System.out :: println);
		
		IntStream rangeStream = IntStream.range(1, 15);
		
		rangeStream.filter(num2 -> num2 %2 !=0).forEach(System.out::println);
		
		Stream<Integer> stm =  Stream.iterate(1,  a-> a+1);
		
		stm.limit(20).forEach(System.out::println);
	}

}
