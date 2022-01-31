package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double dollarAmount;
		
		System.out.print("What's the dollar price ? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought ? ");
		dollarAmount = sc.nextDouble();
		System.out.printf("Amount to be paid in reias = %.2f",CurrencyConverter.amountInReais(dollarAmount));
	}

}
