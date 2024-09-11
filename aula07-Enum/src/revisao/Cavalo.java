package revisao;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.setMarcaFerradura(marcaFerradura);
	}

	@Override
	public void amamentar() {
	}

	@Override
	public String emitirSom() {
		return null;
	}

	@Override
	public void trocarFerradura() {
	}

	@Override
	public void viajar() {
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	public void setMarcaFerradura(String marcaFerradura) {
		this.marcaFerradura = marcaFerradura;
	}

}
