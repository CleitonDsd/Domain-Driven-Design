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
public class FocaView {
	public static void main(String[] args) {
		boolean acertou = false;
		//int qtdVidasAtual = 0;
		String letrasErradas = "";
		
		//L� a qtd de vidas
		int quantidadeVidas = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a qtd de vidas"));
		
		//L� a palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		String palavraOculta = "";
		String letrasCorretas = "";
		
		do {
		
			//L� a letra
			String letra = JOptionPane.showInputDialog("Digite a letra");
			
			//Valida se existe a letra na palavra
			//valida se encontrou a letra na palavra (se n�o encontra o retorno � -1)
			if (palavra.indexOf(letra) != -1) {
				acertou = true;
				letrasCorretas += letra; //adiciona mais uma letra correta na vari�vel
			}else {
				acertou = false; 
				quantidadeVidas--; //decrementa a quantidade de vidas
 				letrasErradas += letra; //adiciona mais uma letra errada na vari�vel
			}
			
			//Exibe se acertou ou errou
			//(condicao?verdadeiro:falso) - Operador tern�rio
			JOptionPane.showMessageDialog(null, (acertou?"Acertou!":"Errou!"));
			
					
			//Percorrer todas as posi��es da palavra
			//Validar se a letra da posi��o da palavra est� nas letrasCorretas
			
			//Se estiver, adiciona a letra na palavra oculta
			
			//Se n�o, adiciona o *
			
			//faculdade
			palavraOculta += "f";
			palavraOculta += "*";
			
			//Exibe a palavra oculta (com *) e letras erradas e qtd de vidas
			
		}while(quantidadeVidas != 0);//Repetir at� acabar a qtd de vidas ou acertar a palavra
	}
}
