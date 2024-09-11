package exercicio;

public class Atividade03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("O fatorial de " + i + " é " + conta(i));

		}
	}

	public static int conta(int i) {

		if (i == 0 || i == 1) {
			return 1;
		} else {
			return i * conta(i - 1);
		}

	}
}
