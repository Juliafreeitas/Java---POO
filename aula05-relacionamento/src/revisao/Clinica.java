package revisao;

public class Clinica extends PlanoSaude {
	private String nClinica;
	private String cnpj;

	public Clinica(String nome, String nClinica, String cnpj) {
		super(nome);
		this.nClinica = nClinica;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "clínica: " + nClinica + " cnpj: " + cnpj + " plano: " + super.toString();
	}

	public String getnClinica() {
		return nClinica;
	}

	public void setnClinica(String nClinica) {
		this.nClinica = nClinica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
