package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Integer id = 0;

		List<Cliente> clientes = new ArrayList<>();

		try {
			do {

				System.out.println("Digite seu id: ");
				id = sc.nextInt();

				if (id <= 0) {
					throw new Exception("Id inválido");
				}

				System.out.println("Digite seu nome: ");
				String nome = sc.next();

				System.out.println("Digite sua idade: ");
				Integer idade = sc.nextInt();

				System.out.println("Digite seu telefone: ");
				String telefone = sc.next();

				clientes.add(new Cliente(id, nome, idade, telefone));

			} while (id > 0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		for (Cliente c : clientes) {
			System.out.println(c);
		}

	}

}
