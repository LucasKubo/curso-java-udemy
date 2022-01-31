package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		//Adicionando elemento na lista:
		list.add("Davi");
		list.add("Lucas");
		list.add("Victor");
		list.add("Leonardo");
		list.add(1, "Flávio"); // Escolhendo onde adicionar
		
		//Imprimindo
		System.out.println("--------------------");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		//Removendo elemento:
		list.remove(1);
		list.remove("Lucas");
		
		//Imprimindo
		System.out.println("--------------------");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		//Removendo a partir de um predicado:
		list.removeIf(x -> x.charAt(0) == 'D');
		
		//Imprimindo
		System.out.println("--------------------");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		//Filtrando a partir de um predicado:
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
		
		//Imprimindo
		System.out.println("--------------------");
		for (String x : result) {
			System.out.println(x);
		}
		
		//Encontrando primeira ocorrencia com base em um predicado:
		String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println("--------------------");
		System.out.println(name);
	}

}
