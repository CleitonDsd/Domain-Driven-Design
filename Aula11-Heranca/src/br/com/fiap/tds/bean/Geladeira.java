package br.com.fiap.tds.bean;

public class Geladeira extends Eletrodomestico {

	// Atributos
	private int numeroPortas;

	private float litros;

	// Construtores
	public Geladeira(boolean bivolt, int voltagem, String nome, double preco, int numeroPortas, float litros) {
		// chama o construtor da classe pai, sempre na primeira linha
		super(bivolt, voltagem, nome, preco);
		this.litros = litros;
		this.numeroPortas = numeroPortas;
	}

	public Geladeira() {
		super();
	}

	// Métodos
	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

}
