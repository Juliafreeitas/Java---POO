package exercicios;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {

		Produto p1 = new Produto(123, "Tv", 3000., Categoria.ELETRONICO);
		Produto p2 = new Produto(456, "Pneu", 800., Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(789, "Celular", 2500., Categoria.ELETRONICO);

		Venda v1 = new Venda(p1, LocalDate.now(), 1);
		Venda v2 = new Venda(p2, LocalDate.now(), 2);
		Venda v3 = new Venda(p3, LocalDate.now(), 1);

		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();

		System.out.println("Total: " + Venda.getTotalVenda());
	}

}
