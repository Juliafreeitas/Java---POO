package aula;

public class CalculoImc {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		p.setCodigo(123);
		p.setNome("Julia");
		p.setAltura(1.65);
		p.setPeso(55.);

		System.out.println(p.resposta());
	}

}
