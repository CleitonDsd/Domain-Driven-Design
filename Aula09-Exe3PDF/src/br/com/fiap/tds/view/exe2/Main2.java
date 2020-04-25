package br.com.fiap.tds.view.exe2;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {

		int idade;
		for (int i = 1; i <= 3; i++) {
			idade = Integer.parseInt(JOptionPane.showInputDialog(i + "° Pessoa | Digite sua idade: "));
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Não Eleitor.");

			} else if (idade >= 18 && idade <= 65) {
				JOptionPane.showMessageDialog(null, "Eleitor Obrigatório.");

			} else if ((idade >= 16 && idade <= 17) || (idade > 65)) {
				JOptionPane.showMessageDialog(null, "Eleitor Facultativo.");

			}
		}
	}

}
