package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {
		// polimorfismo - um objeto pode ser referenciado de varias formas
		Moto v1 = new Moto("LVC9090", "Cinza", 39000., true);
		Caminhao v2 = new Caminhao("ABC1234", "Branco", 110000., 100000);

		System.out.println("Moto: " + v1);
		System.out.println("Valor IPVA: " + v1.ipva() + "\n");
		System.out.println("Caminhão: " + v2);
		System.out.println("Valor IPVA: " + v2.ipva());
	}

}
