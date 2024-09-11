package exercicio;

import java.time.LocalDate;

public class TesteVeiculo {

	public static void main(String[] args) {
		Proprietario p = new Proprietario("Roberto");
		Carro c = new Carro("civic", LocalDate.of(2024, 8, 24), p, "sedan");

		System.out.println(p);
		System.out.println("Valor revisão: " + c.revisao());
		System.out.println("Valor óleo: " + c.trocarOleo());
		System.out.println(c + "\nValor cobrado total: " + (c.valorCobrado));

	}

}
