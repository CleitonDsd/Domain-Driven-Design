package br.com.brainfarma.model.bean.usuario;

public class Associado {

	private long id;
	protected String nome;
	protected String email;
	protected String CPF;
	private Telefone[] telefones;

	public Associado() {

	}

	public Associado(long id, String nome, String email, String CPF, Telefone[] telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
		this.telefones = telefones;
	}

	// Imprimir usuários
	@Override
	public String toString() {
		return "= = = = = = = = = = = = \n" + super.toString() + "\nNome: " + nome + "\nMarca: " + email
				+ "\nPreço(R$): " + CPF + "\nTipo do Produto: " + telefones + "\n= = = = = = = = = = =  = ";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
