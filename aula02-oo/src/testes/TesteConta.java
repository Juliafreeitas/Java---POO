package testes;

import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();

		conta1.numero = 123;
		conta1.titular = "Julia";
		conta1.saldo = 1000.0;

		conta1.deposito(500.0);
		conta1.saque(200.);

		System.out.println("Saldo da conta: " + conta1.saldo);

	}

}
