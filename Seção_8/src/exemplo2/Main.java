package exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		int quantity;
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Qantity in stock: ");
		quantity = sc.nextInt();
		
		Product p1 = new Product(name,price,quantity);
		System.out.println();
		System.out.printf("Product data: "+ p1);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p1.addProducts(quantity);
		System.out.printf("Updated data: "+ p1);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		p1.removeProducts(quantity);
		System.out.printf("Updated data: "+ p1);
	}

}
