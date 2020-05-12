package br.com.fiap.tds.bean;

public class Forca {

	// Atributos
	private String letrasCorretas = "", letras = "", letrasErradas = "", palavra = "", palavraOculta = "";
	private int quantidadeVidas;
	private boolean acertou;

	// Construtor
	public Forca(String palavra, int quantidadeVidas) {
		this.palavra = palavra;
		this.quantidadeVidas = quantidadeVidas;
	}

	// M�todos
	public void validarLetra(String letra) {
		if (palavra.indexOf(letra) != -1) {
			acertou = true;
			letrasCorretas += letra; // adiciona mais uma letra correta na vari�vel
		} else {
			acertou = false;
			quantidadeVidas--; // decrementa a quantidade de vidas
			letrasErradas += letra; // adiciona mais uma letra errada na vari�vel
		}
	}

	public void gerarPalavraOculta() {

		palavraOculta = "";
		// Percorrer todas as posi��es da palavra
		for (int i = 0; i < palavra.length(); i++) {
			// Validar se a letra da posi��o da palavra est� nas letrasCorretas
			if (letrasCorretas.indexOf(palavra.charAt(i)) != -1) {
				// Se estiver, adiciona a letra na palavra oculta
				palavraOculta += palavra.charAt(i);

			} else {
				// Se n�o, adiciona o *
				palavraOculta += "*";
			}

		}
	}

	public boolean validarJogada() {
		return quantidadeVidas >= 0 && palavraOculta.contains(("*"));
	}

	// Getters and Setters
	public String getLetrasCorretas() {
		return letrasCorretas;
	}

	public void setLetrasCorretas(String letrasCorretas) {
		this.letrasCorretas = letrasCorretas;
	}

	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public String getPalavraOculta() {
		return palavraOculta;
	}

	public void setPalavraOculta(String palavraOculta) {
		this.palavraOculta = palavraOculta;
	}

	public int getQuantidadeVidas() {
		return quantidadeVidas;
	}

	public void setQuantidadeVidas(int quantidadeVidas) {
		this.quantidadeVidas = quantidadeVidas;
	}

	public boolean isAcertou() {
		return acertou;
	}

	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

	public String getLetrasErradas() {
		return letrasErradas;
	}

	public void setLetrasErradas(String letrasErradas) {
		this.letrasErradas = letrasErradas;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

}