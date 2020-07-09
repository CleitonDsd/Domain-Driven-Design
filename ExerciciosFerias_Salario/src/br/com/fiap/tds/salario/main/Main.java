package br.com.fiap.tds.salario.main;

import java.util.Scanner;

import br.com.fiap.tds.salario.bean.Salario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu salário líquido (R$): ");
		double salarioBruto = scan.nextDouble();

		Salario salario = new Salario();

		System.out.println("Salário Bruto (R$): " + salario.atribuirValorBruto(salarioBruto));
		System.out.println("Valor do INSS (R$): " + salario.calcularINSS());
		System.out.println("Valor Líquido (R$): " + salario.obterValorLiquido());

	}

}
