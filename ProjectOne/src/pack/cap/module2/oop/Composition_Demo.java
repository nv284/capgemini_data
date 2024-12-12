package pack.cap.module2.oop;

class Engine{
	public void start() {
		System.out.println("Engin is starting...");
	}
}
class Wheel{
	public void rotate() {
		System.out.println("Wheel is rotating..");
	}
}
class Door{
	public void open() {
		System.out.println("Door is opening...");
	}
}
//Car is whole object that is composed of the parts
class Car{
	private Engine engine ;
	private Wheel wheel ;
	private Door door;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		this.engine = new Engine();
	}
	
	
}

public class Composition_Demo {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
