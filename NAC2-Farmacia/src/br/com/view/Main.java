package br.com.view;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import br.com.brainfarma.model.bean.produto.Produto;
import br.com.brainfarma.model.bean.usuario.Funcionario;

public class Main {
	final static String LOGIN = "admin.brainfarma";
	final static String PASS = "FIAP1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();

		Scanner scan = new Scanner(System.in);

		System.out.println("=== LOGIN === ");
		System.out.println("Login: ");
		String login = scan.next();
		System.out.println("Senha: ");
		String senha = scan.next();

		if (!login.equals(LOGIN) && (!senha.equals(PASS))) {
			System.err.println("Usuário ou Senha incorretos. ");
		} else {

			System.out.println(
					"========== ==========" + "\n!!! Acessar o Sistema !!!" + "\n 1 - Clientes" + "\n 2 - Vendas"
							+ "\n 3 - Produtos" + "\n 4 - Colaboradores" + "\n 0 - Sair" + "\n========== ==========");
			byte opcao = scan.nextByte();

			switch (opcao) {
			case 1:

				break;
			case 2:

				break;
			case 3:
				Produto produto = new Produto();

				System.out.println(" ============= ");
				System.out.println("PRODUTO");
				System.out.println("");

				System.out.println("Cód. Produto: ");
				long codigoProduto = scan.nextLong();
				produto.setCodigoProduto(codigoProduto);

				System.out.println("Nome: ");
				String nome = scan.next();
				produto.setNome(nome);

				System.out.println("Marca: ");
				String marca = scan.next();
				produto.setMarca(marca);

				System.out.println("Valor Unitário: ");
				double valorUnitario = scan.nextLong();
				produto.setValorUnitario(valorUnitario);

				System.out.println("Quantidade: ");
				int quantidade = scan.nextInt();
				produto.setQuantidade(quantidade);

				System.out.println("Tipo do Produto: ");
				String tipoProduto = scan.next() + scan.next();
				produto.setTipoProduto(tipoProduto);

				System.out.println(produto.toString());
				break;
			case 4:

				break;
			case 0:
				System.out.println("Saindo ... ");
				scan.close();
				break;

			default:
				System.err.println("Opção Incorreta! Operação Cancelada. ");
			}
		}

	}

}
