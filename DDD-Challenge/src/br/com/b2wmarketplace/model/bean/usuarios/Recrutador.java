package br.com.b2wmarketplace.model.bean.usuarios;

public class Recrutador extends Usuario {

	private long id;

	public String toString() {
		return "Recrutador ID " + id;
	}

	public Recrutador() {

	}

	public Recrutador(String nome, String data, String numeroCpf, String numeroRg, char sexo, String etnia,
			String estadoCivil, String email, long id) {
		super(nome, data, numeroCpf, numeroRg, sexo, etnia, estadoCivil, email);
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setCargo(long id) {
		this.id = id;
	}

}