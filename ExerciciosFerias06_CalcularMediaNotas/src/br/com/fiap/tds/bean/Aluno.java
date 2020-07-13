package br.com.fiap.tds.bean;

public class Aluno {

	protected Disciplina nota1;
	protected Disciplina nota2;
	protected Disciplina nota3;
	private String nome;

	public Aluno(Disciplina nota1, Disciplina nota2, Disciplina nota3, String nome) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nome = nome;
	}

	public void atribuirNotas(Disciplina nota1, Disciplina nota2, Disciplina nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double obterMedia(double nota1, double nota2, double nota3) {

		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public Disciplina getNota1() {
		return nota1;
	}

	public void setNota1(Disciplina nota1) {
		this.nota1 = nota1;
	}

	public Disciplina getNota2() {
		return nota2;
	}

	public void setNota2(Disciplina nota2) {
		this.nota2 = nota2;
	}

	public Disciplina getNota3() {
		return nota3;
	}

	public void setNota3(Disciplina nota3) {
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
