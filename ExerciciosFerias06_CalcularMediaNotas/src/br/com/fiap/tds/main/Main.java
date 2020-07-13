package br.com.fiap.tds.main;

import java.util.Scanner;

import br.com.fiap.tds.bean.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Digite o nome do Aluno: ");
		String nome = scan.nextLine() + scan.next();

		System.out.println("N1: ");
		double nota1 = scan.nextDouble();
		System.out.println("N2: ");
		double nota2 = scan.nextDouble();
		System.out.println("N3: ");
		double nota3 = scan.nextDouble();
		/*
		 * Aluno aluno = new Aluno(nota1, nota2, nota3, nome);
		 */
	}

}
