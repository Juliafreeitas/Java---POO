package enumeradores;

public class EscolaMunicipal extends Escola {
	// fica const
	private final String SEGMENTO;

	public EscolaMunicipal(String cnpj, String razaoSocial, String SEGMENTO) {
		super(cnpj, razaoSocial);
		this.SEGMENTO = SEGMENTO;
	}

	public String getSEGMENTO() {
		return SEGMENTO;
	}

}
