package exercicio;

public class TesteContato {

	public static void main(String[] args) {
		Estado e = new Estado("Rio de Janeiro", "RJ");
		Cidade c = new Cidade("Petrópolis", e);
		Endereco ed = new Endereco("16 de Março", "Centro", "25620-040", c);
		Telefone tf = new Telefone("123456789");
		Telefone tf2 = new Telefone("987654321");
		Contato cont1 = new Contato("Julia", ed);

		cont1.adicionarTelefone(tf);
		cont1.adicionarTelefone(tf2);

		System.out.println(cont1);

	}

}
