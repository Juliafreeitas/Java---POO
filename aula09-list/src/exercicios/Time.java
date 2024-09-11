package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private List<Atleta> atletas = new ArrayList<Atleta>();

	public Time(String nomeTime, String tecnico, String diretor) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}

	@Override
	public String toString() {
		return "Nome time: " + nomeTime + ", técnico: " + tecnico + ", diretor: " + diretor;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void addAtleta(Atleta atleta) {
		atletas.add(atleta);
	}

	public void mostrarTime() {
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
	}
}
