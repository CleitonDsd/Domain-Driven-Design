package br.com.fiap.tds.beans;

public class Pessoa {

	public String nome;
	public int idade;
	public float altura;

	public void inicializarValores(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public void exibirValores() {

		String detalhes = nome + " | " + idade + " | " + altura;
		System.out.println(detalhes);
	}

}
