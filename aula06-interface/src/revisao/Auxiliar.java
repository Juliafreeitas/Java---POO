package revisao;

public abstract class Auxiliar extends Funcionario {
	private String tipo;

	public Auxiliar(String nome, Double salario, String turno, String tipo) {
		super(nome, salario, turno);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Auxiliar tipo: " + tipo + super.toString();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}