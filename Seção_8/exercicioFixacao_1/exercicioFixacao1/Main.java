package exercicioFixacao1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		Rectangle r1 = new Rectangle();
		System.out.println("Entre rectangle width and height: ");
		width = sc.nextDouble();
		height = sc.nextDouble();
		r1.setWidth(width);
		r1.setHeight(height);
		
		System.out.print(r1);
		
	}

}
