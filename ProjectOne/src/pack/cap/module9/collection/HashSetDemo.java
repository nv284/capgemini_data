package pack.cap.module9.collection;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Frist");al.add("Third");al.add("eight");
	System.out.println("ArrayList element : "+ al );		
HashSet<String> set = new HashSet<String>();
set.add("First");set.add("Second");set.add("Third");set.add("Fourth");set.add("Five");
System.out.println("HashSet element : "+set);
set.add("First");set.add("Five");//duplicate element 
System.out.println("After adding duplicate ");
System.out.println(set);
System.out.println(" add some null ");
set.add(null);set.add(null);
System.out.println("after adding null "+set);
System.out.println(" Lets add al into hashset :");
set.addAll(al);
System.out.println(" Unorderes hashset elements without duplicate elements : ");
System.out.println(set );
if(set.contains("Five")) {
	System.out.println("available ");
}else {
	System.out.println(" not present");
}
System.out.println("Lets reamove arraylist element form hashset : ");
set.removeAll(al);
System.out.println("After removing arralist element : "+set);
System.out.println(" Ltes clear the hashset :");
set.clear();
System.out.println(set);



	}

}
