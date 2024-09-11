package exercicio;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Escreva um número:");
		Integer n1 = s.nextInt();
		System.out.println("+---Resultado---+");

		for (int n = 0; n <= 10; n++) {
			System.out.printf("| %2d * %2d = %3d |\n", n, n1, (n * n1));

		}

		System.out.println("+---------------+");
		s.close();

	}

}
