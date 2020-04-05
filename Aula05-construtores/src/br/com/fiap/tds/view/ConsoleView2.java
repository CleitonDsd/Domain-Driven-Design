package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class ConsoleView2 {

	public static void main(String[] args) {
		// Ler os dados para adicionar nos atributos do carro e cor

		// Instanciar o objeto responsável por ler os dados do teclado
		Scanner leitor = new Scanner(System.in);

		// Cor - Nome
		System.out.println("Digite o nome da cor:");
		String nome = leitor.next();

		// Instanciar a cor com o nome
		Cor cor = new Cor(nome);

		// Carro - Modelo, Ano de Fabricação, Placa e Lugares
		System.out.println("Digite o modelo:");
		String modelo = leitor.next();

		System.out.println("Digite o ano de fabricação:");
		int ano = leitor.nextInt();

		System.out.println("Digite a placa:");
		String placa = leitor.next();

		System.out.println("Digite a quantidade de lugares:");
		int lugares = leitor.nextInt();

		// Instanciar o carro com os valores
		Carro carro = new Carro(modelo, ano, placa, lugares, cor);

		// Exibir os dados
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAnoFabricacao());
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Lugares: " + carro.getQuantidadeLugares());
		System.out.println("Cor: " + carro.getCor().getNome());

		leitor.close();
	}

}