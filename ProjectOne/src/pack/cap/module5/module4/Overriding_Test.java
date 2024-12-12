package pack.cap.module5.module4;
class College{
	public void collegeName() {
		System.out.println("Name of the college is ABCD");
	}
	void estYear() {
		System.out.println("It was established in 2000");
	}
	static void m1() {
		System.out.println("Static ");
	}
	final void safeMethod() {// By declaring method as final, we can stop overriding. 
		System.out.println("Final methods ");
	}
}


class MyCollege extends College{

	@Override
	protected void estYear() {
		// TODO Auto-generated method stub
		super.estYear();
		System.out.println("It was extablished in 2001 ");
	}
	
	
}
public class Overriding_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyCollege my = new MyCollege();
my.collegeName();
my.estYear();
College c = new MyCollege();
c.estYear();
	}

}
