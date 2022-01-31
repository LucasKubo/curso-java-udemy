package exercicioFixacao2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		
		String name;
		double grossSalary;
		double tax;
		
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Gross salary: ");
		grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
		e1.setName(name);
		e1.setGrossSalary(grossSalary);
		e1.setTax(tax);
		
		System.out.println();
		e1.netSalary();
		System.out.println("Employee: "+ e1);
		
		System.out.println();
		System.out.print("Which percentage to increase salary ?");
		tax = sc.nextDouble();
		e1.increaseSalary(tax);
		
		System.out.println();
		System.out.println("Updated data: "+ e1);
		
	}

}
