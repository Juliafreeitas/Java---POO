package heranca;

public class Gerente extends Empregado {
	private String categoria;
	private Integer nEmpregados;

	@Override
	public String toString() {
		return super.toString() + "\nCategoria: " + categoria + "\nNúmero de empregados: " + nEmpregados;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getnEmpregados() {
		return nEmpregados;
	}

	public void setnEmpregados(Integer nEmpregados) {
		this.nEmpregados = nEmpregados;
	}

}
