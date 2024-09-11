package slide03;

public class A03 {
	private String nome;
	private Double salario;

	public Double inss() {
		return salario * 0.11;
	}

	public Double vt() {
		return salario * 0.06;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
