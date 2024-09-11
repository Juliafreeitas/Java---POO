package revisao;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.setPeso(peso);
	}

	@Override
	public String voar() {
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
