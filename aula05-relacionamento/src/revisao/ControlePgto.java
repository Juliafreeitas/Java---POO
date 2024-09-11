package revisao;

public class ControlePgto {
	private Double total = 0.;

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void calcularPagamento(PlanoSaude ps) {
		total = total + ps.getValorPago();
	}

}
