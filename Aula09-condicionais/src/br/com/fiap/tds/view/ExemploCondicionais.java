package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploCondicionais {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		if (x > 10) {
			JOptionPane.showMessageDialog(null, x + " É maior do que 10");
		} else {
			JOptionPane.showMessageDialog(null, x + " É menor ou igual a 10");
		}

		boolean ok = true;

		if (ok) {
			System.out.println("OK é true");
		} else {
			System.out.println("OK é falso");
		}

		// Switch Case
		int semana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana: "));

		switch (semana) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça-Feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;

		default:
			System.out.println("Dia Inválido!");
		}
	}

};