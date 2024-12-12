package pack.cap.module5.module4;


//Base class
class Vehicle {
 String make;
 String model;
 String engineType;

 public Vehicle(String make, String model, String engineType) {
     this.make = make;
     this.model = model;
     this.engineType = engineType;
 }

 public void start() {
     System.out.println("Vehicle is starting...");
 }

 public void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

//Intermediate class
class Car extends Vehicle {
 String carType;

 public Car(String make, String model, String engineType, String carType) {
     super(make, model, engineType);
     this.carType = carType;
 }

 public void honk() {
     System.out.println("Car is honking!");
 }
}

//Derived class
class ElectricCar extends Car {
 int batteryCapacity;
 int chargingTime;

 public ElectricCar(String make, String model, String engineType, String carType, int batteryCapacity, int chargingTime) {
     super(make, model, engineType, carType);
     this.batteryCapacity = batteryCapacity;
     this.chargingTime = chargingTime;
 }

 public void charge() {
     System.out.println("Charging the electric car...");
 }
}
public class MultiLevelInheritance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricCar myEV = new ElectricCar("Tesla", "Model S", "Electric", "Sedan", 100, 30);
        myEV.start();  // Inherited method from Vehicle
        myEV.honk();   // Inherited method from Car
        myEV.charge(); // Method specific to ElectricCar
	}

}
