package slide02;

public class Exercicio05 {

	public static void main(String[] args) {
		Integer cont1 = 0, cont2 = 0;

		for (int n1 = 0; n1 <= 30; n1++) {
			if (n1 % 2 == 0) {
				cont1++;
			} else {
				cont2++;
			}
		}

		System.out.println(
				"A quantidade de números pares são: " + cont1 + "\nA quantidade de números ímpares são: " + cont2);
	}
}
