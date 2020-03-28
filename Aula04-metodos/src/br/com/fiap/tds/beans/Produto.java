package br.com.fiap.tds.beans;

public class Produto {

	public String marca;

	public String nome;

	public double preco;

	public boolean blackfriday;

	// metodos

	public void colocarBlackFryday() {
		this.blackfriday = true;
		preco /= 2;// coloca preco pela metade
	}

	public double calcularPrazo(int parcelas) {

		double precoTotalPorParcela = this.preco / parcelas;

		return precoTotalPorParcela;
	}

	public void trocarNome(String nomeAlterado) {

		this.nome = nomeAlterado;
	}

	// Cria um método que recebe os valores
	public void inicializar(String marca, String nome, double preco, boolean blackfryday) {

		this.marca = marca;
		this.nome = nome;
		this.preco = preco;
		this.blackfriday = blackfryday;

	}

	// método que retorna os detalhes do produto
	public String retornarDetalhes() {
		String detalhes = nome + " | " + marca + " | " + preco + " | " + blackfriday;
		return detalhes;
	}

}
