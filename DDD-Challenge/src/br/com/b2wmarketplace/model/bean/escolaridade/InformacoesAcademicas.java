package br.com.b2wmarketplace.model.bean.escolaridade;

public class InformacoesAcademicas {

	private String periodo;
	private boolean cursando;
	private String dataInicio;
	private String previsaoTermino;

	public String toString() {
		return "\n Período: " + periodo + "\n Cursando: " + cursando + "\n Data de início: " + dataInicio
				+ "\n Previsão de termino: " + previsaoTermino;
	}

	public InformacoesAcademicas() {

	}

	public InformacoesAcademicas(String periodo, boolean cursando, String dataInicio, String previsaoTermino) {
		this.periodo = periodo;
		this.cursando = cursando;
		this.dataInicio = dataInicio;
		this.previsaoTermino = previsaoTermino;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public boolean isCursando() {
		return cursando;
	}

	public void setCursando(boolean cursando) {
		this.cursando = cursando;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getPrevisaoTermino() {
		return previsaoTermino;
	}

	public void setPrevisaoTermino(String previsaoTermino) {
		this.previsaoTermino = previsaoTermino;
	}
}