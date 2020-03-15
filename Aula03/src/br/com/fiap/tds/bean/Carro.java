package br.com.fiap.tds.bean;

public class Carro {

	//Atributos do carro
	public String modelo;
	
	public String marca;
	
	public int ano;
	
	public float motor;
	
	public double preco;
	
	public boolean automatico;
	
	//Métodos do carro
	//retorno (void-> não tem retorno) 
	public void ligar() {
		System.out.println("Carro ligando...");
	}
	
	//método com retorno
	public double calcularIpva() {
		double ipva = 0.04 * preco;
		return ipva;
	}
	
	//método com parâmetros
	public void aumentarValor(double valor) {
		preco += valor; //preco = preco + valor;
	}
	
	//método que retorna e recebe valores (desconto em %)
	public double calcularDesconto(double desconto) {
		//calcula o valor com desconto
		double precoDescontado = preco - preco * desconto/100;
		//retorna o valor calculado
		return precoDescontado;
	}
	
}




