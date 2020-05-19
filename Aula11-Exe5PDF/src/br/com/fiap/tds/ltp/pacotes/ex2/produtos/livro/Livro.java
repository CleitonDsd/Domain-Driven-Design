package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Livro extends Produto {

	// Atributos
	private String autor;
	private String livro;
	private String isbn;

	// Construtores
	public Livro() {
		super();
	}

	public Livro(int codigo, double preco, String autor, String livro, String isbn) {
		super(codigo, preco);
		this.autor = autor;
		this.livro = livro;
		this.isbn = isbn;
	}

	// Métodos Gets/Sets
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
