package revisao;

public class Vetor {

	public static void main(String[] args) {
		// String[] produtos = new String[4];
		// String[] produtos = { "Celular", "TV", "Kindle", "Alexa" };
		// produtos[0] = "Som";

		Produto[] produtos = new Produto[2];
		produtos[0] = new Produto("Celular", 1500.);
		produtos[1] = new Produto("TV", 2000.);

		for (Produto produto : produtos) {
			System.err.println(produto.getDescricao() + " valor: " + produto.getValor());
		}

	}

}
