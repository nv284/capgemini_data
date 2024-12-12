package pack.cap.module3.ctrl_stmt;

/*
 * modifier return-type method-name (parameter list ){method-body}  
 * predefined methods 
 * user-defined methods --> instance methods , static methods 
 * */


public class MethodDemo {

	String Brand ; String model; int year ;
	
	public MethodDemo(String brand, String model, int year) {
		super();
		Brand = brand;
		this.model = model;
		this.year = year;
	}
	public void dispInfo() {
		System.out.println("car brand :"+Brand);
		System.out.println("Car model :"+model);
		System.out.println("Car Year :"+year);
	}
	public void startCar() {
		System.out.println(Brand+"  "+model+" is starting ");
		
	}
	public void stopCar() {
		System.out.println(Brand+"  "+model+" is stoping ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            MethodDemo car1 = new MethodDemo("Toyota", "Corolla", 2023);
            MethodDemo car2 = new MethodDemo("Honda", "city", 2023);
            
            car1.dispInfo();car2.dispInfo();

            car1.startCar();car2.startCar();
            car2.stopCar();car1.stopCar();
	}

}
