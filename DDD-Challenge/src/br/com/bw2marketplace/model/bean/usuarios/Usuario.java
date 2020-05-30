package br.com.bw2marketplace.model.bean.usuarios;

public class Usuario {

	private String nome;
	private String data;
	private int numeroCpf;
	private int numeroRg;
	private char sexo;
	private String etnia;
	private String estadoCivil;

	public Usuario() {

	}

	public Usuario(String nome, String data, int numeroCpf, int numeroRg, char sexo, String etnia, String estadoCivil) {
		super();
		this.nome = nome;
		this.data = data;
		this.numeroCpf = numeroCpf;
		this.numeroRg = numeroRg;
		this.sexo = sexo;
		this.etnia = etnia;
		this.estadoCivil = estadoCivil;
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

	public int getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(int numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public int getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(int numeroRg) {
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

}
