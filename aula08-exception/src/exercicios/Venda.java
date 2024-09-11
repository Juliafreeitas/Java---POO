package exercicios;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private Integer quantidade;
	private static Double totalVenda = 0.;

	public Venda(Produto produto, LocalDate dataCompra, Integer quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Venda produto: " + produto + ", data da compra: " + dataCompra + ", quantidade: " + quantidade
				+ ", total da venda: " + totalVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public static Double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += produto.getValor() * quantidade;
		mostrarVenda();

	}

	private void mostrarVenda() {
		System.out.println(produto.getDescricao() + " - " + produto.getValor() + " - " + quantidade + " - "
				+ (produto.getValor() * quantidade));

	}

}
