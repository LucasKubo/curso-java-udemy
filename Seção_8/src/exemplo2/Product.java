package exemplo2;



public class Product {
	private String name;
	private double price;
	private int quantity=0;
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product () {}
	
	public double totalValuationInStock() {
		return price*quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public String toString() {
		return 	name + ", $ "+ String.format("%.2f", price) + ", " + quantity + " units, Total: $" +
				String.format("%.2f\n",totalValuationInStock()) ;  
	}
}
