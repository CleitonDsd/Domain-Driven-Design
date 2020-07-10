package br.com.fiap.tds.contacorrente.main;

import java.util.Scanner;

import br.com.fiap.tds.contacorrente.bean.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		byte opcao;
		do {
			System.out.println("======== BANK ==========");
			System.out
					.println("Selecione uma opção:" + "\n1- Sacar" + "\n2- Depositar" + "\n3- Ver Saldo" + "\n4- Sair");
			opcao = scan.nextByte();
			switch (opcao) {
			case 1:
				System.out.println("Valor do Saque (R$): ");
				double valorSaque = scan.nextDouble();
				System.out.println(conta.sacar(valorSaque));
				break;
			case 2:
				System.out.println("Valor do Deposito: (R$): ");
				double valorDeposito = scan.nextDouble();
				System.out.println(conta.depositar(valorDeposito));
				System.out.println("Saldo Atual: " + conta.getSaldo());
				break;
			case 3:
				System.out.println("Saldo Atual: " + conta.getSaldo());
				break;

			default:
				System.err.println("Saindo...");
			}
		} while (opcao != 4);
	}

}
