package exercicio;

import javax.swing.JOptionPane;

public class Atividade04 {

	public static void main(String[] args) {
		String nome, telefone, email;
		Double salario;

		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
		email = JOptionPane.showInputDialog("Digite seu email: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));

		JOptionPane.showInternalMessageDialog(null, "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email
				+ "\nSalário com aumento: " + (salario + salario * 0.1));

	}

}
