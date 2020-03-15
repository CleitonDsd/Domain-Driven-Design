package br.com.fiap.tds;

import java.util.Scanner;

public class Leitura {

	public static void main(String args[]) {
		//Criar a variável para ler os dados 
		Scanner leitor = new Scanner(System.in);
		
		//Calcular a area de um circulo
		
		//Ler o raio (inserido pelo usuário)
		System.out.println("Digite o raio do circulo:");
		float raio = leitor.nextFloat(); 
		
		//Calcular a area e exibir o resultado
		//area = 3.14 * raio * raio;
		double area = 3.14 * raio * raio;
		System.out.println("A área do circulo é " + area);
		
		//Fechar o leitor
		leitor.close();
	}
	
}




