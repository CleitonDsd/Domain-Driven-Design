package br.com.fiap.loja.view;

import br.com.fiap.loja.beans.Pedido;
import br.com.fiap.loja.beans.Usuario;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciando classes para obter o user
		Usuario user = new Usuario();

		// Alterando os valores dos atributos
		user.setNome("Maria");
		user.setPremiun(true);
		user.setEmail("maria@fiap.com.br");

		// Instanciando classe de pedido
		Pedido pedido = new Pedido();

		// Alterando valores do pedido
		pedido.setPago(false);
		pedido.setValor(100);
		// Envia para o m�todo a v�riavel que armazena o usu�rio
		pedido.setUsuario(user);

		// Recuperando o valor do atribuito e exbindo no console
		System.out.println("Nome do Usu�rio: " + user.getNome());
		System.out.println("Pago: " + user.getNome());
		System.out.println("E-mail: " + user.getNome());
	}
}
