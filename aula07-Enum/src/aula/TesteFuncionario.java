package aula;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Carla", aula.Funcionario.EstadoCivil.VIUVO);

		System.out.println(f.getNome());
		System.out.println(f.getEstadoCivil());
		System.out.println(f.getEstadoCivil().ordinal());

	}

}
