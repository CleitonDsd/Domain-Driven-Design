package br.com.fiap.tds.bean;

public class Veiculo {

	// Atributos
	private String modelo;

	private int quantidadeLugares;

	private double comprimento;

	private Cor cor;

	private int anoFabricacao;

	// Construtores
	public Veiculo() {
	}

	public Veiculo(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao) {
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
		this.comprimento = comprimento;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
	}

	// Gets e Sets
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

}
