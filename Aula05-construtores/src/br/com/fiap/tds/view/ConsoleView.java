package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class ConsoleView {

	// método que começa a execução a programa
	public static void main(String[] args) {
		// Instanciar a classe Cor
		// CTRL + SHIFT + o (Realiza o import de todas as classes)
		Cor branco = new Cor("Branco", 255, 255, 255);

		// Atribuir alguns valores para a cor
		branco.setNome("Vermelho");
		branco.setB(255);
		branco.setG(255);
		branco.setR(255);

		// Instanciar a classe Carro
		// f no final do número converte de double para float
		Carro carro = new Carro("Fusca", 3, 3.2, 5, 1980, branco, "ABC-9999", 1.5f);

		// Atribuir alguns valores para o carro
		carro.setAnoFabricacao(2019);
		carro.setModelo("Gol");
		carro.setCor(branco);

		// Exibir o modelo do carro e o nome da cor
		// String modelo = carro.getModelo();
		// sout + CRTL + espaço
		System.out.println("Modelo: " + carro.getModelo() + " Cor: " + carro.getCor().getNome());

	}

}