package br.com.fiap.tds.view;

public class ModificacaoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar uma String
		String conteudo = "M�todos da String";

		// Exibir seu conte�do em mai�sculas
		System.out.println(conteudo.toUpperCase());

		// Exibir o seu conte�do em min�sculas
		System.out.println(conteudo.toLowerCase());

		System.out.println("");
		// replace("caracter que ser� alterado", "novo caracter") - SUBSTITUIR PALAVRAS
		System.out.println(conteudo.replace("r", "l"));

	}

}
