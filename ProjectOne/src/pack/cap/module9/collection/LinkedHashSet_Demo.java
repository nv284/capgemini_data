package pack.cap.module9.collection;
import java.util.*;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> lh = new LinkedHashSet<String>();


int size = lh.size(); System.out.println(" size ="+ size);

lh.add("White");lh.add("Black");lh.add("Green");lh.add("Pink");

int size1 = lh.size(); System.out.println(" size ="+ size1);

//add duplicate 
lh.add("White");

LinkedHashSet<String> lhset2 = new LinkedHashSet<String>();
lhset2.add("Brown");lhset2.add(null);
lh.addAll(lhset2);
System.out.println(" Element in set after adding "+lh);

lh.removeAll(lhset2);
System.out.println(lh);
int [] num ={5,5,1,2,34,45,34,89,45,23,34,90,21,2,1};
ArrayList<Integer> ar = new ArrayList<Integer>();
for(int i=0;i< num.length; i++) {
	ar.add(num[i]);
}
System.out.println("Orginal list "+ ar);
LinkedHashSet<Integer> a = new LinkedHashSet<Integer>(ar);
System.out.println(" New list after removing duplicate numbers : "+a);
	}

}
