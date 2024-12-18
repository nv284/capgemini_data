package pack.cap.module9.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*Enumeration ---> can create an object of enumeration by calling elements() of vector class. Enumeration e = v.elements()
 * it has two methods -
 * 1- public boolean hasNextElement()
 * 2- public object nextElement()
 * 
 * */
public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Vector v = new Vector();
   
   Enumeration e = v.elements();
   Iterator itr = v.iterator(); //itr is  the inner class present inside the vector which implements the iterator interface 
   ListIterator ltr = v.listIterator();//ltr is  the inner class present inside the vector which implements the iterator interface 
   
   System.out.println(e.getClass().getName());
   System.out.println(itr.getClass().getName());
   System.out.println(ltr.getClass().getName());
	
	}

}

/*Limitation 
 * ---------
 * 1- this is not universal cursor , concpet is applicable only on legacy classes . 
 * 2- it move forward direction 
 * 3- java is not recommended this for new projects 
 * 4- you have only read operation , remove operation is not available 
 * 
 * */
 */