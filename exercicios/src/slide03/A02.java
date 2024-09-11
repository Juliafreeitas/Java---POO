package slide03;

public class A02 {
	private Integer crm;
	private static int cont = 0;
	private String nome;
	private Double salario, vconsulta;

	public A02(Integer crm, String nome, Double salario, Double vconsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.vconsulta = vconsulta;
		cont++;
	}

	public Integer getCont() {
		return cont;
	}

	public Double salariodinheiro() {
		return salario = salario + vconsulta;
	}

	public Double salariocartao() {
		return salario = salario + (vconsulta * 0.7);
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
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

	public Double getVconsulta() {
		return vconsulta;
	}

	public void setVconsulta(Double vconsulta) {
		this.vconsulta = vconsulta;
	}

}
