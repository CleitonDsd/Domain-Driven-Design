package br.com.fiap.loja.beans;

public class Usuario {

	private String nome;

	private int idade;

	private String endereco;

	private String telefone;

	private String email;

	private boolean premiun;

	public boolean isPremiun() {
		return premiun;
	}

	public void setPremiun(boolean premiun) {
		this.premiun = premiun;
	}

	/*
	 * Encapsulamento -> proteger dados Getters and Setters
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
