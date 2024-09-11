package slide02;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		Double s;

		s = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));

		if (s <= 1751.81) {
			System.out.println("O salário com desconto do INSS é: " + s * 0.92);
		} else if (s <= 2919.72) {
			System.out.println("O salário com desconto do INSS é: " + s * 0.91);
		} else if (s <= 5839.45) {
			System.out.println("O salário com desconto do INSS é: " + s * 0.9);
		} else
			System.out.println("O salário com desconto do INSS é: " + s * 0.89);
	}

}
