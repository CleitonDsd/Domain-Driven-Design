package br.com.fiap.tds.bean;

public class Eletrodomestico {

	private boolean bivolt;

	private int voltagem;

	protected String nome;

	private double preco;

	// Calcula o valor da garantia estendida de acordo com os anos
	public double calcularGarantiaEstendida(int anos) {
		return preco * 0.05 * anos;
	}

	public boolean isBivolt() {
		return bivolt;
	}

	public void setBivolt(boolean bivolt) {
		this.bivolt = bivolt;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
