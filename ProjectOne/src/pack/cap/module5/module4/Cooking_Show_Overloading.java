package pack.cap.module5.module4;

class Chef{
	public void cookDish(String dishname) {
		System.out.println("The chef os cooking a delicious "+ dishname +" without spices");
	}
	
	public void cookDish(String dishname , String spice) {
		System.out.println("The chef is cooking a spicy "+dishname+ "  with"+ spice);
	}
	public void cookDish(String dishname , String spice , int cookingTime ) {
		System.out.println("The chef is cooking a spicy "+dishname+ "with"+ spice +" it will take "+cookingTime +" to cook ");
	}
	public void cookDish(String dishname , int cookingTime) {
		System.out.println("The chef is cooking a  "+dishname+ "for "+ cookingTime);
	}
}


public class Cooking_Show_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Chef chef = new Chef();
      chef.cookDish("Pasta");
      chef.cookDish("Noodels", "oregano");
      chef.cookDish("Manchurian", 20);
      chef.cookDish("ManChow soup", "chili flakes", 15);
	}

}
