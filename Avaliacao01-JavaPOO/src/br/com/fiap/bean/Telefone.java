package br.com.fiap.bean;

/**
 * @author Cleiton Da Silva Dias | RM 86257 | 1TDSS'
 */
import java.util.Scanner;

public class Telefone {

	private String tipo;
	private String ddd;
	private String numero;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void cadastrarTelefone() {
		Scanner scan = new Scanner(System.in);

		System.out.println("= = = Telefone = = = ");
		System.out.println("");

		System.out.println("Tipo: ");
		this.tipo = scan.nextLine();

		System.out.println("DDD: ");
		this.ddd = scan.nextLine();

		System.out.println("Número: ");
		this.numero = scan.nextLine();

	}

}
