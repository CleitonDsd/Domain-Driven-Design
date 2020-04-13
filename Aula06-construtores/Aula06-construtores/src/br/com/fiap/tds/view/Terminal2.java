package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class Terminal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Ler os dados que o usuário informar
		System.out.println("Digite o nome da cor: ");
		String nome = scan.next();

		// Instanciar uma cor com o nome
		Cor cor = new Cor(nome);

		// Instanciar um Carro com o modelo, cor e placa
		System.out.println("Digite o modelo do carro: ");
		String modelo = scan.next();

		System.out.println("Digite a placa do Carro: ");
		String placa = scan.next();

		Carro carro = new Carro(modelo, cor, placa);
		
		// Exibir os dados Modelo, Nome da Cor e Placa
		System.out.println("=============="
				+ "\nModelo: " + carro.getModelo()  
				+ "\nCor: " + carro.getCor().getNome()
				+ "\nPlaca: " + carro.getPlaca());
		
		scan.close();
	}

}
