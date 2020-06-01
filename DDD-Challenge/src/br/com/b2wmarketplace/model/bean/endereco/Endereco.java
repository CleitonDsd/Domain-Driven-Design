package br.com.b2wmarketplace.model.bean.endereco;

public class Endereco {

	private String cep;
	private String estado;
	private String cidade;
	private String logradouro;
	private int numeroLogradouro;
	private String nomeBairro;

	public String toString() {
		return "\n Endereço: " + logradouro + " " + numeroLogradouro + " " + cep + " " + nomeBairro + " " + cidade + " "
				+ estado;
	}

	public Endereco() {

	}

	public Endereco(String cep, String estado, String cidade, String logradouro, int numeroLogradouro,
			String nomeBairro) {
		super();
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.nomeBairro = nomeBairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}