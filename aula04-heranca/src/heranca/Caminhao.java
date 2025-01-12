package heranca;

public class Caminhao extends Veiculo {
	private Integer cargaMaxima;

	public Caminhao(String placa, String cor, Double preco, Integer cargaMaxima) {
		super(placa, cor, preco);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCarga máxima: " + cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Integer cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public Double ipva() {
		return preco * 0.05 + 200;
	}

}
