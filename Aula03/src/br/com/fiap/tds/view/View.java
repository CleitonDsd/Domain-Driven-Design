package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Carro;

public class View {

	public static void main(String args[]) {
		//Criar um objeto Carro
		Carro gol = new Carro();
		
		//Outro objeto do tipo Carro com os valores padrões nos atributos
		Carro ka = new Carro();
		
		//Chamando o método ligar
		gol.ligar();
		
		System.out.println(ka.ano + " " 
				+ ka.automatico + " " + ka.modelo);
		
		//Objeto para ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Armazenar os valores dentro do objeto do tipo Carro
		//Ler os valores para armazenar no objeto:
		System.out.println("Digite o ano:");
		gol.ano = leitor.nextInt(); //lê um número inteiro
		
		System.out.println("Digite a marca:");
		gol.marca = leitor.next(); //lê uma String
		
		System.out.println("Digite o modelo:");
		gol.modelo = leitor.next(); //lê uma String
		
		System.out.println("Digite o valor:");
		gol.preco = leitor.nextDouble(); //lê um double (Ex: 1500,00)
		
		System.out.println("Digite o motor:");
		gol.motor = leitor.nextFloat(); //lê um float (Ex: 1,5)
		
		System.out.println("É automático?");
		gol.automatico = leitor.nextBoolean(); //lê um boolean (true/false)
		
		//Exibir os valores (estado) dos atributos do objeto
		System.out.println("********Dados do carro:");
		System.out.println("Modelo: " + gol.modelo);
		System.out.println("Ano: " + gol.ano);
		System.out.println("Motor: " + gol.motor);
		System.out.println("Preço: " + gol.preco);
		System.out.println("Automático: " + gol.automatico);
		System.out.println("Marca: " + gol.marca);
		
		//Fechar o leitor depois de utilizar
		leitor.close();
	}
	
}





