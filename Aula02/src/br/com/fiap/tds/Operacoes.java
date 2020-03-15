package br.com.fiap.tds;

public class Operacoes {

	//Método que será executado quando rodar 
	public static void main(String args[]) {
		//Declarar uma variável para armazerar uma nota
		float s1 = 7;
		float s2 = 5;
		
		//Calcular a média final do curso
		double media = s1*0.4 + s2*0.6;
		
		//Exibir a média final
		System.out.println(media);		

		//Declarar uma variável sem valor
		boolean aprovado;
		
		//Atribuir um valor a variável
		s1 = 8;
		aprovado = true; //true -> verdadeiro, false -> falso
		
		//Calcular a média novamente 
		//Não é preciso declarar novamente a variável
		media = s1*0.4 + s2*0.6; 
		//Exibir a média
		System.out.println(media);
	}
	 
}