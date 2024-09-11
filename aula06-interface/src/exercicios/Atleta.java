package exercicios;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private static int totalParticipantes = 0;
	private Pais pais;

	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Atleta nome: " + nome + " " + verificaSituacao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90.) {
			modalidade = "peso pesado";
			totalParticipantes++;
			return "participará";

		} else if (peso >= 60. && peso <= 90.) {
			modalidade = "peso medio";
			totalParticipantes++;
			return "participará";

		} else {
			return "não participará";
		}

	}

}
