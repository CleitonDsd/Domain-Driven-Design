package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

/*Implementar um jogo da Forca
 * 
 * Iserir uma palavra e o n�mero de vidas
 * 
 * Inserir uma letra
 * Verificar se a palavra existe
 * Exibe se acertou ou errou
 * Exibe a palavra oculta (com *) e letras erradas e quantidade de vidas
 * 
 * Repetir at� acabar a quantidade de vidas ou acertar a palavra
 **/
public class ForcaView {
	public static void main(String[] args) {
		boolean acertou = false;
		// int qtdVidasAtual = 0;
		String letrasErradas = "";

		// L� a qtd de vidas
		int quantidadeVidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vidas"));

		// L� a palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra");

		String palavraOculta = "";
		String letrasCorretas = "";

		do {

			// L� a letra
			String letra = JOptionPane.showInputDialog("Digite a letra");

			// Valida se existe a letra na palavra
			// valida se encontrou a letra na palavra (se n�o encontra o retorno � -1)
			if (palavra.indexOf(letra) != -1) {
				acertou = true;
				letrasCorretas += letra; // adiciona mais uma letra correta na vari�vel
			} else {
				acertou = false;
				quantidadeVidas--; // decrementa a quantidade de vidas
				letrasErradas += letra; // adiciona mais uma letra errada na vari�vel
			}

			// Exibe se acertou ou errou
			// (condicao?verdadeiro:falso) - Operador tern�rio
			JOptionPane.showMessageDialog(null, (acertou ? "Acertou!" : "Errou!"));
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
			// Exibe a palavra oculta (com *) e letras erradas e qtd de vidas
			JOptionPane.showMessageDialog(null, "Palavra a ser adivinhada: " + palavraOculta + "\nLetras erradas: "
					+ letrasErradas + "\nQuantidade de vidas: " + quantidadeVidas);

		} while (quantidadeVidas >= 0 && !palavra.equals(palavraOculta));// Repetir at� acabar a qtd de vidas ou acertar a palavra
	}
}
