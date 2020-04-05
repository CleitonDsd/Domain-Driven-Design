package br.com.fiap.tds.bean;

public class Cor {

	//Atributos
	private String nome;
	
	private int r;
	
	private int g;
	
	private int b;
	
	//Construtor -> método especial utilizado na instanciação da classe
	//não possui retorno, nem mesmo void
	//possui o mesmo nome da Classe
	//Construtor padrão é fornecido pelo Java quando não declaramos nenhum construtor
	//Construtor padrão é o construtor sem argumentos/parametros
	public Cor(){
		
	}
	
	public Cor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Cor(String nome) {
		this.nome = nome;
	}
	
	public Cor(String nome, int r, int g, int b) {
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	//Gets e Sets
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		//this -> referenciar a classe
		this.nome = nome;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public void setG(int g) {
		this.g = g;
	}
	
	public int getG() {
		return g;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
}