package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ComparacaoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String primeiraPalavra = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
		String segundaPalavra = JOptionPane.showInputDialog(null, "Digite outra palavra: ");

		if (primeiraPalavra.equalsIgnoreCase(segundaPalavra)) {
			JOptionPane.showMessageDialog(null, "As palavras s�o id�nticas");
		} else {
			JOptionPane.showMessageDialog(null, "As palavras s�o diferentes");
		}

		// starsWith() endsWith() verificar se a primeira palavra come� com "A" ou
		// termina com "Silva"
		if (primeiraPalavra.startsWith("A") || (primeiraPalavra.endsWith("Silva"))) {
			JOptionPane.showMessageDialog(null, "A palavra come�a com \"A\" ou termina com \"Silva\" ");
		}

		// length() Exibir a quantidade de caracteres do nome1
		JOptionPane.showMessageDialog(null, "A quantidade de caracteres �: " + primeiraPalavra.length());

		// exibir a primeira a palavar na vertical
		String nomeVertical = "";
		for (int i = 0; i < primeiraPalavra.length(); i++) {
			System.out.println(primeiraPalavra.charAt(i));
			nomeVertical += primeiraPalavra.charAt(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, nomeVertical);

		// IndexOf() - Indica a primeira posi��o de um Caracter na String
		// verifica se existe o caracter "a" na primeira palavra
		// Se retornar -1 significa que n�o exite o caracter na String

		if (primeiraPalavra.indexOf("a") != -1) {
			JOptionPane.showMessageDialog(null,
					"A primeira posi��o do caractere na String �: " + primeiraPalavra.indexOf("a"));
		} else {
			JOptionPane.showMessageDialog(null, "N�o o caractere \'a\' na String");
		}

		// lastIndexOf() - Indica a �ltima posi��o de um Caracter na String
		JOptionPane.showMessageDialog(null,
				"A �tlima ocorr�ncia de \'a\' na String � " + primeiraPalavra.lastIndexOf("a"));

		// Exibir os tres primeiros caracteres da primeira palavra
		JOptionPane.showMessageDialog(null, primeiraPalavra.substring(0, 3));

		// Exibir o sobrenome da primeira palavra, se existir
		if (primeiraPalavra.indexOf(" ") != 0) {

			int posicao = primeiraPalavra.lastIndexOf(" ");
			String sobrenome = primeiraPalavra.substring(posicao + 1);
			JOptionPane.showMessageDialog(null, "Sobrenome: " + sobrenome);

		}

	}

}
