package br.com.fiap.tds.main;

import br.com.fiap.tds.beans.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();

		pessoa.inicializarValores("Cleiton", 19, 1.80f);
		pessoa.exibirValores();

	}

}
