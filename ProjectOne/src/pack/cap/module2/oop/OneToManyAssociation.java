package pack.cap.module2.oop;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	} 
}

class Teacher{
	
	private String name;
	private List<Student> stu1; // one to many association
	public Teacher(String name) {
		super();
		this.name = name;
		this.stu1 = new ArrayList<Student>();
	}
	public void addstudent(Student stu) {
		stu1.add(stu);
	}
	public void disp () {
		System.out.println("Teacher : "+ name );
		System.out.println("Student : ");
		for(Student s : stu1) {
			System.out.println(" - "+s.getName());
			
		}
	}
	
	
}


public class OneToManyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher t = new Teacher("Mr. Jhone");
Student s1 = new Student("Alice"); Student s2 = new Student("Jeh");Student s3= new Student("Charlie");
t.addstudent(s1);t.addstudent(s2);t.addstudent(s3);
t.disp();

	}

}
