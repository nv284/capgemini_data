package pack.cap.module9.collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void display(SortedSet<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SortedSet<Student> students = new TreeSet<Student>();
    
    students.add( new Student(101, "Alice", "Mathematics"));
    students.add( new Student(102, "Charlie", "Physics"));
    students.add( new Student(109, "David", "Chemistry"));
    students.add( new Student(107, "Aril", "Biology"));
    students.add( new Student(104, "Eva", "Computer-Science"));
    students.add( new Student(103, "Romi", "Commers"));
    students.add( new Student(106, "Jolly", "Home-science"));
    
    //display 
    System.out.println("Registred student ");
    display(students);
    
    NavigableSet<Student> stu = new TreeSet<Student>();
    stu.add( new Student(101, "Alice", "Mathematics"));
    stu.add( new Student(102, "Charlie", "Physics"));
    stu.add( new Student(109, "David", "Chemistry"));
    stu.add( new Student(107, "Aril", "Biology"));
    stu.add( new Student(104, "Eva", "Computer-Science"));
    stu.add( new Student(103, "Romi", "Commers"));
    stu.add( new Student(106, "Jolly", "Home-science"));
    
    //remove 
    System.out.println(" remove the student by id - 102");
    students.remove(new Student(102 , "Charlie" , "physcics"));
    display(students);
    
    // get first entry and last entry details 
    System.out.println(" \n First student registred : "+ students.first());
    System.out.println(" \n First student registred : "+ students.last());
    
    //subset 
    System.out.println("\n Student with ID's between 101 & 104");
    SortedSet<Student> subset = students.subSet(new Student(101, "", ""), new Student(104,"", ""));
    display(subset);
    
    
    System.out.println(" \n student with ID's greater than 103");
    SortedSet<Student> highStu = students.tailSet(new Student(103, "", ""));
    display(highStu);
    
    
    System.out.println("NavigableSet methods ");
    System.out.println("\n student in the list grater then and equal to 102 " + stu.higher( new Student(102, "", "")));
    System.out.println("\n student in the list lower then id 105 : "+ stu.lower( new Student(105, "", "")));
    display(stu);
    
    System.out.println("\n reverser order of student ");
    NavigableSet<Student> rev = stu.descendingSet();
    display(rev);
    
    System.out.println("Tailset of Navigableset");
    NavigableSet<Student> set = stu.tailSet(new Student(102, "", ""), true);//inclusive of 102
    display(set);
  
	}

}