package pack.cap.module5.module4;

class Circle extends Shape{
	double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI *radius;
	}
	
}
class Rectangle extends Shape{
	double length , width;
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width ;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(5);
		System.out.println("Area = "+circle.area());
		System.out.println("Perimeter = "+ circle.perimeter());
		
		Shape rect = new Rectangle(4, 6);
				System.out.println("rect Area = "+ rect.area());
				System.out.println("Rectangle perimeter : "+ rect.perimeter());

		
	}

}
