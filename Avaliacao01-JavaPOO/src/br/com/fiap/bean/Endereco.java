package br.com.fiap.bean;

/**
 * @author Cleiton Da Silva Dias | RM 86257 | 1TDSS'
 */
import java.util.Scanner;

public class Endereco {

	private String cep;
	private String nomeRua;
	private String complemento;
	private String cidade;
	private String estado;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void cadastrarEndereco() {
		Scanner scan = new Scanner(System.in);

		System.out.println("= = = Endereço = = = ");
		System.out.println("");

		System.out.println("CEP: ");
		this.cep = scan.nextLine();

		System.out.println("Nome da Rua: ");
		this.nomeRua = scan.nextLine();

		System.out.println("Complemento: ");
		this.complemento = scan.nextLine();

		System.out.println("Estado: ");
		this.estado = scan.nextLine();

		System.out.println("Cidade: ");
		this.cidade = scan.nextLine();

	}

	public void exibirEndereco() {
		Scanner scan = new Scanner(System.in);

		System.out.println("= = = Endereço = = = ");
		System.out.println("");

		System.out.println("CEP: " + this.cep);

		System.out.println("Nome da Rua: " + this.nomeRua);

		System.out.println("Complemento: " + this.complemento);

		System.out.println("Estado: " + this.estado);

		System.out.println("Cidade: " + this.cidade);

	}

}
