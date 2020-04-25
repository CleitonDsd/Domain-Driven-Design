package br.com.fiap.tds.profissao.bean;

public class Funcionario {

	private String nome;
	private long matricula;
	private Profissao profissao;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(long matricula) {
		this.matricula = matricula;
	}

	public Funcionario(long matricula, String nome) {
		this(matricula); // chama o construtor da linha 14 que recebe a matricula
		this.nome = nome;
	}

	public Funcionario(long matricula, String nome, Profissao profissao) {
		this(matricula, nome);
		this.profissao = profissao;
	}

	public String toString() {
		return "Nome: " + nome + "\nMatricula: " + matricula + "\nSalário: " + salario + "\nProfissão: "
				+ profissao.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
