package aula;

import javax.swing.JOptionPane;

public class GerarFolha {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		funcionario.setCpf(JOptionPane.showInputDialog("Digite seu cpf: "));
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto: ")));

		/*
		 * if (funcionario.salarioBruto > 1402.) {
		 * System.out.println("Salário liquido: " + funcionario.calculoFolha());
		 * System.out.println("Folha gerada com sucesso"); } else {
		 * System.out.println("Salário inválido!"); }
		 */

		JOptionPane.showMessageDialog(null,
				"Nome: " + funcionario.getNome() + "\nSalário liquido: " + funcionario.calculoFolha());
		JOptionPane.showMessageDialog(null, "Folha gerada com sucesso");

		System.out.println("Total de funcionários: " + funcionario.getTotal());

	}

}
