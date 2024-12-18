package pack.cap.module7.inter;

import java.util.Arrays;

public class ParallelStreamExample {
    public static void main(String[] args) {
        
        // Step 1: Create an array of numbers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Step 2: Convert the array to a parallel stream and perform operations
        Arrays.stream(numbers)              // Create a stream from the array
              .parallel()                   // Convert the stream to a parallel stream
              .map(num -> num * 2)          // Double each number
              .forEach(System.out::println); // Print the results
    }
}

