package br.com.bw2marketplace.model.bean.endereco;

public class Endereco {

	private int cep;
	protected Estado estado;
	protected Cidade cidade;
	private int numeroLogradouro;
	private String nomeBairro;

	
	public Endereco() {

	}

	public Endereco(int cep, int numeroLogradouro, String nomeBairro) {
		super();
		this.cep = cep;
		this.numeroLogradouro = numeroLogradouro;
		this.nomeBairro = nomeBairro;
	}

	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
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

}
