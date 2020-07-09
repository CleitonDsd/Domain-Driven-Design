package br.com.fiap.tds.salario.bean;

public class Salario {

	private double valorBruto;

	public Salario() {

	}

	public double atribuirValorBruto(double valor) {
		this.valorBruto = valor;
		return valor;
	}

	public void obterValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double calcularINSS() {

		double descontoINSS = (this.valorBruto * 20) / 100;
		return descontoINSS;
	}

	public double obterValorLiquido() {

		double descontoINSS = (this.valorBruto * 20) / 100;
		double salarioLiquido = this.valorBruto - descontoINSS;
		return salarioLiquido;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

}
