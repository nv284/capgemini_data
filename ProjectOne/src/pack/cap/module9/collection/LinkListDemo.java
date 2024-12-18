package pack.cap.module9.collection;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> city = new LinkedList<String>();
city.add("Pune");
city.add("Mumbai");city.add("Bangluru");city.add("Patna");
city.remove(2);
System.out.println(city);
city.removeFirst();
System.out.println(" Show the name of the city : "+city.get(3));

	}

}
