package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Gerente;

public class SobreescritaView {

	public static void main(String[] args) {
		// Ler os dados
		String nome = JOptionPane.showInputDialog("Nome");
		String data = JOptionPane.showInputDialog("Data de nascimento");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));

		// Instanciar um Funcionário
		Funcionario funcionario = new Funcionario(nome, data, salario);

		// Instanciar um Gerente
		Gerente gerente = new Gerente(nome, data, salario);

		// Ler o aumento
		double aumento = Double.parseDouble(JOptionPane.showInputDialog("Aumento"));

		// Aumentar o salário do funcionário e gerente
		funcionario.aumentarSalario(aumento); // chama o método do Funcionário
		gerente.aumentarSalario(aumento); // chama o método do Gerente

		// Exibir o salário atual
		System.out.println("Salário do funcionário: " + funcionario.getSalario());
		System.out.println("Salário do gerente: " + gerente.getSalario());

		Funcionario f = new Gerente(nome, data, salario);
		f.aumentarSalario(aumento); // chama o método Gerente
		System.out.println("Novo salário: " + f.getSalario());

	}

}