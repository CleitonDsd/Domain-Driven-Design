package br.com.fiap.tds.view;

import br.com.fiap.tds.beans.Produto;

public class Terminal {

	public static void main(String[] args) {

		// Instanciando variável referência
		Produto celular = new Produto();

		// Utilizar o método para inicializar os valores no objeto
		celular.inicializar("Xiaomi", "MI10", 3000, false);

		// Coloca o produto na BlackFryday
		celular.colocarBlackFryday();

		// Exbir preço do produto
		System.out.println("Preço (R$): " + celular.preco);

		// Calcular o preco da parcela para 5

		// Exibir o preço da parcela
		double parcela = celular.calcularPrazo(5);

		// Recuperar os detalhes do produto
		String detalhes = celular.retornarDetalhes();

		// Exibir os detalhes
		System.out.println(celular.retornarDetalhes());
	}
}
