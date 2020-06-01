package br.com.bw2marketplace.model.bean.usuarios;

import br.com.bw2marketplace.model.bean.escolaridade.Escola;
import br.com.bw2marketplace.model.bean.escolaridade.Faculdade;

public class Gestor extends Usuario {

	private long idGestor;
	Escola escola;
	Faculdade faculdade;
	private String area;
	private String cargo;
	private String senioridade; // nível

	public Gestor() {

	}

	public Gestor(long idGestor, String area, String cargo, String senioridade) {
		super();
		this.idGestor = idGestor;
		this.area = area;
		this.cargo = cargo;
		this.senioridade = senioridade;
	}

	public long getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(long idGestor) {
		this.idGestor = idGestor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

}
