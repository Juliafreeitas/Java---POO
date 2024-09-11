package exercicio;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Escreva um número: ");
		Integer n1 = s.nextInt();
		System.out.println("O sucessor de " + n1 + " é " + (n1 + 1));
		System.out.println("O antecessor de " + n1 + " é " + (n1 - 1));

		s.close();
	}

}
