package slide02;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String nome;
		Integer idade;
		Double peso, altura;

		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite a seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

		System.out.println(
				"O funcionário " + nome + " tem:\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso);
	}

}
