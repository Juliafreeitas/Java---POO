package aula;

import java.time.LocalDate;

public class Pedido {
	private Integer n;
	private LocalDate data;
	private Double total;
	private static int cont;

	// Construtor - executado na criacao de um objeto, new - criando um construtor
	// nao tem void e nem retorno, executado somente quando da um 'new'

	public Pedido(Integer n, LocalDate data, Double total) {
		this.n = n;
		this.data = data;
		this.total = total;
		cont++;
	}

	public static int getCont() {
		return cont;
	}

	public Pedido(Integer n) {
		super();
		this.n = n;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
