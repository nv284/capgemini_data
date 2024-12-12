package pack.cap.module5.module4;

/* superclass ref ---------------> subclass Object
 *   SuperClass sc = new SubClass();
 *   
 * subclass ref ---------------------> superclass Object
 *    Subclass obj = new SuperClass()
 *  
 *  */
class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound ");
	}
}
class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	public void fetch() {
		System.out.println("Dog is fetching the ball ");
	}
}
public class Upcasting_Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog object 
		Dog dog = new Dog();
		//upcasting : assigning dog obj to animal ref 
		Animal ani = dog ; //implicit up casting 
		ani.makeSound(); //call dog maksount() because of  dynamic method dispatch 
		//ani.fetch()//compile time error : fetch is not the method of animal class 
		//------------------Downcasting --------------
		Animal animal = new Dog();
		Dog dog1 =  (Dog) animal;  // explicit down casting 
		dog1.makeSound();
		dog1.fetch();

	}

}
