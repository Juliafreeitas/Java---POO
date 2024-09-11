package relacao;

import java.util.Arrays;

public class Time {
	private String nome;
	private Atleta[] atletas;

	public Time(String nome, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Time nome: " + nome + ", atletas: " + Arrays.toString(atletas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void adicionarAtleta(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}

		}
	}

	public void mostrarTime() {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] != null) {
				System.out.println(atletas[i].getNome());
			} else {
				return;
			}
		}
	}
}
