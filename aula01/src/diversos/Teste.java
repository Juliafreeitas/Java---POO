package diversos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		String nome;
		System.out.println("Hello World! ");
		System.out.println("Java! ");
		JOptionPane.showMessageDialog(null, "Hello World !");
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, nome);

	}

}
