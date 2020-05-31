package br.com.brainfarma.model.bean.produto;

public class Produto { // abstract

	private long codigoProduto;
	private String nome;
	private String marca;
	private double valorUnitario;
	private int quantidade;
	private String tipoProduto;

	public Produto() {

	}

	public Produto(long codigoProduto, String nome, String marca, double valorUnitario, int quantidade,
			String tipoProduto) {
		super();
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.marca = marca;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.tipoProduto = tipoProduto;
	}

	// Imprimir produto
	@Override
	public String toString() {
		return "n= = = = = = = = = = = = " + "\nNome: " + nome + "\nMarca: " + marca + "\nTipo do Produto: "
				+ tipoProduto + "\nValor Unitário(R$): " + valorUnitario + "\n= = = = = = = = = = = = ";
	}
	
	
	
	

	public long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
