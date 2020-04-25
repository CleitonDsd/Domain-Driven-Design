package br.com.fiap.tds.view;

public class ExemploConversaoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte idade = 19;

		String idadeString = String.valueOf(idade);

		float valor = 10;
		String valorString = String.valueOf(valor);
		
		System.out.println(idade + valor);
		System.out.println(idadeString + valorString);
	}

}
