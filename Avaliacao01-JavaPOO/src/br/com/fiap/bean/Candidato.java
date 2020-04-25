package br.com.fiap.bean;

/**
 * @author Cleiton Da Silva Dias | RM 86257 | 1TDSS'
 */
import java.util.Scanner;

public class Candidato {

	String nome;
	String email;
	Endereco endereco;
	Telefone[] telefones;

	public Candidato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public void cadastrarDadosPessoais() {
		Scanner scan = new Scanner(System.in);
		System.out.println("= = = Cadastrar Dados = = = ");
		System.out.println("");
		System.out.println("Nome: ");
		this.nome = scan.nextLine();

		System.out.println("Email: ");
		this.email = scan.nextLine();
		System.out.println("");
		
	}

	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
	}

}
