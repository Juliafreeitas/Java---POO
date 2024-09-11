package aula;

public class Pedidos {
	private String descricao;
	private Double valor;
	private Integer quantidade;

	public Double calcularIcms() {
		return (quantidade * valor) * 0.12;
	}

	public Pedidos(String descricao, Double valor, Integer quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
