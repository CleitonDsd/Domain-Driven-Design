package br.com.fiap.tds.bean;

public class Gerente extends Funcionario {

	// Construtores
	public Gerente() {
	}

	public Gerente(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento, salario);
	}

	// Sobrecrita de método
	// O método executado será o do objeto (instância)
	@Override // anotação que informa que o método é uma sobrescrita
	public void aumentarSalario(double valor) {
		if (salario > 10000) {
			salario += valor / 2;
		} else {
			salario += valor;
			// super.aumentarSalario(valor); invoca o método do pai
		}
	}

}