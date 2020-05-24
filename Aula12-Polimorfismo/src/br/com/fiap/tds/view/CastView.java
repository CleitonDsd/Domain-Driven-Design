package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Gerente;
import br.com.fiap.tds.bean.Pessoa;

public class CastView {

	public static void main(String[] args) {
		// Instanciar um funcionário
		Funcionario f = new Funcionario();

		// Instanciar um gerente atribuindo em uma variável do tipo pessoa
		Pessoa p = new Gerente();

		// Valida se a instância em p é do tipo gerente
		if (p instanceof Gerente) {

			// Cast -> força um tipo de objeto ser de outro tipo
			Gerente g = (Gerente) p;

			// Aumentar o salário e exibi-lo
			g.aumentarSalario(10000.0);
			System.out.println(g.getSalario());

		} else {
			System.out.println("p não é uma instância de gerente");
		}

	}

}