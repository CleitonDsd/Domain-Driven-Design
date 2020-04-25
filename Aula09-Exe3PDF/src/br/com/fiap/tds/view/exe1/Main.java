package br.com.fiap.tds.view.exe1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String nome1, nome2;
		double altura1, altura2;
		double peso1, peso2;

		nome1 = JOptionPane.showInputDialog("Digite o nome: ");
		altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));

		// nome2
		nome2 = JOptionPane.showInputDialog("Digite o nome: ");
		altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));

		// Comparação
		if (altura1 > altura2) {
			JOptionPane.showMessageDialog(null, nome1 + " é o mais alto.");
		} else if (altura2 > altura1) {
			JOptionPane.showMessageDialog(null, nome2 + " é o mais alto.");
		} else {
			JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " possuem a mesma altura.");
		}

		if (peso1 > peso2) {
			JOptionPane.showMessageDialog(null, nome1 + " é o mais pesado.");
		} else if (peso2 > peso1) {
			JOptionPane.showMessageDialog(null, nome2 + " é o mais pesado.");
		} else {
			JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " possuem o mesmo peso altura.");
		}

	}
}
