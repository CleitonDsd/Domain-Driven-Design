package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Funcionario;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Ler o nome, data de nascimento e salário
		System.out.println("Digite o nome");
		String nome = leitor.next() + leitor.nextLine();

		System.out.println("Digite a data de nascimento");
		String data = leitor.next();

		System.out.println("Digite o salário");
		double salario = leitor.nextDouble();

		// Instanciar um funcionário com o nome, data nascimento e salário
		Funcionario func = new Funcionario(nome, data, salario);

		// Aumentar o salário em valor absoluto
		System.out.println("Valor do aumento:");
		double valor = leitor.nextDouble();
		func.aumentarSalario(valor);

		// Exibir o salário
		System.out.println("Novo salário: " + func.getSalario());

		// Aumentar o valor em %
		System.out.println("Valor do aumento em %");
		int porcentagem = leitor.nextInt();
		func.aumentarSalario(porcentagem);

		// Exibir o salário
		System.out.println("Novo salário: " + func.getSalario());

		// Aumentar o salário em comissão
		System.out.println("Quantidade de comissões:");
		int qtd = leitor.nextInt();
		System.out.println("Valor da comissão:");
		double comissao = leitor.nextDouble();
		func.aumentarSalario(qtd, comissao);

		// Exibir o salário
		System.out.println("Novo salário: " + func.getSalario());

		// Exibir os dados do funcionário //método toString()
		System.out.println(func);

		leitor.close();
	}

}