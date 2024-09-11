package aula;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(123, LocalDate.now(), 100.);
		Pedido pedido2 = new Pedido(522, LocalDate.of(2024, 8, 15), 320.);
		Pedido pedido3 = new Pedido(961, LocalDate.now(), 500.);
		System.out.println("Número do pedido: " + pedido.getN());
		System.out.println("Valor do pedido: " + pedido.getTotal());
		System.out.println("\nNúmero do pedido: " + pedido2.getN());
		System.out.println("Valor do pedido: " + pedido2.getTotal());
		System.out.println("\nNúmero do pedido: " + pedido3.getN());
		System.out.println("Valor do pedido: " + pedido3.getTotal());

		System.out.println("\nTotal de pedidos: " + Pedido.getCont());

	}

}
