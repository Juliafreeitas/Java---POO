package aula;

import javax.swing.JOptionPane;

public class Funcionario {
	private String cpf, nome;
	private Double salarioBruto;
	private static int total = 0;

	// visualizacao = get (get = retornar informações)
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public int getTotal() {
		return total;
	}

	// leitura = set (set = colocar informações)
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalarioBruto(Double salarioBruto) {
		if (salarioBruto > 1402.) {
			this.salarioBruto = salarioBruto;
		} else {
			JOptionPane.showMessageDialog(null, "Salário inválido! ");
		}

	}

	// Salario liquido * 11% de INSS e 6% de vale transporte

	public Double calculoFolha() {
		registro();
		return salarioBruto * 0.83;
	}

	public static int registro() {
		return total++;
	}

}
