package pack.cap.module9.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
	public static void main(String[] args) 
	{
	  LinkedHashMap<String, String> lhmap = new LinkedHashMap<>(16, 0.75f, true); 
	  lhmap.put("En", "English");
	  lhmap.put("Hi", "Hindi");
	  lhmap.put("Ta", "Tamil");
	  lhmap.put("De", "German");
	  lhmap.put("Fr", "French");
	    
	  System.out.println("Initially, entries in LinkedHashMap lhmap: " +lhmap);
	  System.out.println("Value corresponding to key Hi: " +lhmap.get("Hi"));

	  System.out.println("Value corresponding to key En: " +lhmap.get("En"));
	  System.out.println("After accessing entries Hi and En: " +lhmap);

	  System.out.println("\n");

	  LinkedHashMap<String, String> lhmap2 = new LinkedHashMap<>(16, 0.75f, false); 
	   lhmap2.put("En", "English");
	   lhmap2.put("Hi", "Hindi");
	   lhmap2.put("Ta", "Tamil");
	   lhmap2.put("De", "German");
	   lhmap2.put("Fr", "French");
	   System.out.println("Initially, entries in LinkedHashMap lhmap2: " +lhmap2);
	   System.out.println("Value corresponding to key Hi: " +lhmap.get("Hi"));
	  
	   System.out.println("Value corresponding to key En: " +lhmap.get("En"));
	   System.out.println("After accessing entries Hi and En: " +lhmap2);
	   
	   
	   //iteration 
	   LinkedHashMap<Character, String> lhmap1 = new LinkedHashMap<>(); 
	   lhmap1.put('R', "Red");
	   lhmap1.put('G', "Green");
	   lhmap1.put('B', "Brown");
	   lhmap1.put('O', "Orange");
	   lhmap1.put('P', "Pink");

	   System.out.println("Iterating Entries of LinkedHashMap");

	 // Iteration over map using forEach() method.   
	    lhmap1.forEach((k,v) -> System.out.println("Color code: "+ k + ", Color name: " + v)); 
	  }
}
