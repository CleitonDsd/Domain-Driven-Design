package br.com.fiap.tds.beans;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidadeTotal;
	private int quantidadePessoas;

	public void inicializa(int capacidadeTotal, int totalAndares) {

		this.capacidadeTotal = capacidadeTotal;
		this.totalAndares = totalAndares;
	}

	public void entra(int pessoasEntrandoElevador) {

		this.quantidadePessoas += pessoasEntrandoElevador;
		System.out.println("Quantas entraram: " + pessoasEntrandoElevador);
		System.out.println("Quantidade de Pessoas: " + this.quantidadePessoas);
		System.out.println("=====");
	}

	public void sai(int pessoasSaindoElevador) {

		this.quantidadePessoas -= pessoasSaindoElevador;
		System.out.println("Quantas sairam: " + pessoasSaindoElevador);
		System.out.println("Quantidade de Pessoas: " + this.quantidadePessoas);
		System.out.println("=====");
	}

	public void sobe(int qtdAndar) {
		int calcularAndar = this.andarAtual + qtdAndar;
		if (calcularAndar > 17) {
			System.out.println("=====");
			System.out.println("Não é possível subir mais de 17 andares!");
		} else {
			this.andarAtual += qtdAndar;
			System.out.println("Andar Atual: " + this.andarAtual);
			System.out.println("=====");
		}
	}

	public void desce(int qtdAndar) {
		int calcularAndar = this.andarAtual - qtdAndar;
		if (calcularAndar < 0) {
			System.out.println("=====");
			System.out.println("Não é possível descer além do terréo!");
		}else {
			this.andarAtual -= qtdAndar;
			System.out.println("Andar Atual: " + this.andarAtual);
			System.out.println("=====");
		}
	}

}
