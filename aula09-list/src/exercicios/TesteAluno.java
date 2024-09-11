package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> aluno = new ArrayList<>();

		aluno.add(new Aluno("João", 8., 5.5));
		aluno.add(new Aluno("Maria", 11., 5.));
		aluno.add(new Aluno("Carlos", 9., 7.));
		aluno.add(new Aluno("Roberta", -1., 6.));

		for (Aluno a : aluno) {
			try {
				a.calcularMedia();
				System.out.println(a + ", média: " + a.calcularMedia());
			} catch (AlunoExcecao e) {
				System.err.println(a.getNome() + " " + e.getMessage());
			}

		}

	}

}
