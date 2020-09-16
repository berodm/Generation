package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class Principal {
	//EXEMPLO FEITO EM SALA SEM O DESAFIO
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in); // instanciei o teclado
		Aluno alunoExemplo = new Aluno(); // instanciei o aluno  //
		int ano;
				
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		
		System.out.print("Digite o nome do aluno: ");
		alunoExemplo.nomeAluno = leia.next().toUpperCase();
		System.out.print("Sexo aluno [M/F]:");
		alunoExemplo.sexoAluno = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite a nota 1 :");
		alunoExemplo.notas[0] = leia.nextDouble();
	
		System.out.println(alunoExemplo.anoNascimentoAluno);
		System.out.print("Digite o ano de nascimento: ");
		ano = leia.nextInt();
	
		alunoExemplo.mostraIdade(ano);
		System.out.println("");
		System.out.println(alunoExemplo.anoNascimentoAluno);
		
		
		leia.close();
	}
}
		