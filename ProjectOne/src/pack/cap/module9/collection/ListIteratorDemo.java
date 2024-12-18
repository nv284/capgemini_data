package pack.cap.module9.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Listeiterator 
 * 1- traversing list in both direction
 * 2- Modifying element while iterating 
 * 3- adding new elements during iteration  
 * Methods - 
 * hasNext() , next(), remove(), hasPrevious , previous(), add(E,e) , set(E,e)
 * */
class Employee1 {
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee1{id=" + id + ", name='" + name + "'}";
    }
}

public class ListIteratorDemo {

	public static void printData(List<Employee1> employees) {
		System.out.println("\n Current employee ");
		for(Employee1 emp : employees) {
			System.out.println(emp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Employee1> emp = new ArrayList<>();
  
  emp.add(new Employee1(101, "Jhon"));
  emp.add(new Employee1(102,"Sam"));
  emp.add(new Employee1(103,"Mark"));
  emp.add(new Employee1(104,"Tim"));
  emp.add(new Employee1(105,"Martha"));
  
  //add new employee
  System.out.println("adding new employee");
  ListIterator<Employee1> ltr = emp.listIterator();
  ltr.add(new Employee1(106, "Rose"));
  ltr.add(new Employee1(107, "Harry"));
  printData(emp);
  
  //Read forward
  
  System.out.println("\n Iterating forword ");
  ltr = emp.listIterator();
  while(ltr.hasNext()) {
	  Employee1 e1 = ltr.next();
	  System.out.println(e1);
  }
  
  //update 
  System.out.println("\n Updating employee name (id ->103)");
  ltr = emp.listIterator();
  while(ltr.hasNext()) {
	  Employee1 e2 = ltr.next();
	  if(e2.getId() == 103) {
		  ltr.set(new Employee1(103, "Thomas"));
	  }
  }
  printData(emp);
  
  
  //delete 
  
  System.out.println("\n Delete employee name (id -->106)");
  ltr = emp.listIterator();
  while(ltr.hasNext()) {
	  Employee1 e3 = ltr.next();
	  if(e3.getId() == 106) {
		 ltr.remove();
	  }
  }
  printData(emp);
  
  // read by backward
  
  System.out.println("\n Iterating backword");
  ltr = emp.listIterator(emp.size());
  while(ltr.hasPrevious()) {
	  Employee1 e4 = ltr.previous();
	 System.out.println(e4);
	  }
  }
  
  
  
  
  
  
  
  
  
	}


