package br.com.brainfarma.model.bean.usuario;

public class Funcionario extends Associado {

	private String turno;
	private Double salario;
	private String funcao;
	private String anoNascimento;


	public Funcionario() {

	}
	

	public Funcionario(long id, String nome, String email, String CPF, Telefone[] telefones) {
		super(id, nome, email, CPF, telefones);
		// TODO Auto-generated constructor stub
	}


	public Funcionario(String turno, Double salario, String funcao, String anoNascimento) {
		super();
		this.turno = turno;
		this.salario = salario;
		this.funcao = funcao;
		this.anoNascimento = anoNascimento;
	}
	

	@Override
	public String toString() {
		return "= = = = = = = = = = = = \n" + super.toString() + "\nTurno: " + turno + "\nSalário(R$): " + salario
				+ "\nFunção: " + funcao + "\nAno Nascimento: " + anoNascimento + "\n= = = = = = = = = = =  = ";
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
