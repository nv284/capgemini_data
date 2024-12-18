package pack.cap.module9.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<String> v = new Vector<String>();
       ArrayList<String> al = new ArrayList<String>();
       
       System.out.println(" Adding element to Vector and ArrayList");
       v.add("Apple");
       v.add("Banana");
       v.add("cherry");
       al.add("Apple");
       al.add("Banana");
       al.add("cherry");
       System.out.println("vector contents : "+ v);
       System.out.println("ArrayList contents : "+ al);
       
       System.out.println(" Remove banana from vector and arraylist");
       v.remove("Banana");
       al.remove("Banana");
       
       System.out.println("Vector contents after removal "+ v);
       System.out.println("ArrayList contents after removal "+ al);
       
       //Display contents after removal
       System.out.println("Vector contents after removal: " + v);
       System.out.println("ArrayList contents after removal: " + al);

       // Add more elements to exceed the initial capacity of Vector and ArrayList
       System.out.println("\nAdding more elements to exceed the initial capacity");
       v.add("Date");
       v.add("Elderberry");
       v.add("Fig");
       v.add("Grape");
       v.add("Honeydew");

       al.add("Date");
       al.add("Elderberry");
       al.add("Fig");
       al.add("Grape");
       al.add("Honeydew");

       // Display updated contents
       System.out.println("\nUpdated Vector contents: " + v);
       System.out.println("Updated ArrayList contents: " + al);

       // Show size and capacity of Vector and ArrayList
       System.out.println("\nSize and capacity of Vector:");
       System.out.println("Size of Vector: " + v.size());
       System.out.println("Capacity of Vector: " + v.capacity()); // Vector specific method

       System.out.println("\nSize of ArrayList:");
       System.out.println("Size of ArrayList: " + al.size());
       // ArrayList doesn't have a direct method to get capacity, but we can assume it's dynamic.

       // Perform random access (using get method)
       System.out.println("\nRandom access (get method):");
       System.out.println("Element at index 2 in Vector: " + v.get(2)); // Accessing third element
       System.out.println("Element at index 2 in ArrayList: " + al.get(2)); // Accessing third element

       // Display updated collections
       System.out.println("\nUpdated Vector contents: " + v);
       System.out.println("Updated ArrayList contents: " + al);
	}

}