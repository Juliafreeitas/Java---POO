package exercicio;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veículo modelo: " + modelo + ", valor cobrado: " + valorCobrado + ", data do conserto: " + dataConserto
				+ proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

}
