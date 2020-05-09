package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

/*Implementar um jogo da Forca
 * 
 * Iserir uma palavra e o número de vidas
 * 
 * Inserir uma letra
 * Verificar se a palavra existe
 * Exibe se acertou ou errou
 * Exibe a palavra oculta (com *) e letras erradas e quantidade de vidas
 * 
 * Repetir até acabar a quantidade de vidas ou acertar a palavra
 **/
public class FocaView {
	public static void main(String[] args) {
		boolean acertou = false;
		//int qtdVidasAtual = 0;
		String letrasErradas = "";
		
		//Lê a qtd de vidas
		int quantidadeVidas = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a qtd de vidas"));
		
		//Lê a palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		String palavraOculta = "";
		String letrasCorretas = "";
		
		do {
		
			//Lê a letra
			String letra = JOptionPane.showInputDialog("Digite a letra");
			
			//Valida se existe a letra na palavra
			//valida se encontrou a letra na palavra (se não encontra o retorno é -1)
			if (palavra.indexOf(letra) != -1) {
				acertou = true;
				letrasCorretas += letra; //adiciona mais uma letra correta na variável
			}else {
				acertou = false; 
				quantidadeVidas--; //decrementa a quantidade de vidas
 				letrasErradas += letra; //adiciona mais uma letra errada na variável
			}
			
			//Exibe se acertou ou errou
			//(condicao?verdadeiro:falso) - Operador ternário
			JOptionPane.showMessageDialog(null, (acertou?"Acertou!":"Errou!"));
			
					
			//Percorrer todas as posições da palavra
			//Validar se a letra da posição da palavra está nas letrasCorretas
			
			//Se estiver, adiciona a letra na palavra oculta
			
			//Se não, adiciona o *
			
			//faculdade
			palavraOculta += "f";
			palavraOculta += "*";
			
			//Exibe a palavra oculta (com *) e letras erradas e qtd de vidas
			
		}while(quantidadeVidas != 0);//Repetir até acabar a qtd de vidas ou acertar a palavra
	}
}
