package br.com.fiap.tds.data.bean;

import java.util.Scanner;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	// Inicializa os dados com zero
	public Data() {
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	// Dados rebecidos como parametro
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	//Validar DIA
	public void lerDia() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		this.dia = scan.nextInt();
	}

	public int validarDia(int dia) {
		this.dia = dia;
		if ((this.dia < 1) || (dia > 31)) {
			System.out.println("Dia Inválido! {preenchimento automático = 1.}");
			return this.dia = 1;
		} else {
			return this.dia;
		}
	}
	
	//Validar MÊS
	public void lerMes() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Mês: ");
		this.mes = scan.nextInt();
	}
	public int validarMes(int mes) {
		this.mes = mes;
		if ((this.mes < 1) || (this.mes > 12)) {
			System.out.println("Mês Inválido! {preenchimento automático = 1.}");
			return this.mes = 1;
		} else {
			return this.mes;
		}

	}
	
	//Validar ANO
	public void lerAno() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Ano: ");
		this.ano = scan.nextInt();
	}

	public int validarAno(int ano) {
		this.ano = ano;
		if (ano < 0) {
			System.out.println("Ano Inválido! {preenchimento automático = 2020}");
			return this.ano = 2020;
		} else {
			return this.ano;
		}
	}

	// Método para retornar a data como string no formato
	public String retornarData() {
		String data = "\nData Inserida: " + dia + "/" + mes + "/" + ano;
		return data;
	}
	
	public void retornarNomeMes(int mes) {
		this.mes = mes;
		
		switch (this.mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
						
		default:
			System.out.println("Mês inválido");
			break;
		}
	}

}
