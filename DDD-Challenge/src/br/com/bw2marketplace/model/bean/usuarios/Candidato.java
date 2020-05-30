package br.com.bw2marketplace.model.bean.usuarios;

import br.com.bw2marketplace.model.bean.escolaridade.Escola;
import br.com.bw2marketplace.model.bean.escolaridade.Faculdade;

public class Candidato {

	private long idCandidato;
	Escola escola;
	Faculdade faculdade;
	private String descricaoObjetivoProfissional;

	public Candidato() {

	}

	public Candidato(long idCandidato, Escola escola, Faculdade faculdade, String descricaoObjetivoProfissional) {
		super();
		this.idCandidato = idCandidato;
		this.escola = escola;
		this.faculdade = faculdade;
		this.descricaoObjetivoProfissional = descricaoObjetivoProfissional;
	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}

	public String getDescricaoObjetivoProfissional() {
		return descricaoObjetivoProfissional;
	}

	public void setDescricaoObjetivoProfissional(String descricaoObjetivoProfissional) {
		this.descricaoObjetivoProfissional = descricaoObjetivoProfissional;
	}

}
