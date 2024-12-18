package pack.cap.module9.collection;

public class ProductManagmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ProductCatalog catalog = new ProductCatalog();
      
      catalog.addProduct(new Product(1, "Laptop", 40000.00));
      catalog.addProduct(new Product(2, "SamrtPhone", 34000.00));
      catalog.addProduct(new Product(3, "MacBook", 60000.00));
      catalog.addProduct(new Product(4, "Laptop", 40000.00));
      catalog.addProduct(new Product(5, "Tablet", 10000.00));
      catalog.addProduct(new Product(1, "samrtwatch", 10000.00));
      
      catalog.displayProduct();
      
      catalog.removeProduct(2);
      
      System.out.println(" Updated catalog : ");
      
      catalog.displayProduct();
      
      System.out.println("\n product with id 1 in the catalog "+ catalog.productExists(1));
      
      System.out.println("\n product catalog size : "+ catalog.getCatalogSize());
	}

}