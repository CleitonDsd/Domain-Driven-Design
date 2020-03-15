package br.com.fiap.tds;

public class Operacoes2 {

	public static void main(String args[]) {
		//Declarar uma variável para armazenar a qtd de alunos
		int totalAlunos = 38;
		
		//Adicionar mais um aluno no total
		totalAlunos++; //totalAlunos = totalAlunos + 1;
		
		totalAlunos += 2; //totalAlunos =totalAlunos + 2;
		
		//Os grupos de projetos devem ter 6 alunos
		//Quantos grupos a sala vai ter?
		int grupos = totalAlunos / 6;
		System.out.println("Grupos: " + grupos);
		
		//Quantos alunos vão sobrar sem grupo?
		// % -> resto da divisão
		int alunosRestantes = totalAlunos % 6;
		System.out.println("Alunos sem grupo: " + alunosRestantes);
		
		//Declarar um char
		char turma = 'S';
		
		//Declarar uma String
		String curso = "Analise e Dev de Sistemas";
		
		//Exibir o char e a string
		System.out.println(curso + " Turma: " + turma);
	}
	
}


