package revisao;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nome, String nMedico, String crm, String tipoAnestesia) {
		super(nome, nMedico, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {

		return "anestesia: " + tipoAnestesia + " médico: " + super.toString();
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 2000;
	}

}
