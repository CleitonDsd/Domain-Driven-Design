package br.com.fiap.ltp.jogo.personagem.humano;

import br.com.fiap.ltp.jogo.personagem.orc.Personagem;

public class Humano extends Personagem {

	// Atributos
	private String classe;

	// Construtores
	public Humano(String classe) {
		super();
		this.classe = classe;
	}
	
	
	//Métodos ~ default
	protected String definirClasse(String classe) {
		this.classe = classe;
		return classe;
	}
	// Getters and Setters

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

}
