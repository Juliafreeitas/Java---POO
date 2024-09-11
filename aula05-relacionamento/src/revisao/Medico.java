package revisao;

public class Medico extends PlanoSaude {
	private String nMedico;
	private String crm;

	public Medico(String nome, String nMedico, String crm) {
		super(nome);
		this.nMedico = nMedico;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return super.toString() + " médico: " + nMedico;
	}

	public String getnMedico() {
		return nMedico;
	}

	public void setnMedico(String nMedico) {
		this.nMedico = nMedico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
	}

}
