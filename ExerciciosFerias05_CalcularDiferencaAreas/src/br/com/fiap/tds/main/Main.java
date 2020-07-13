package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Circulo;
import br.com.fiap.tds.bean.Quadrado;

public class Main {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		Circulo circulo = new Circulo();

		System.out.println(quadrado.calcularArea(10));
		System.out.println(circulo.calcularArea(10));
	}

}
