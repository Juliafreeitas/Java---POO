package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Roni", "roni@gmail.com");
		Pessoa p2 = new Pessoa("Julia", "julia@gmail.com");

		Imovel i1 = new Imovel("Casa", 180000., p1);
		Imovel i2 = new Imovel("Apartamento", 1000000., p2);

		System.out.println(i1);
		System.out.println(i2);

	}

}
