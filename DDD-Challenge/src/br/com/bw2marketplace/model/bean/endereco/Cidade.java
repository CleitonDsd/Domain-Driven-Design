package br.com.bw2marketplace.model.bean.endereco;

public class Cidade {

	private long idCidade;
	private String nomeCidade;

	public Cidade() {

	}

	public Cidade(long idCidade, String nomeCidade) {
		super();
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
	}

	public long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

}
