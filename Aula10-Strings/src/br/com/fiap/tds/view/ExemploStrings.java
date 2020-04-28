package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// caractesres de escape
		JOptionPane.showMessageDialog(null, "Escolha um opção: \n1 - Entrar \n2 - Sair");

		String curso = "TDS";

		String nome = curso + " - Análise de Desenvolvimento de Sistemas";

		nome.concat(" - FIAP");
		
		JOptionPane.showMessageDialog(null, nome);
		
	}

}
