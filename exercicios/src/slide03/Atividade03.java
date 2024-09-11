package slide03;

import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {
		A03 a = new A03();
		Double sl;
		String m;

		a.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		a.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: ")));

		sl = (a.getSalario() - (a.inss() + a.vt()));

		m = String.format("Nome: %s%nSalário: %.2f%nINSS: %.2f%nVale transporte: %.2f%nSalário líquido: %.2f",
				a.getNome(), a.getSalario(), a.inss(), a.vt(), sl);

		JOptionPane.showMessageDialog(null, m);

	}

}
