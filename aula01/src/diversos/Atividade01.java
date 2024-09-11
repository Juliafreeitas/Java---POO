package diversos;

import javax.swing.JOptionPane;

public class Atividade01 {
	public static void main(String[] args) {
		double idade, altura;
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

		/*
		 * if (idade >= 18 || altura >= 1.70) { JOptionPane.showMessageDialog(null,
		 * "Pode participar da maratona. "); } else {
		 * JOptionPane.showMessageDialog(null, "Não pode participar da maratona. "); }
		 */

		String res = (idade >= 18 || altura >= 1.70 ? "pode participar da maratona"
				: "não pode participar da maratona");
		System.out.println("O atleta " + res);
		// JOptionPane.showMessageDialog(null, "O atleta " + res);

	}
}
