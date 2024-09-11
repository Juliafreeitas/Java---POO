package heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		g1.setNome("Joana");
		g1.setCpf("123456789");
		g1.setSalario(5000.);
		g1.setCategoria("ADM");
		g1.setnEmpregados(10);

		g1.aumentarSalario();

		System.out.println(g1.toString());
	}

}
