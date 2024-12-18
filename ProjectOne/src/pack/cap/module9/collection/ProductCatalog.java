package pack.cap.module9.collection;
import java.util.*;
 class ProductCatalog {
	
	private LinkedHashSet<Product> products;

	public ProductCatalog() {
		super();
		// TODO Auto-generated constructor stub
		products = new LinkedHashSet<Product>();
	}
	
	public boolean addProduct(Product pro) {
		return products.add(pro);
	}
	
	public boolean removeProduct(int proId) {
		return products.removeIf(p -> p.getProductId() == proId);
	}
	
	public void displayProduct() {
		System.out.println("Product catalog ");
		for(Product p : products) {
			System.out.println(p);
		}
	}
	
	public boolean productExists(int proid) {
		return products.contains(new Product(proid, " ",0));
	}
	
	public int getCatalogSize() {
		return products.size();
	}

}


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 