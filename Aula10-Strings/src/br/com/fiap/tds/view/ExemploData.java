package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.data.bean.Data;

public class ExemploData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0123456789
		Data data = new Data("04/05/2020");

		JOptionPane.showMessageDialog(null, data);
	}

}
