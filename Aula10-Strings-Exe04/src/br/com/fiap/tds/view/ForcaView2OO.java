package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Forca;

public class ForcaView2OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ler a quantidade de vidas e a palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		int quantidadeVidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vidas: "));

		// Instanciar a Forca
		Forca forca = new Forca(palavra, quantidadeVidas);

		do {
			// Ler a letra
			String letra = JOptionPane.showInputDialog("Digite uma letra: ");

			// Processar a letra
			forca.validarLetra(letra);

			// Exibir se acertou ou não
			JOptionPane.showMessageDialog(null, forca.isAcertou() ? "Parabéns! Letra correta" : "Opss! Letra errada.");
			
			//Gerar a palavra oculta
			forca.gerarPalavraOculta();
			
			//Exibir a palavra oculta, letras e quantidade de vidas
			JOptionPane.showMessageDialog(null, "Palavra a ser adivinhada: " 
			+ forca.getPalavraOculta()
			+ "\nLetras erradas: "+ forca.getLetrasErradas() 
			+ "\nQuantidade de vidas: " + forca.getQuantidadeVidas());
		} while (forca.validarJogada());
	}

}
