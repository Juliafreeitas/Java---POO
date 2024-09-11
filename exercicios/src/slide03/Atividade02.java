package slide03;

public class Atividade02 {

	public static void main(String[] args) {
		A02 a = new A02(12345, "Ana Maria", 0., 300.);
		A02 a2 = new A02(456789, "Antonio", 0., 300.);

		Double sc = a.getSalario() + a.salariocartao();
		Double sd = a2.getSalario() + a2.salariodinheiro();

		System.out.println("Nome: " + a.getNome() + "\nCRM: " + a.getCrm() + "\nSalário: " + sc);
		System.out.println("\nNome: " + a2.getNome() + "\nCRM: " + a2.getCrm() + "\nSalário: " + sd);

		System.out.println("\nQuantidade de médicos: " + a2.getCont());
	}

}
