package br.com.fiap.tds.main;

import java.util.Scanner;

import br.com.fiap.tds.bean.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);

		System.out.println("1° valor: ");
		double numero1 = scan.nextDouble();
		System.out.println("2° valor: ");
		double numero2 = scan.nextDouble();

		double soma = calc.somar(numero1, numero2);
		double sub = calc.subtrair(numero1, numero2);

		System.out.println("Soma é " + soma);
		System.out.println("Subtração é " + sub);
	}

}
