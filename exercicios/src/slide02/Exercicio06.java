package slide02;

public class Exercicio06 {

	public static void main(String[] args) {
		Integer cont = 0;

		for (int n = 0; n <= 22; n++) {
			if (n % 2 == 0) {
				System.out.println("Java. ");
				cont++;
			} else {
				continue;
			}
		}

		System.out.println("\nA quantidade de números pares é: " + cont);
	}
}
