package pack.cap.module6.Arr;

import java.util.ArrayList;

public class Demo {
	
	 public static void main(String[] args) {
	 ArrayList<Integer> list =  new ArrayList<Integer>();
	 //autoboxing 
	 list.add(5);
	 list.add(6);
	 System.out.println(list);
	 
	 //unboxing 
	 int a = list.get(0);
	 System.out.println(a);
	 
	 
	 //Math Class 
	 int x= 20 , y=-10;double p = -27.43 , q= -777.37;
	 
	 System.out.println(Math.abs(x));
	 System.out.println(Math.abs(y));
	 System.out.println(Math.abs(p));
	 System.out.println(Math.abs(q));
	 System.out.println(Math.max(x, y));
	 System.out.println(Math.min(p, q));
	 System.out.println("Round up "+Math.round(q));
	 String str = Integer.toBinaryString(x);
	 System.out.println(str);
	 Integer i1 = new Integer(x);
	 int hash = i1.hashCode();
	 System.out.println("hashcode "+hash);
	 System.out.println("bitcount "+Integer.bitCount(x));
	 System.out.println("Reverser bit" + Integer.reverse(x));

	 }
}
