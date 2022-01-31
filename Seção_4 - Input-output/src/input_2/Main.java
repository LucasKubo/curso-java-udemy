package input_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//Para ler a linha inteira até a quabra(enter)
		String s1,s2,s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Quando usa um comando diferente do nextLine antes de um nextLine
		int x;
		String s4,s5,s6;
		x = sc.nextInt();
		sc.nextLine(); // Para consumir a quebra do nextInt
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
	
}
