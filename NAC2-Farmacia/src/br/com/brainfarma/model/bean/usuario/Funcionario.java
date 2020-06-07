package br.com.brainfarma.model.bean.usuario;

public class Funcionario extends Associado {

	private int numeroMatricula;
	private int numeroPis;
	private String cargo;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(int numeroMatricula, int numeroPis, String cargo, double salario) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.numeroPis = numeroPis;
		this.cargo = cargo;
		this.salario = salario;
	}

	// Imprimir usuários
	@Override
	public String imprimirDados() {
		return "Numero Matrícula: " + numeroMatricula + "\nPIS: " + numeroPis + "\nCargo: " + cargo;
	}

	// desconto total
	public double calcularSalario(double salario, double desconto, int numeroMatricula) {
		this.salario = salario;
		this.numeroMatricula = numeroMatricula;
		double valorTotal = salario - desconto;
		if (valorTotal < 0) {
			System.out.println("Valor do desconto(R$): " + desconto);
			System.err.println("Saldo negativo (R$): ");
			return valorTotal;

		}
		System.out.println("Valor do desconto(R$): " + desconto);
		System.out.println("Valor Total(R$): " + valorTotal);
		return valorTotal;

	}

	// hora extra
	public double calcularSalario(double salario, double valorExtra, double totalHoraExtra, int numeroMatricula) {
		this.salario = salario;
		this.numeroMatricula = numeroMatricula;
		double valorTotalHora = valorExtra * totalHoraExtra;
		double valorTotal = valorTotalHora + salario;

		System.out.println("Matrícula Funcionário: " + numeroMatricula);
		System.out.println("Valor Extra(R$): " + valorExtra);
		System.out.println("Total Horas: " + totalHoraExtra);
		System.out.println("Valor Total(R$): " + valorTotal);
		return valorTotal;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public int getNumeroPis() {
		return numeroPis;
	}

	public void setNumeroPis(int numeroPis) {
		this.numeroPis = numeroPis;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
