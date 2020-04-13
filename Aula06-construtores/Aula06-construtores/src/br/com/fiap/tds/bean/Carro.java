package br.com.fiap.tds.bean;

public class Carro {

	private String modelo;

	private int quantidadeLugares;

	private float comprimento;

	private int quantidadePortas;

	private int ano;

	private Cor cor;

	private String placa;

	private float motor = 1;

	// Construtor para o Carro com todos atributos
	public Carro(String modelo, int quantidadeLugares, float comprimento, int quantidadePortas, int ano, Cor cor,
			String placa, float motor) {

		this(placa, cor, modelo);

		this.motor = motor;
		this.quantidadeLugares = quantidadeLugares;
		this.comprimento = comprimento;
		this.quantidadePortas = quantidadePortas;
		this.ano = ano;
		/*
		 * this.cor = cor; this.placa = placa; this.modelo = modelo;
		 */

	}

	// Construtor para o Carro
	public Carro(String modelo, Cor cor, String placa) {
		this.cor = cor;
		this.placa = placa;
		this.modelo = modelo;
	}

	public Carro() {

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

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
