package classesWithAttributes;

public class main {
	public static void main(String[]args) {
		Product product =new Product(1,"laptop","Asus Laptop", 3000, 3, "Siyah");
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(5000);
		//product.setStockAmount(3);
		
		System.out.println(product.getName());
		
	
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1,"","",2,200);
			System.out.println(product.getKod());
	}

}