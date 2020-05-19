package br.com.fiap.tds.ltp.pacotes.ex2.produtos;

public class Produto {

	//Atributos
	private int codigo;
	
	private double preco;
	
	//Construtores
	public Produto(int codigo, double preco) {
		super();
		this.codigo = codigo;
		this.preco = preco;
	}	    
	public Produto() {
		super();
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
