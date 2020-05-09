package br.com.fiap.tds.view;

public class ModificacaoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar uma String
		String conteudo = "Métodos da String";

		// Exibir seu conteúdo em maiúsculas
		System.out.println(conteudo.toUpperCase());

		// Exibir o seu conteúdo em minúsculas
		System.out.println(conteudo.toLowerCase());

		System.out.println("");
		// replace("caracter que será alterado", "novo caracter") - SUBSTITUIR PALAVRAS
		System.out.println(conteudo.replace("r", "l"));

	}

}
