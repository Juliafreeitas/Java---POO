package exercicio;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		Double valorVenda;
		Double total = 0.;
		int escolha;
		char sim;

		Scanner s = new Scanner(System.in);

		Fixo v1 = new Fixo("Joana", "123456789", 2000., 0.03);
		Fixo v2 = new Fixo("Maria", "987654321", 2000., 0.03);

		do {
			System.out.println("Escolha o vendedor\n1 - Joana\n2 - Maria");
			escolha = s.nextInt();
			System.out.println("Digite o valor da venda: ");
			valorVenda = s.nextDouble();

			total = total + valorVenda;

			switch (escolha) {
			case 1: {
				v1.calcularSalario(valorVenda);
				break;
			}
			case 2: {
				v2.calcularSalario(valorVenda);
				break;
			}
			default:
				System.out.println("Vendedor inválido!");
				break;
			}

			System.out.println("Deseja continuar? ");
			sim = Character.toUpperCase(sim = s.next().charAt(0));

		} while (sim == 'S');

		s.close();

		System.out.println("\nO salário de " + v1.getNome() + " é " + v1.getSalarioBruto());
		System.out.println("O salário de " + v2.getNome() + " é " + v2.getSalarioBruto());
		System.out.println("Total de vendas: " + total);

	}

}
