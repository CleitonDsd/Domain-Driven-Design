package br.com.fiap.tds.bean;

public class Lancha extends Veiculo {

	// Atributos
	private int quantidadeMotores;

	// Construtores
	public Lancha() {
	}

	public Lancha(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao,
			int quantidadeMotores) {

		super(modelo, quantidadeLugares, comprimento, cor, anoFabricacao);
		this.quantidadeMotores = quantidadeMotores;

	}

	// Gets e Sets
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}

}