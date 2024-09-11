package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// ArrayList nomes = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Matheus");
		nomes.add("Gabriela");

		if (nomes.contains("Matheus")) {
			nomes.remove(nomes.indexOf("Matheus"));
		}

		System.out.println(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
