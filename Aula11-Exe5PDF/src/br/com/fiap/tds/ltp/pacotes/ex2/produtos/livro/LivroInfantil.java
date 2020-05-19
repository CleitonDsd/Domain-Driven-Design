package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

public class LivroInfantil extends Livro {

	private String ilustrador;

	// Construtores
	public LivroInfantil() {
		super();
	}

	public LivroInfantil(String ilustrador) {
		super();
		this.ilustrador = ilustrador;
	}

	// Getters and Setters
	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

}
