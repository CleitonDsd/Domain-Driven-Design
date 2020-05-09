package br.com.fiap.tds.view;

import java.util.Scanner;

public class RetornarPalavraEmMaiuscula {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma Palavra: ");
		String palavra = scan.next();

		System.out.println("Palavra em maiúscula: " + palavra.toUpperCase());

	}
}
