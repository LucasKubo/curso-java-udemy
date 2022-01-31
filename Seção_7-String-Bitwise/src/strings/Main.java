package strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = " Lucas Hideki Kubo ";
		
		//Formatar
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.trim()); // Tira os espaços vazios do inicio e fim
		System.out.println(nome.replace("L", "K"));
		System.out.println(nome.replaceAll("Lucas", "Kubo"));
		System.out.println(nome.substring(14, 19));
		System.out.println(nome.substring(14));
		System.out.println(nome.indexOf("u"));
		System.out.println(nome.lastIndexOf("u"));
		
		String[] vet = nome.trim().split(" ");
		
		for(String x : vet){
			System.out.printf("[%s]",x);
		}
	}

}
