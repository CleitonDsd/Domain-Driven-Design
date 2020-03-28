package br.com.fiap.tds.view;

import br.com.fiap.tds.beans.Produto;

public class Terminal {

	public static void main(String[] args) {

		// Instanciando vari�vel refer�ncia
		Produto celular = new Produto();

		// Utilizar o m�todo para inicializar os valores no objeto
		celular.inicializar("Xiaomi", "MI10", 3000, false);

		// Coloca o produto na BlackFryday
		celular.colocarBlackFryday();

		// Exbir pre�o do produto
		System.out.println("Pre�o (R$): " + celular.preco);

		// Calcular o preco da parcela para 5

		// Exibir o pre�o da parcela
		double parcela = celular.calcularPrazo(5);

		// Recuperar os detalhes do produto
		String detalhes = celular.retornarDetalhes();

		// Exibir os detalhes
		System.out.println(celular.retornarDetalhes());
	}
}
