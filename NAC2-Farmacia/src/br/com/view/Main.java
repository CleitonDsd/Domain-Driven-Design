package br.com.view;

import java.util.Scanner;

import br.com.brainfarma.model.bean.produto.Produto;
import br.com.brainfarma.model.bean.usuario.Cliente;
import br.com.brainfarma.model.bean.usuario.Funcionario;
import br.com.brainfarma.model.bean.usuario.Telefone;

/**
 * Sistema de Gerenciamento de Farmácia
 *
 * @author 84601 - Alison Guimarães Oliveira da Silva 86257 - Cleiton da Silva
 *         Dias 85163 - Henrique Barboza de Moura 85382 - Lucas Fernando
 *         Yoshioka 82665 - Matheus Saraiva Turmina 84638 - Sabrina Camargo
 *         Ramos
 * 
 *         BrainTech Development - Invista no novo.
 * 
 * 
 * @version 1.0
 * @since 2020-06-07
 */

public class Main {

	final static String LOGIN = "brainfarma";
	final static String PASS = "FIAP1234";

	public static void delimitador() {
		System.out.println("====================================");
	}

	public static void salvandoDados() {
		System.out.println("====================================");
		System.out.println("Salvando dados...");
		System.out.println("Saindo!");
		System.err.println("\nOperação Finalizada.");
		System.out.println("====================================");
	}

	public static void aguarde() {
		System.out.println("\n \n \n ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Aguarde");
			System.out.println("\n...");
			System.out.println("Estabelecendo conexão");
			System.out.println("\n...");
			System.out.println("Aguarde");
			System.out.println("\n...");
			System.out.println("Carregando");
			System.out.println("\n...");
			System.out.println("Aguarde");
			System.out.println("\n...");
			System.out.println("Executando arquivos");
			System.out.println("...");
			System.out.println("\n \n \n ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);
		aguarde();
		System.out.println("=== LOGIN === ");
		System.out.println("Login: ");
		String login = scan.next();
		System.out.println("Senha: ");
		String senha = scan.next();

		while (!login.equals(LOGIN) || (!senha.equals(PASS))) {
			System.err.println("Usuário ou Senha incorretos. \n \nDigite novamente a senha. \n");
			System.out.println("=== LOGIN === ");
			System.out.println("Login: ");
			login = scan.next();
			System.out.println("Senha: ");
			senha = scan.next();
			aguarde();
		}

		delimitador();
		aguarde();
		delimitador();
		System.out.println("\n!!! BRAINFARMA !!!\n" + "\n 1 - Iniciar Venda" + "\n 2 - Colaboradores" + "\n 0 - Sair");
		delimitador();
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
					salvandoDados();
				}
				System.out.println("Deseja Cadastrar mais algum cliente?(Sim - tecle [ 1 ] | Não - tecle [ 2 ])");
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
				String nomeProduto = scan.next() + scan.nextLine();

				System.out.println("Marca: ");
				String marca = scan.next();

				System.out.println("Valor Unitário: ");
				double valorUnitario = scan.nextDouble();

				System.out.println("Quantidade: ");
				int quantidade = scan.nextInt();

				System.out.println("Tipo do Produto: ");
				String tipoProduto = scan.next() + scan.nextLine();

				System.out.println("[ 1 ]- Continuar compra... \n[ 0 ]- Finalizar Operação.");
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
			salvandoDados();
			break;

		case 2:

			// Menu colaboradores
			Funcionario colaborador = new Funcionario();

			byte irParaMenu;
			do {

				delimitador();
				System.out.println("COLABORADORES");
				delimitador();
				System.out.println("\n2 - Descontar benefícios" + "\n3 - Acrescentar hora extra" + "\n0 - Sair");
				opcao = scan.nextByte();
				switch (opcao) {
				case 1:
					salvandoDados();
					break;
				case 2:
					System.out.println("Digite o número da matrícula: ");
					int numeroMatricula = scan.nextInt();
					System.out.println("Digite o salário do Colaborador: ");
					double salario = scan.nextDouble();
					System.out.println("Digite o total dos descontos do colaborador: ");
					double desconto = scan.nextDouble();
					colaborador.calcularSalario(salario, desconto, numeroMatricula);
					salvandoDados();

					break;
				case 3:
					System.out.println("Digite o número da matrícula: ");
					numeroMatricula = scan.nextInt();
					System.out.println("Digite o Salário do colaborador: ");
					salario = scan.nextDouble();
					System.out.println("Digite o valor da hora extra: ");
					double valorExtra = scan.nextDouble();
					System.out.println("Digite o total de horas extras: ");
					double totalHoraExtra = scan.nextDouble();

					colaborador.calcularSalario(salario, valorExtra, totalHoraExtra, numeroMatricula);
					salvandoDados();
					break;
				default:
					System.err.println("Operação inválida. Programa encerrado! \nContate o seu seu administrador ");
				}
				System.out.println(
						"Deseja realizar mais alguma alteração nos colaboradores: " + "\n1 - Sim" + "\n0 - Sair");
				irParaMenu = scan.nextByte();
				aguarde();
			} while (irParaMenu != 0);

			break;

		default:
			System.err.println("Operação inválida. Programa encerrado! \nContate o seu seu administrador ");
			aguarde();
			salvandoDados();
			System.err.println("Operação inválida. Programa encerrado! \nContate o seu seu administrador ");
		}

		delimitador();
		scan.close();

	}

}