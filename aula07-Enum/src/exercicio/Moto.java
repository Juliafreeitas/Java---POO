package exercicio;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina {
	private int clilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int clilindradas) {
		super(modelo, dataConserto, proprietario);
		this.clilindradas = clilindradas;
	}

	public int getClilindradas() {
		return clilindradas;
	}

	public void setClilindradas(int clilindradas) {
		this.clilindradas = clilindradas;
	}

	@Override
	public double lavarVeiculo() {
		return 0;
	}

	@Override
	public double trocarOleo() {
		return 0;
	}

	@Override
	public double revisao() {
		return 0;
	}

}
