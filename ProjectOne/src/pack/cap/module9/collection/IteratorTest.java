package pack.cap.module9.collection;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * Type of iterator 
 * 1- Enumeration ---> can create an object of enumeration by calling elements() of vector class. Enumeration e = v.elements()
 * 2- Iterator 
 * 3- ListIterator 
 * 4- Spliterator (1.8)
 * 
 * */
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0;i<=8;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		//checking the next element using reference variable itr 
		while(itr.hasNext()) {
			//moving cursor to next element using ref variable itr 
			Integer i = itr.next();// 
			System.out.println(i);
			
			//remove 
			if(i%2!= 0 )
				itr.remove();
		}
		System.out.println(al);
	}

}
