package br.com.fiap.tds.bean;

public class Carro extends Veiculo {

	// Atributos
	private int quantidadePortas;

	private String placa;

	private int motor = 1;

	// Construtores
	public Carro() {
	}

	public Carro(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao,
			int quantidadePortas, String placa, int motor) {
		super(modelo, quantidadeLugares, comprimento, cor, anoFabricacao);
		this.quantidadePortas = quantidadePortas;
		this.placa = placa;
		this.motor = motor;
	}

	// Gets e Sets
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

}