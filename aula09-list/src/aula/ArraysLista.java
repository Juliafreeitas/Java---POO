package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLista {

	public static void main(String[] args) {
		List<String> bichos = Arrays.asList("Cachorro", "Gato", "Coelho", "Pato");

		bichos.set(3, "Papagaio");

		if (bichos.isEmpty()) {
			System.out.println("A lista está vazia");
		}

		Collections.sort(bichos);
		System.out.println(bichos);
	}

}
