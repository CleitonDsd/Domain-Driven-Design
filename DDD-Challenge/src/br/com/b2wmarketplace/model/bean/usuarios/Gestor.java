package br.com.b2wmarketplace.model.bean.usuarios;

public class Gestor extends Usuario {

	private String setor;

	public String toString() {
		return "\n Nome: " + nome + "\n Área: " + setor;
	}

	public Gestor() {

	}

	public Gestor(String setor, String nome) {
		super(nome);
		this.setor = setor;
	}

	public Gestor(String nome, String data, String numeroCpf, String numeroRg, char sexo, String etnia,
			String estadoCivil, String email, String setor) {
		super(nome, data, numeroCpf, numeroRg, sexo, etnia, estadoCivil, email);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}