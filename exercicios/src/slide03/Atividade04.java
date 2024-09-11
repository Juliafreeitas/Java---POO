package slide03;

import javax.swing.JOptionPane;

public class Atividade04 {

	public static void main(String[] args) {
		Integer d, r;

		do {
			A04 a = new A04();

			a.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite um número: ")));
			a.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: ")));

			d = Integer
					.parseInt(JOptionPane.showInputDialog("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));

			switch (d) {
			case 1:
				JOptionPane.showMessageDialog(null, a.soma());
				break;

			case 2:
				JOptionPane.showMessageDialog(null, a.sub());
				break;

			case 3:
				JOptionPane.showMessageDialog(null, a.mul());
				break;

			case 4:
				JOptionPane.showMessageDialog(null, a.div());
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}

			r = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Continuar",
					JOptionPane.YES_NO_OPTION);

		} while (r == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "Programa encerrado!");

	}

}
