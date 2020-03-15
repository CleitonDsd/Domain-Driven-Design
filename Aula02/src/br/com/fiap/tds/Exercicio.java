package br.com.fiap.tds;

import java.util.Scanner;

public class Exercicio {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		//Ler a média final do aluno
		System.out.println("Digite a média final:");
		float media = leitor.nextFloat();
		
		//Calcular a nota que é preciso para passar no exame
		float exame = 12 - media;
		//Exibe a nota necessária
		System.out.println("Nota necessária: " + exame);
		
		//Fecha o leitor
		leitor.close();
	}
	
}