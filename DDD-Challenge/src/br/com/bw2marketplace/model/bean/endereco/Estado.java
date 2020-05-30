package br.com.bw2marketplace.model.bean.endereco;

public class Estado {

	private long idEstado;
	private String nomeEstado;
	private String UF; // nm_sigla

	
	
	public Estado() {

	}

	public Estado(long idEstado, String nomeEstado, String uF) {
		super();
		this.idEstado = idEstado;
		this.nomeEstado = nomeEstado;
		UF = uF;
	}
	
	

	public long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}
