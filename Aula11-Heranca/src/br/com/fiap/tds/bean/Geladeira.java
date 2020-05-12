package br.com.fiap.tds.bean;

public class Geladeira extends Eletrodomestico {
	private int numeroPortas;

	private float litros;

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
