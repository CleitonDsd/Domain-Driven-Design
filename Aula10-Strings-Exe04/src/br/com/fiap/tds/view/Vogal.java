package br.com.fiap.tds.view;

import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();

		String vogais = "aeiou";
		String trocarVogal = palavra.replace('a', '*');

		for (int i = 0; i < vogais.length(); i++) {

			palavra = palavra.replace(vogais.charAt(i), '*');
		}
		System.out.println(palavra.toUpperCase());

	}

}
