package slide03;

public class A01 {
	private String placa;
	private String tipo;
	private Double valor;

	public Double ipva() {
		if (tipo.equals("Flex")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
