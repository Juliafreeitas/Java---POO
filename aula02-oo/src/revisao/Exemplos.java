package revisao;

public class Exemplos {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		/*
		 * String[] times = { "Vasco", "Flamengo", "Botafogo", "Fluminense" };
		 * 
		 * for (int j = 0; j < times.length; j++) { if (j >= 1 && j <= 2) { continue;
		 * 
		 * } System.out.println(times[j]); }
		 * 
		 * System.out.println("*****Foreach*****");
		 * 
		 * for (String t : times) { System.out.println(t); }
		 */

		int cont1 = 0, cont2 = 0;
		for (int k = 0; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.println(k + " é par");
				cont1++;
			} else {
				System.out.println(k + " é ímpar");
				cont2++;
			}
		}
		System.out.println("A quantidade de números pares são: " + cont1);
		System.out.println("A quantidade de números ímpares são: " + cont2);

	}

}
