package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> pessoa = new HashMap<>();
		// TreeMap<Integer, String> pessoa = new TreeMap<>();
		// LinkedHashMap<Integer, String> pessoa = new LinkedHashMap<>();

		pessoa.put(1, "Ana");
		pessoa.put(3, "Carla");
		pessoa.put(7, "Carlos");
		pessoa.put(8, "Roni");

		System.out.println(pessoa);

		for (Map.Entry<Integer, String> dados : pessoa.entrySet()) {
			System.out.println(dados);
		}

	}

}
