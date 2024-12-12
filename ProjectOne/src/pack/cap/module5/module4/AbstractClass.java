package pack.cap.module5.module4;


abstract class Emp{
	private String name;
	private int id ;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void m1() {
		System.out.println("Name :"+name);
		System.out.println("Id : "+id);
	}
	
}
class Engineer extends Emp{

	public Engineer(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Engineer e = new Engineer("Deepa", 111212);
      e.m1();
	}

}
