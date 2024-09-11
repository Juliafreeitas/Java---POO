package aula;

import javax.swing.JOptionPane;

public class ProdutosImposto {

	public static void main(String[] args) {
		int resposta;

		do {
			String descricao;
			Double valor, vt;
			Integer quantidade;

			descricao = JOptionPane.showInputDialog("Descrição do produto: ");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produtos: "));

			Pedidos p = new Pedidos(descricao, valor, quantidade);

			vt = valor * quantidade;

			String mensagem = String.format("Produto: %s%nValor %.2f%nQuantidade %d%nValor total: %.2f%nICMS R$%.2f%n",
					p.getDescricao(), p.getValor(), p.getQuantidade(), vt, p.calcularIcms());

			JOptionPane.showMessageDialog(null, mensagem);

			resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular outro produto?", "",
					JOptionPane.YES_NO_OPTION);

		} while (resposta == JOptionPane.YES_OPTION);

	}

}
