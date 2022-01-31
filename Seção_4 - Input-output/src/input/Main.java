package input;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Para ler um int
		System.out.println("Digite um número ");
		int x = sc.nextInt();
		System.out.println("número digitado: "+x);
		
		//Para ler um double
		System.out.println("Digite um número float ");
		double f = sc.nextDouble();
		System.out.println("número digitado: "+f);
		
		//para ler String
		System.out.println("Digite uma string");
		String s = sc.next();
		System.out.println("String: "+s);
		
		//Para ler um char
		System.out.println("Digite um char");
		char c = sc.next().charAt(0);
		System.out.println("Char: "+c);
		
		//Lembrete, tem como digitar todos em uma linha usando espaço para separar.
		
		sc.close();//Para encerrar o uso do scanner --> obrigatório
	}

}
