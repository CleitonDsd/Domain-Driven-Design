package br.com.fiap.tds.bean;

public class Carro {

	private String modelo;

	private int quantidadeLugares;

	private double comprimento;

	private int quantidadePortas;

	private int anoFabricacao;

	private Cor cor;

	private String placa;

	private float motor = 1;

	// Construtores
	public Carro(String modelo, int ano, String placa, int lugares, Cor cor) {
		this.modelo = modelo;
		this.anoFabricacao = ano;
		this.placa = placa;
		this.quantidadeLugares = lugares;
		this.cor = cor;
	}

	public Carro() {

	}

	public Carro(String modelo, int lugares, double comprimento, int portas, int ano, Cor cor, String placa,
			float motor) {

		this.placa = placa;
		this.anoFabricacao = ano;
		this.comprimento = comprimento;
		this.quantidadePortas = portas;
		this.cor = cor;
		this.modelo = modelo;
		this.motor = motor;
		this.quantidadeLugares = lugares;

	}

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

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

}