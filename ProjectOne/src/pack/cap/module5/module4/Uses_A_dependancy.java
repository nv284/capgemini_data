package pack.cap.module5.module4;
// Types of relationship among classes 
/* Dependence(Uses-A)       Association(Has-A)       Inheritance(Is-A)*/

class Product{
	String productName; double price;

	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public void dispProduct() {
		System.out.println("Product Name : "+productName);
		System.out.println("Price $ :"+ price);
	}
}

class Customer1{
	String name ;
	int customerId;
	public Customer1(String name, int customerId) {
		super();
		this.name = name;
		this.customerId = customerId;
	} 
	// Method where customer " Uses -A " Product (dependent class)
	public void purchaseProduct(Product pro) {
		System.out.println(name + "Is purchasing the following product :");
		pro.dispProduct();
		System.out.println(name + "Has successfully purchased "+ pro.productName);
	}
}


public class Uses_A_dependancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instance of product 
        Product laptop = new Product("Laptop", 90000.0);
        Product phone = new Product("SmartPhone", 40000.99);
        
        //create instance of customer 
       Customer1 cust = new Customer1("Dona", 111);
       
       cust.purchaseProduct(laptop);
       cust.purchaseProduct(phone);
        
	}

}
