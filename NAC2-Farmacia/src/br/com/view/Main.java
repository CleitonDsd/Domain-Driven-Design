package br.com.view;

import java.util.Scanner;
import br.com.brainfarma.model.bean.produto.Produto;
import br.com.brainfarma.model.bean.usuario.Cliente;
import br.com.brainfarma.model.bean.usuario.Telefone;

public class Main {

	final static String LOGIN = "brainfarma";
	final static String PASS = "FIAP1234";

	public static void delimitador() {
		System.out.println("====================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);

		System.out.println("=== LOGIN === ");
		System.out.println("Login: ");
		String login = scan.next();
		System.out.println("Senha: ");
		String senha = scan.next();

		if (!login.equals(LOGIN) || (!senha.equals(PASS))) {
			System.err.println("Usuário ou Senha incorretos. ");
		} else {

			System.out.println("========== ==========" + "\n!!! BRAINFARMA !!!\n" + "\n 1 - Iniciar Venda"
					+ "\n 0 - Sair" + "\n========== ==========");
			byte opcao = scan.nextByte();
			switch (opcao) {

			case 1:
				int opcaoCadastrarCliente;

				do {
					System.out.println("Cliente deseja se cadastrar para receber ofertas? (Sim/Não)");
					String desejaCadastrarCliente = scan.next();
					// Informações sobre o cadastro de Clientes
					if (desejaCadastrarCliente.equalsIgnoreCase("sim")) {

						delimitador();
						System.out.println("CLIENTE");
						System.out.println("Nome: ");
						cliente.setNome(scan.next() + scan.nextLine());
						System.out.println("E-mail: ");
						cliente.setEmail(scan.next());
						System.out.println("CPF: ");
						cliente.setCPF(scan.next());
						System.out.println("Deseja receber ofertas por e-mail ou SMS: (sim/não)");
						String desejaReceberOfertas = scan.next();

						if (desejaReceberOfertas.equalsIgnoreCase("sim")) {
							cliente.setDesejaReceberOfertas(true);
						}

						// dados de contato, possível cadastrar um telefone celular.
						System.out.println("--- Telefone Principal ---: ");
						Telefone telefone1 = new Telefone();

						System.out.println("Tipo: ");
						String tipo1 = scan.next();
						System.out.println("DDD");
						String ddd1 = scan.next();
						System.out.println("Número");
						String numero1 = scan.next();
						telefone1.cadastrarTelefone(tipo1, ddd1, numero1);

						delimitador();
						Telefone[] telefones = new Telefone[1];
						telefones[0] = telefone1;

						System.out.println(cliente.toString());
						cliente.setTelefones(telefones);
						for (Telefone t : cliente.getTelefones()) {
							System.out.println(t.getDdd() + " " + t.getNumero());
						}
						delimitador();
					}
					System.out.println("Deseja Cadastrar mais algum cliente?(Sim - tecle 1 | Não - tecle 2)");
					opcaoCadastrarCliente = scan.nextByte();
					if (opcaoCadastrarCliente == 2) {
						System.out.println("======= Dados salvos com êxito ======");
					}
				} while (opcaoCadastrarCliente != 2);

				int operacao;
				double valorTotal;
				double armazenarPrecoTotal = 0;
				do {
					delimitador();

					// Informações sobre a venda, produtos
					delimitador();
					System.out.println("PRODUTO");
					delimitador();
					System.out.println("");

					System.out.println("Cód. Produto: ");
					long codigoProduto = scan.nextLong();

					System.out.println("Nome: ");
					String nomeProduto = scan.next();

					System.out.println("Marca: ");
					String marca = scan.next();

					System.out.println("Valor Unitário: ");
					double valorUnitario = scan.nextDouble();

					System.out.println("Quantidade: ");
					int quantidade = scan.nextInt();

					System.out.println("Tipo do Produto: ");
					String tipoProduto = scan.next();

					System.out.println("1- Continuar compra... \n2- Finalizar Operação: 0");
					operacao = scan.nextInt();

					delimitador();
					Produto produto = new Produto(codigoProduto, nomeProduto, marca, valorUnitario, quantidade,
							tipoProduto);
					valorTotal = produto.calcularValorTotal(valorUnitario, quantidade);
					armazenarPrecoTotal += valorTotal;

				} while (operacao != 0);
				System.out.println("FORMA DE PAGAMENTO: ");
				System.out.println("1 - Dinheiro" + "\n2 - Cartão Crédito" + "\n3 - Cartão Débito");

				int formaPagamento = scan.nextInt();
				Produto produto = new Produto();
				if (formaPagamento == 1 || formaPagamento == 3) {
					System.out.println("Sub-Total Total(R$): " + armazenarPrecoTotal);
					produto.calcularDesconto(armazenarPrecoTotal);

					// para cartão de crédito não há opção de desconto
				} else if (formaPagamento == 2) {
					delimitador();
					System.out.println("Sub-Total Total(R$): " + armazenarPrecoTotal);
					System.out.println("Quantidade de Parcelas (1-12x): ");
					short quantidadeParcelas = scan.nextShort();

					if (quantidadeParcelas <= 3) {
						produto.cupomFiscalCartao(quantidadeParcelas, armazenarPrecoTotal);
					} else {
						delimitador();
						System.out.println("Sub-Total Total(R$): " + armazenarPrecoTotal);
						produto.calcularJuros(armazenarPrecoTotal, quantidadeParcelas);
					}
				}
				break;
			case 0:
				delimitador();
				System.out.println("Salvando dados...");
				System.out.println("Saindo!");
				System.err.println("\nOperação Finalizada.");
				break;
			default:
				delimitador();
				System.err.println("Opção inválida, operação cancelada.");
				delimitador();
			}
		}
		delimitador();
		scan.close();
	}

}
