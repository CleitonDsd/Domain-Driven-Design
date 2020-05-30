package br.com.bw2marketplace.model.bean.escolaridade;

public class Escola extends InformacoesAcademicas {

	private long idEscola;
	private String nomeEscola;
	private boolean escolaTecnica;

	public Escola() {

	}

	public Escola(long idEscola, String nomeEscola, boolean escolaTecnica) {
		super();
		this.idEscola = idEscola;
		this.nomeEscola = nomeEscola;
		this.escolaTecnica = escolaTecnica;
	}

	public long getIdEscola() {
		return idEscola;
	}

	public void setIdEscola(long idEscola) {
		this.idEscola = idEscola;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public boolean isEscolaTecnica() {
		return escolaTecnica;
	}

	public void setEscolaTecnica(boolean escolaTecnica) {
		this.escolaTecnica = escolaTecnica;
	}

}
