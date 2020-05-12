package br.com.fiap.tds.bean;

public class Cafeteira extends Eletrodomestico {
	
	private String tipoCafe;

	private boolean bandejaRemovivel;

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
