package pack.cap.module6.Arr;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("In how many subject have you given exam ?");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		System.out.println("Enter the marks obtained in subjects ");
		
		for(int i=0;i<n;i++) {
			marks[i]= sc.nextInt();
		}

		int total = 0;
		for(int i =0;i<n;i++) {
			total += marks[i];
		}
		
		System.out.println("Total marks : "+total);
		
		float percentage = total/n; 
		System.out.println("percentage : "+percentage + "%");
	}

}