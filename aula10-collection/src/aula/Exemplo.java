package aula;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Branco");
		lista.add("Preto");
		lista.add("Amarelo");
		lista.add("Azul");
		
		
		//Set<Integer> numeros = new HashSet<>();
		Set<Integer> numeros = new LinkedHashSet<>();
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		
		System.out.println(lista);
		System.out.println(numeros);
		
	}

}
