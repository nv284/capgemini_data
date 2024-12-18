package pack.cap.module9.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String[] args) 
	{
	// Create a HashMap.	
	   HashMap<String, String> hmap = new HashMap<>();
	 
	// Adding entries in hash map.
	   hmap.put("R", "Red");
	   hmap.put("G", "Green");
	   hmap.put("B", "Brown");
	   hmap.put("O", "Orange");
	   hmap.put("P", "Pink");

	   System.out.println("Entries of HashMap: " +hmap);

	// Create a TreeMap from the previous HashMap.
	   TreeMap<String, String> tmap = new TreeMap<>(hmap);
	   System.out.println("Entries in ascending order of keys: " +tmap);

	// Create a LinkedHashMap.
	   LinkedHashMap<String, String> lhmap = new LinkedHashMap<>(); 
	  
	   lhmap.put("R", "Red");
	   lhmap.put("G", "Green");
	   lhmap.put("B", "Brown");
	   lhmap.put("O", "Orange");
	   lhmap.put("P", "Pink");

	   System.out.println("Entries in LinkedHashMap: " +lhmap);
	   
	   //this based on entrySet(), keySet(), values(), get(), containsKey(), and containsValue() methods provided by TreeMap.
	   
	   TreeMap<Character, String> tmap1 = new TreeMap<>();
	  
	   tmap1.put('A', "Apple");
	   tmap1.put('P', "Parot");
	   tmap1.put('C', "Cat");
	   tmap1.put('B', "Boy");
	   tmap1.put('D', "Dog");
	 
	   Object entrySet = tmap1.entrySet();
	   System.out.println("Entry set: " +entrySet);
	   System.out.println("Key set: " +tmap.keySet());
	   System.out.println("Value set: " +tmap.values());

	   Object vGet = tmap1.get('C');
	   System.out.println("C: " +vGet);

	   boolean containsKey = tmap1.containsKey('B');
	   System.out.println("Is key 'B' present in map: " +containsKey);

	   boolean containsValue = tmap1.containsValue("Apple");
	   System.out.println("Is Apple present in map: " +containsValue);
	 }
	}
