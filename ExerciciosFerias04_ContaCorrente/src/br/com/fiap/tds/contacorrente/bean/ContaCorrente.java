package br.com.fiap.tds.contacorrente.bean;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente() {

	}

	public void atribuirSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacar(double valorSaque) {
		return this.saldo -= valorSaque;
	}

	public double depositar(double valorDeposito) {
		return this.saldo += valorDeposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
