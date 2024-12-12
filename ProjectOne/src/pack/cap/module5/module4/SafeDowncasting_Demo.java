package pack.cap.module5.module4;
class Animal1 {
	public void makeSound() {
		System.out.println("Animal makes a sound ");
	}
}
class Dog1 extends Animal1 {
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	public void fetch() {
		System.out.println("Dog is fetching the ball ");
	}
}
public class SafeDowncasting_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal1 animal = new Dog1(); //upcasting 
    
    //check if animal is an instance of dog 
    if( animal instanceof Dog1) {
    	Dog1 dog = (Dog1)animal; //safe downcasting 
    	dog.makeSound();
    	dog.fetch();}
    else {
    	System.out.println("The animal is not a Dog ");
    }
    Animal1 animalOne = new Animal1(); //upcasting 
    if(animalOne instanceof Dog1)  {
    	Dog1 dog = (Dog1) animalOne;//safe downcasting 
    	dog.makeSound();
    }else {
    	System.out.println("the animal is not a dog ");
    }
		
	}

}
