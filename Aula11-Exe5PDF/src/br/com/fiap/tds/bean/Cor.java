package br.com.fiap.tds.bean;

public class Cor {

	private String nome;

	private int r, g, b;

	public Cor() {
	}

	public Cor(int r, int g, int b) {
		this.r = r;
		this.b = b;
		this.g = g;
	}

	public Cor(String nome, int r, int g, int b) {
		this(r, g, b);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}