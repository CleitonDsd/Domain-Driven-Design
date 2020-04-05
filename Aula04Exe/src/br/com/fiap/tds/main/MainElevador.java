package br.com.fiap.tds.main;

import br.com.fiap.tds.beans.Elevador;

public class MainElevador {

	public static void main(String[] args) {

		Elevador elevador = new Elevador();
		
		elevador.inicializa(10, 17);
		
		elevador.entra(4);
		elevador.sobe(2);
		elevador.sai(1);
		elevador.entra(7);
		elevador.sobe(16);
		elevador.desce(18);
		
	}
}
