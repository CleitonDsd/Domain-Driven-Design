package br.com.b2wmarketplace.view;

import java.util.Scanner;

import br.com.b2wmarketplace.model.bean.endereco.Endereco;
import br.com.b2wmarketplace.model.bean.escolaridade.InformacoesAcademicas;
import br.com.b2wmarketplace.model.bean.usuarios.Candidato;
import br.com.b2wmarketplace.model.bean.usuarios.Gestor;
import br.com.b2wmarketplace.model.bean.vaga.Vaga;

public class Main {

	final static String LOGIN = "recrutador.b2talentw";
	final static String PASS = "FIAP1234";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Bem vindo ao B2TalentW, uma plataforma de recrutamento on-line da empresa B2W Digital, iremos cadastrar o seu perfil de candidato na nossa rede, mas antes precisamos de algumas informações.");
		System.out.println("Certo vamos começar!");
		System.out.println("");

		System.out.println("Digite se você já possui um cadastro (1 - Sim / 2 - Não): ");
		int opcao = scan.nextInt();

		System.out.println("Digite o seu tipo de usuário (Recrutador/ Candidato): ");
		String tipo = scan.next() + scan.nextLine();

		if (opcao == 1 && tipo.equalsIgnoreCase("recrutador")) {
			System.out.println("Caso você não saiba o login solicite ao gestor do RH da B2W");
			System.out.println("");
			System.out.println("Digite o seu login: ");
			String login = scan.next() + scan.nextLine();
			System.out.println("Digite sua senha: ");
			String senha = scan.next() + scan.nextLine();
			if (!login.equals(LOGIN) && !senha.equals(PASS)) {
				System.err.println("Usuário ou Senha incorretos.");
			} else {

				System.out.println("Digite seu ID de Recrutador: ");
				long id = scan.nextLong();
				System.out.println("Deseja cadastrar uma vaga ( 1 - Sim / 2 - Não): ");
				int cadVaga = scan.nextInt();
				if (cadVaga == 1) {
					System.out.println("Digite o nome do Cargo: ");
					String nomeCargo = scan.next() + scan.nextLine();

					System.out.println("Digite o nome da empresa: ");
					String nomeEmpresa = scan.next() + scan.nextLine();

					System.out.println("Digite o nome da área de atuação: ");
					String area = scan.next() + scan.nextLine();

					System.out.println("Digite o nome do gestor: ");
					String nome = scan.next() + scan.nextLine();

					Gestor gestor = new Gestor(area, nome);

					System.out.println("Digite a data de início: ");
					String dataInicio = scan.next() + scan.nextLine();

					System.out.println("Digite os beneficios da vaga: ");
					String beneficios = scan.next() + scan.nextLine();

					System.out.println("Digite a descrição da vaga: ");
					String descricaoVaga = scan.next() + scan.nextLine();

					System.out.println("Digite o salario para a vaga: ");
					double salario = scan.nextDouble();

					System.out.println("--------------------------");
					System.out.println("VAGA CADASTRADA PELO RECRUTADOR " + id);
					System.out.println("--------------------------");

					Vaga vaga = new Vaga(nomeCargo, nomeEmpresa, dataInicio, beneficios, descricaoVaga, salario);

					System.out.println(vaga);
					System.out.println(gestor);

				} else {
					System.out.println("Beleza, até a próxima!");
				}
			}
		} else if (opcao == 2 && tipo.equalsIgnoreCase("candidato")
				|| opcao == 2 && tipo.equalsIgnoreCase("recrutador")) {

			System.out.println("Digite o seu nome completo: ");
			String nome = scan.next() + scan.nextLine();

			System.out.println("Digite a sua data de nascimento: ");
			String data = scan.next() + scan.nextLine();

			System.out.println("Digite o seu CPF: ");
			String numeroCpf = scan.next() + scan.nextLine();

			System.out.println("Digite o seu Rg: ");
			String numeroRg = scan.next() + scan.nextLine();

			System.out.println("Digite o seu gênero (M - Masculino/ F - Feminino): ");
			char sexo = scan.next().charAt(0);

			System.out.println("Digite a sua etnia (será utilizado apenas para pesquisas culturais da empresa): ");
			String etnia = scan.next() + scan.nextLine();

			System.out.println("Digite o seu estado civil: ");
			String estadoCivil = scan.next() + scan.nextLine();

			System.out.println("Digite o seu e-mail: ");
			String email = scan.next() + scan.nextLine();

			System.out.println("Digite seu CEP: ");
			String cep = scan.next() + scan.nextLine();

			System.out.println("Digite seu logradouro: ");
			String logradouro = scan.next() + scan.nextLine();

			System.out.println("Digite o número da sua residência: ");
			int numLogradouro = scan.nextInt();

			System.out.println("Digite o nome do seu bairro: ");
			String bairro = scan.next() + scan.nextLine();

			System.out.println("Digite o nome da sua cidade: ");
			String cidade = scan.next() + scan.nextLine();

			System.out.println("Digite o nome do seu estado: ");
			String estado = scan.next() + scan.nextLine();

			if (tipo.equalsIgnoreCase("candidato")) {
				System.out.println("Digite seu objetivo profissional: ");
				String objetivoProfissional = scan.next() + scan.nextLine();

				System.out.println("Digite o idioma e o nível que você possui: ");
				String idioma = scan.next() + scan.nextLine();

				System.out.println("Digite \"true\" se você está estudando ou \"false\" caso não esteja: ");
				boolean cursando = scan.nextBoolean();

				if (cursando == true) {
					System.out.println("Digite o periodo: ");
					String periodo = scan.next() + scan.nextLine();

					System.out.println("Digite a data de inicio: ");
					String dataInicio = scan.next() + scan.nextLine();

					System.out.println("Digite a data de previsão de término: ");
					String previsaoTermino = scan.next() + scan.nextLine();

					InformacoesAcademicas infoAcad = new InformacoesAcademicas(periodo, cursando, dataInicio,
							previsaoTermino);
					Candidato cand = new Candidato(nome, data, numeroCpf, numeroRg, sexo, etnia, estadoCivil, email,
							objetivoProfissional, idioma, null);
					Endereco end = new Endereco(cep, estado, cidade, logradouro, numLogradouro, bairro);

					System.out.println("--------------------------");
					System.out.println("CANDIDATO CADASTRADO");
					System.out.println("--------------------------");

					System.out.println(cand);
					System.out.println(end);
					System.out.println(infoAcad);
				} else {

					System.out.println("--------------------------");
					System.out.println("CANDIDATO CADASTRADO");
					System.out.println("--------------------------");

					Candidato cand = new Candidato(nome, data, numeroCpf, numeroRg, sexo, etnia, estadoCivil, email,
							objetivoProfissional, idioma, null);
					Endereco end = new Endereco(cep, estado, cidade, logradouro, numLogradouro, bairro);

					System.out.println(cand);
					System.out.println(end);

				}
			} else {

			}

		} else if (opcao == 1 && tipo.equalsIgnoreCase("candidato")) {
			System.out.println("Não possuimos vagas disponíveis no momento!");
		} else {
			System.err.println("Tipo de usuário inválido!");
		}
		scan.close();
	}
}