package br.com.b2wmarketplace.model.bean.vaga;

public class Vaga {

	private String nomeCargo;
	private String nomeEmpresa;
	private String dataInicio;
	private String beneficios;
	private String descricaoVaga;
	private double salario;

	public String toString() {
		return "\n Cargo: " + nomeCargo + "\n Empresa: " + nomeEmpresa + "\n Data de inicio: " + dataInicio
				+ "\n Beneficios: " + beneficios + "\n Descrição da vaga: " + descricaoVaga + "\n Salário: " + salario;
	}

	public Vaga() {
	}

	public Vaga(String nomeCargo, String nomeEmpresa, String dataInicio, String beneficios, String descricaoVaga,
			double salario) {
		super();
		this.nomeCargo = nomeCargo;
		this.nomeEmpresa = nomeEmpresa;
		this.dataInicio = dataInicio;
		this.beneficios = beneficios;
		this.descricaoVaga = descricaoVaga;
		this.salario = salario;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDescricaoVaga() {
		return descricaoVaga;
	}

	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

}