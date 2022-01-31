package utilities;

public class CurrencyConverter {
	private static final double  IOF = 0.06;
	public static double dollarPrice;
	
	public static double amountInReais(double value) {  //Static, cause the value independs of the object
		value += value*IOF;
		return value * dollarPrice;
	}
}
