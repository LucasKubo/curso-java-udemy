package operacoesMatematicas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int raiz = (int) Math.sqrt(x); // casting --> conversao explícita de double para int
		double expo = Math.pow(x, 2); // Nesse caso, utilizei o double mesmo
		
		int y = -10;
		int absoluto = Math.abs(y);
		
		System.out.println(x);
		System.out.println("Raiz de x = "+raiz);
		System.out.println("X ao quadrado = "+expo);
		System.out.println(y);
		System.out.println("Valor absoluto de y = "+ absoluto);
	}

}
