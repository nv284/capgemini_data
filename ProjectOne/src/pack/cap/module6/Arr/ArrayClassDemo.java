package pack.cap.module6.Arr;

import java.util.Arrays;

/*
 * Array is the part of java.util
 * sort , equals , copyOf , toString , asList, binarySearch   , fill , deepToString 
 * */
public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] num = {7,3,4,5,6,12,40,5};
     
     Arrays.sort(num);
     System.out.println("Sorted Array : "+Arrays.toString(num));
     
     int index = Arrays.binarySearch(num, 5);
     System.out.println("Index of 5 : "+index );
	
	int [] num2 = {7,3,0,100,12,40,5};
	boolean check = Arrays.equals(num , num2);
	System.out.println("Are arrays equal ? "+ check );
	
	int [] copiedArray = Arrays.copyOf(num, num.length);
	System.out.println("Copies Array : "+ Arrays.toString(copiedArray));
	
	
	int [][] multi = {{2,3} , {5,6},{7,8}};
	System.out.println("Multidimentional Array : "+Arrays.deepToString(multi));
	
	}
	

}
