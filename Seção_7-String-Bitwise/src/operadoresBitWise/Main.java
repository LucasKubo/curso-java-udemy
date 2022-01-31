package operadoresBitWise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores que fazem verificação bit a bit.
		// &(e) |(ou) ^(ou-exclusivo)
		
		int n1 = 89;//0101 1001
		int n2 = 60;//0011 1100
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		//Utilizado em redes, para identificar um bit
	}

}
