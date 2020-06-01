package br.com.b2wmarketplace.model.bean.usuarios;

public class Usuario {

	protected String nome;
	private String data;
	private String numeroCpf;
	private String numeroRg;
	private char sexo;
	private String etnia;
	private String estadoCivil;
	private String email;

	public String toString() {
		return "\n Nome: " + nome + "\n Nascimento: " + data + "\n CPF: " + numeroCpf + "\n RG: " + numeroRg
				+ "\n Gênero: " + sexo + "\n Etnia: " + etnia + "\n Estado civil: " + estadoCivil + "\n Email: "
				+ email;
	}

	public Usuario() {

	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	public Usuario(String nome, String data, String numeroCpf, String numeroRg, char sexo, String etnia,
			String estadoCivil, String email) {
		super();
		this.nome = nome;
		this.data = data;
		this.numeroCpf = numeroCpf;
		this.numeroRg = numeroRg;
		this.sexo = sexo;
		this.etnia = etnia;
		this.estadoCivil = estadoCivil;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}