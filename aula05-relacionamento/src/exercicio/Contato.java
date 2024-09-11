package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private List<Telefone> telefones = new ArrayList<>();
	private Endereco endereco;

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato \nNome: " + nome + telefones + endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionarTelefone(Telefone telefone) {
		telefones.add(telefone);
	}

	public void listarTelefone() {
		for (Telefone v : telefones) {
			System.out.println(v.getNumero());
		}
	}

}
