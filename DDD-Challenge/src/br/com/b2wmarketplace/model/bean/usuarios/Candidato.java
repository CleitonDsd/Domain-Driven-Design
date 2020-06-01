package br.com.b2wmarketplace.model.bean.usuarios;

import br.com.b2wmarketplace.model.bean.escolaridade.InformacoesAcademicas;

public class Candidato extends Usuario {

	private String objetivoProfissional;
	private String idiomas;
	private InformacoesAcademicas infoAcademica;

	public String toString() {
		return super.toString() + "\n Objetivo pessoal: " + objetivoProfissional + "\n Idiomas: " + idiomas;
	}

	public Candidato() {

	}

	public Candidato(String nome, String data, String numeroCpf, String numeroRg, char sexo, String etnia,
			String estadoCivil, String email, String objetivoProfissional, String idiomas,
			InformacoesAcademicas infoAcademica) {
		super(nome, data, numeroCpf, numeroRg, sexo, etnia, estadoCivil, email);
		this.objetivoProfissional = objetivoProfissional;
		this.idiomas = idiomas;
		this.infoAcademica = infoAcademica;
	}

	public String getDescricaoObjetivoProfissional() {
		return objetivoProfissional;
	}

	public void setDescricaoObjetivoProfissional(String objetivoProfissional) {
		this.objetivoProfissional = objetivoProfissional;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public InformacoesAcademicas getInfoAcademica() {
		return infoAcademica;
	}

	public void setInfoAcademica(InformacoesAcademicas infoAcademica) {
		this.infoAcademica = infoAcademica;
	}
}