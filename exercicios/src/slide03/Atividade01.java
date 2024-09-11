package slide03;

public class Atividade01 {

	public static void main(String[] args) {
		A01 a = new A01();
		A01 a2 = new A01();
		
		a.setPlaca("LZX9090");
		a.setTipo("Flex");
		a.setValor(20000.);

		a2.setPlaca("KYZ1080");
		a2.setTipo("Gas");
		a2.setValor(40600.);

		System.out.println("O valor do ipva é: " + a.ipva());
		System.out.println("O valor do ipva é: " + a2.ipva());

	}

}
