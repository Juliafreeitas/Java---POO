package enumeradores;

//classe final - imutavel - nao pode ter heranca (filhos)
public class Escola {
	private String cnpj;
	private String razaoSocial;

	public Escola(String cnpj, String razaoSocial) {
		super();
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);
	}

	// nao pode ser sobrescrito
	public final void gerarRelatorio() {
		System.out.println("Relatorio!");
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
