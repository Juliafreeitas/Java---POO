package exercicios;

public class Marca {
	private Integer codigo;
	private String nomeMarca;

	public Marca(Integer codigo, String nomeMarca) {
		super();
		this.codigo = codigo;
		this.nomeMarca = nomeMarca;
	}

	@Override
	public String toString() {
		return "Marca: " + nomeMarca + " código: " + codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

}
