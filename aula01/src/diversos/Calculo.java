package diversos;

import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		// media entre valores
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
		calcular(n1, n2);
	}

	public static void calcular(double n1, double n2) {
		JOptionPane.showMessageDialog(null, (n1 + n2) / 2);
	}

}
