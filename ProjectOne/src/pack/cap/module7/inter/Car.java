package pack.cap.module7.inter;

public class Car implements Vechical {
	
	String color;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting engine!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop engine!");
	}
	
	String carColor(String color) {
		return color ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c = new Car();
      c.start();c.stop(); c.carColor("red");
	}

	

}
