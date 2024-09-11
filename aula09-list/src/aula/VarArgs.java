package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		// total = calcularSoma(10, 4, 20, 40, 12, 100, 200, 100, 1);
		total = calcularSoma(100, 20, 30, 10);

		System.out.println("Total: " + total);
	}

	// quem chamar esse metodo pode passar quantos valores quiser
	public static int calcularSoma(int num, int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}

		System.out.println("Soma: " + soma);
		
		return soma * num;
	}

}
