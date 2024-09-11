package oo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();

		c.nome = "Julia";
		c.cpf = "12345";
		c.telefone = "123";

		c2.nome = "Maria";
		c3.nome = "Joao";

		System.out.println(c.nome);

	}

}
