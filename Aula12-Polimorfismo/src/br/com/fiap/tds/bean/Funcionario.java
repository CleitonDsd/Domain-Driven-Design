package br.com.fiap.tds.bean;

//final na classe -> não permite a herança
public class Funcionario extends Pessoa {

	// Constante no Java
	// final -> não pode alterar o valor
	// static -> pertence a classe e não ao objeto
	public static final double AUMENTO_ANUAL = 0.01;

	protected double salario;

	public Funcionario() {
	}

	public Funcionario(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento);
		this.salario = salario;
	}

	// Método toString para exibir os dados do funcionário
	public String toString() {
		return "Nome: " + nome + "\nData Nascimento: " + dataNascimento + "\nSalário: " + salario;
	}

	// Polimorfismo -> vários comportamentos para o mesmo método
	// Sobrecarga de métodos
	// Aumentar o salário com o valor absoluto
	public void aumentarSalario(double valor) {
		salario += valor;
	}

	// Aumentar o salário em % (10, 20)
	public void aumentarSalario(int porcentagem) {
		this.salario += salario * porcentagem / 100;
	}

	// Aumentar o salário em comissão
	public void aumentarSalario(int qtd, double valor) {
		this.salario += qtd * valor;
	}

	// Aumentar o salário padrão
	public void aumentarSalario() {
		this.salario += salario * AUMENTO_ANUAL;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}