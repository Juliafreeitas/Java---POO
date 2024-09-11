package slide02;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		Double n1, n2, m;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

		m = (n1 + n2) / 2;

		if (m == 10) {
			JOptionPane.showMessageDialog(null, "Aprovado, parabéns!");
		} else if (m >= 7 && m < 10) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}

	}

}
