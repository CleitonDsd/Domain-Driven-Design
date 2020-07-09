package br.com.fiap.tds.main;

import java.util.Scanner;

import br.com.fiap.tds.bean.CalculadoraFinanceira;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CalculadoraFinanceira calc = new CalculadoraFinanceira();

		System.out.println("Digite o capital: ");
		double capital = scan.nextDouble();
		System.out.println("Digite a taxa de juros: ");
		double taxaJuros = scan.nextDouble();
		System.out.println("Digite o periodo: ");
		double periodo = scan.nextDouble();

		System.out.println(calc.calcularJurosCompostos(capital, taxaJuros, periodo));
		System.out.println(calc.calcularJurosSimples(capital, taxaJuros, periodo));

	}
}
