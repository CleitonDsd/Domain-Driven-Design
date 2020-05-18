package br.com.fiap.tds.bean;

public class Cafeteira extends Eletrodomestico {

	// Atributos
	private String tipoCafe;

	private boolean bandejaRemovivel;

	// Construtor padrão
	public Cafeteira() {
	}

	// Construtor com todos os atributos
	public Cafeteira(boolean bivolt, int voltagem, String nome, double preco, String tipoCafe, boolean bandeja) {
		super(bivolt, voltagem, nome, preco);
		this.tipoCafe = tipoCafe;
		this.bandejaRemovivel = bandeja;
	}

	// Métodos
	public String getTipoCafe() {
		return tipoCafe;
	}

	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}

	public boolean isBandejaRemovivel() {
		return bandejaRemovivel;
	}

	public void setBandejaRemovivel(boolean bandejaRemovivel) {
		this.bandejaRemovivel = bandejaRemovivel;
	}

}
