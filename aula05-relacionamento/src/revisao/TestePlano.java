package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Checkup", "123456");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "Geral");
		ControlePgto cp = new ControlePgto();

		c.calcularPagamento();
		cp.calcularPagamento(c);

		m.calcularPagamento();
		cp.calcularPagamento(m);

		a.calcularPagamento();
		cp.calcularPagamento(a);

		System.out.println(c);
		System.out.println(m);
		System.out.println(a);

		System.out.println(c.getValorPago() + m.getValorPago() + a.getValorPago());
		System.out.println("Total: " + cp.getTotal());

	}

}
