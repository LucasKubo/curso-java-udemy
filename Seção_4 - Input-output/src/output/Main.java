package output;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saída de dados:
		
		//troca a "," por "."
		Locale.setDefault(Locale.US);
		
		double num = 21.2345;
		System.out.println(num);
		System.out.printf("%.2f \n", num);
		
		//concatenacao
		System.out.println("Num = "+ num);
		System.out.printf("Num = %.2f \n", num);
		
		//usando printf --> String- %s  int- %d  flutuante- %f
		String nome = "Lucas";
		int idade = 19;
		double altura = 1.70;
		System.out.printf("Meu nome é %s, eu tenho %d anos e %.2f de altura", nome, idade, altura);
	}

}
