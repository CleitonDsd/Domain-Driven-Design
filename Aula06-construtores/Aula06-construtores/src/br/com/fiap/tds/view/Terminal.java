package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class Terminal {

	public static void main(String[] args) {

		// Instanciar uma Cor
		Cor cor = new Cor("Vermelho", 56, 56, 56);

		// Instanciar um Carro
		Carro gol = new Carro("Gol", 4, 3.8f, 3, 2010, cor, "DDD-9999", 1);

		// Instanciando uma outra cor usando o construtor
		Cor preta = new Cor("Preta");

		// Instanciar um carro utilizando outro construtor
		Carro fusca = new Carro("Fusca", preta, "ABC-1234");

		// Exibindo algumas ingromações do objeto carro (fusca)
		System.out.println("Modelo do Carro: " + fusca.getModelo());

		// Exibir o nome da cor que está no atributo Cor do carro
		System.out.println("Cor do veículo: " + fusca.getCor().getNome());
	}

}
