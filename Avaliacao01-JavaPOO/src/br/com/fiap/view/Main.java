package br.com.fiap.view;

/**
 * @author Cleiton Da Silva Dias | RM 86257 | 1TDSS'
 */
import br.com.fiap.bean.Candidato;
import br.com.fiap.bean.Endereco;
import br.com.fiap.bean.Telefone;

public class Main {

	public static void main(String[] args) {

		Candidato candidato = new Candidato();
		candidato.cadastrarDadosPessoais();

		Endereco endereco = new Endereco();
		endereco.cadastrarEndereco();
		candidato.setEndereco(endereco);

		System.out.println("-- Telefone 1 --");
		Telefone telefone1 = new Telefone();
		telefone1.cadastrarTelefone();

		System.out.println("-- Telefone 2 --");
		Telefone telefone2 = new Telefone();
		telefone2.cadastrarTelefone();

		Telefone[] telefones = new Telefone[2];

		telefones[0] = telefone1;
		telefones[1] = telefone2;

		candidato.setTelefones(telefones);

		System.out.println("");
		System.out.println("==== DADOS CADASTRADOS === ");
		System.out.println("");
		candidato.exibirDados();
		System.out.println("");
		endereco.exibirEndereco();

		if (candidato != null && candidato.getTelefones() != null) {
			System.out.println(" ");
			System.out.println("= = = Telefones = = =");
			for (Telefone t : candidato.getTelefones()) {

				System.out.println(t.getDdd() + " " + t.getNumero());
			}

		}
	}

}
