package br.com.fiap.tds.bean;

public class Circulo {

	public Circulo() {
	}

	public double calcularArea(double raio) {

		double area = Math.PI * (raio * raio);
		return area;
	}

}
