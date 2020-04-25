package br.com.fiap.tds.profissao.bean;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Profissao prof = new Profissao();

		System.out.println("Nome da profissão: ");
		String nome = scan.next() + scan.nextLine();
		prof.setNome(nome);

		System.out.println("Nome do Funcionário: ");
		String nomeFuncionario = scan.next() + scan.nextLine();

		System.out.println("Matricula: ");
		long matricula = scan.nextLong();

		System.out.println("Digite o salário: ");
		double salario = scan.nextDouble();
		

	}

}
