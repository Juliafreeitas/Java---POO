package exception;

public class Exemplo {

	// throw - lancar
	// throws - encaminhar o tratamento erro para o metodo chamador
	public static double calcular(int a, int b) throws ArithmeticException {
		/*
		 * if (b == 0) { throw new ArithmeticException("Erro de divisao por zero!"); }
		 */
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Entrando no try");
			System.out.println("Resultado: " + calcular(10, 0));
			System.out.println("Finalizando try");
		} catch (ArithmeticException e) {
			System.err.println("Erro de divisão por zero!");
		} finally {
			System.out.println("É sempre executado");
		}

	}

}
