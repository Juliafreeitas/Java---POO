package exercicio;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina {
	private String categoria;
	private TipoServico tiposervico;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorServico();
		return TipoServico.LAVAGEM.getValorServico();
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valorCobrado += TipoServico.OLEO.getValorServico() - 50;
			return TipoServico.OLEO.getValorServico() - 50;

		} else {
			valorCobrado += TipoServico.OLEO.getValorServico();
			return TipoServico.OLEO.getValorServico();
		}

	}

	@Override
	public double revisao() {
		if (dataConserto.getMonth().getValue() == 8) {
			valorCobrado += TipoServico.REVISAO.getValorServico() * 0.9;
			return TipoServico.REVISAO.getValorServico() * 0.9;

		} else {
			valorCobrado += TipoServico.REVISAO.getValorServico();
			return TipoServico.REVISAO.getValorServico();
		}
	}

}
