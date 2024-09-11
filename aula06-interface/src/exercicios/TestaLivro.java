package exercicios;

public class TestaLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antonio", "Cisco CCNA", 85.);
		Livro l2 = new Livro("Kathy Sierra", "Use a Cabeça JAVA", 98.);

		Operacao o1 = new Operacao("Empréstimo", null, l2);
		Operacao o2 = new Operacao("Venda", null, l1);

		l1.reajuste(0.06);

		o1.emprestarLivro();
		o2.venderLivro();

		System.out.println(o1);
		System.out.println(o2);

	}

}
