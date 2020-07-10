package br.com.fiap.tds.bean;

public class CalculadoraFinanceira {

	public CalculadoraFinanceira() {

	}

	public double calcularJurosSimples(double capital, double taxaJuros, double periodo) {
		double montante = capital * (1 + taxaJuros * periodo);
		return montante;
	}

	public double calcularJurosCompostos(double capital, double taxaJuros, double periodo) {

		double montante = capital * (1 + taxaJuros);
		double resultado = Math.pow(montante, periodo);
		return resultado;

	}
}
