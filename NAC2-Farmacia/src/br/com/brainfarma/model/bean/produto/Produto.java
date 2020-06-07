package br.com.brainfarma.model.bean.produto;

public class Produto { // abstract

	private long codigoProduto;
	private String nome;
	private String marca;
	private double valorUnitario;
	private int quantidade;
	private String tipoProduto;
	
	//construtor padrão
	public Produto() {

	}
	//construtor com todos atributos
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

	public double calcularValorTotal(double valorUnitario, int quantidade) {

		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		return valorUnitario * quantidade;

	}

	public void calcularDesconto(double valorTotal) {

		if (valorTotal >= 250) {
			System.out.println("Desconto de 10%");
			double desconto = (valorTotal * 10) / 100;
			System.out.println("Desconto: " + desconto);
			valorTotal -= desconto;
			System.out.println("Valor Total(R$): " + valorTotal);

		} else if (quantidade >= 5) {
			System.out.println("Desconto de 25%");
			double desconto = (valorTotal * 25) / 100;
			System.out.println("Desconto: " + desconto);
			valorTotal -= desconto;
			System.out.println("Valor Total(R$): " + valorTotal);
		}

		System.out.println("Valor Total (R$): " + valorTotal);
	}

	public void calcularJuros(double valorTotal, int quantidadeParcelas) {

		double juros;
		double valorParcelas;
		double valorJuros;
		if (quantidadeParcelas > 3) {
			if (valorTotal <= 100) {
				// calcular 5% de juros
				juros = (valorTotal * 1.05);
				valorJuros = juros - valorTotal;
				valorTotal += valorJuros;
				valorParcelas = valorTotal / quantidadeParcelas;
				System.out.println("\n========== NFE ============\n");
				System.out.println("Juros 5% | (R$)" + valorJuros);
				System.out.println("Valor das Parcelas (R$): " + valorParcelas);
				System.out.println("Valor Total (R$): " + valorTotal);

			} else if (valorTotal < 250) {
				// calcular 7% de juros
				juros = (valorTotal * 1.15);
				valorJuros = juros - valorTotal;
				valorTotal += valorJuros;
				valorParcelas = valorTotal / quantidadeParcelas;
				System.out.println("\n========== NFE ============\n");
				System.out.println("Juros 7% | (R$)" + valorJuros);
				System.out.println("Valor das Parcelas (R$): " + valorParcelas);
				System.out.println("Valor Total (R$): " + valorTotal);

			} else if (valorTotal >= 250) {
				// calcular 10% de juros
				juros = (valorTotal * 1.10);
				valorJuros = juros - valorTotal;
				valorTotal += valorJuros;
				valorParcelas = valorTotal / quantidadeParcelas;

				System.out.println("\n========== NFE ============\n");
				/* System.out.printf("Juros 10% | (R$) %.2f %n", juros); */
				System.out.println("Juros 10% | (R$)" + valorJuros);
				System.out.println("Valor das Parcelas (R$): " + valorParcelas);
				System.out.println("Valor Total (R$): " + valorTotal);

			}
		}
	}

	public void cupomFiscalCartao(int quantidadeParcelas, double valorTotal) {

		double valorPagoPorParcela = valorTotal / quantidadeParcelas;
		System.out.println("Quantidade de Parcelas: " + quantidadeParcelas + "x");
		System.out.printf("Valor das Parcelas(R$): %.2f %n", valorPagoPorParcela);
		System.out.println("Valor Total: " + valorTotal);
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
