package revisao;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Venda v1 = new Venda(123, LocalDate.of(2024, 9, 1), 2, 50., 0.);
		Venda v2 = new Venda(456, LocalDate.now(), 5, 21.8, 0.);

		v1.finalizarVenda();
		v2.finalizarVenda();

		System.out.println(v1);
		System.out.println(v2);

	}

}
