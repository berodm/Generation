package exercicios14_09;

import java.util.Scanner;
public class aluno_acesso
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		
		String aluno; // variavel
		char sexo;
		int nota1, nota2, nota3, nota4;
		double media=0;
		boolean feminino;
		
		System.out.print("Digite seu nome: ");
		aluno=ler.next().toUpperCase();
		System.out.print("\nDigite a nota 1:");
		nota1=ler.nextInt();
		System.out.print("\nDigite a nota 2:");
		nota2=ler.nextInt();
		System.out.print("\nDigite a nota 3:");
		nota3=ler.nextInt();
		System.out.print("\nDigite a nota 4:");
		nota4=ler.nextInt();
		System.out.println("Digite seu sexo: \nM - Masculino | F - Feminino");
		sexo=ler.next().toUpperCase().charAt(0);
		media = (nota1+nota2+nota3+nota4)/4;
		
		
		// PEGANDO OS DADOS DA BRUNA
		System.out.print("Digite seu nome: ");
		aluno1.nomeAluno=ler.next().toUpperCase();
		System.out.print("\nDigite a nota 1:");
		aluno1.nota1=ler.nextInt();
		System.out.print("\nDigite a nota 2:");
		aluno1.nota2=ler.nextInt();
		System.out.print("\nDigite a nota 3:");
		aluno1.nota3=ler.nextInt();
		System.out.print("\nDigite a nota 4:");
		aluno1.nota4=ler.nextInt();
		System.out.println("Digite seu sexo: \nM - Masculino | F - Feminino");
		aluno1.sexo=ler.next().toUpperCase().charAt(0);
		aluno1.mediaAluno = (aluno1.nota1+aluno1.nota2+aluno1.nota3+aluno1.nota4)/4;
		
		
		
		if(aluno1.sexo == 'M' )
		{
			aluno1.feminino = false;
		}
		else
		{
			aluno1.feminino = true;
		}
		
		System.out.printf("Nome aluno: %s", aluno1.nomeAluno);
		System.out.printf("\nNota 1: %d | Nota 2: %d | Nota 3: %d | Nota 4: %d", aluno1.nota1,aluno1.nota2,aluno1.nota3,aluno1.nota4);
		System.out.printf("\nMédia do aluno: %.2f",aluno1.mediaAluno);
		System.out.printf("\nSexo feminino? %b", aluno1.feminino);
		
		//pega dados do rafa
		System.out.print("Digite seu nome: ");
		aluno2.nomeAluno=ler.next().toUpperCase();
		System.out.print("\nDigite a nota 1:");
		aluno2.nota1=ler.nextInt();
		System.out.print("\nDigite a nota 2:");
		aluno2.nota2=ler.nextInt();
		System.out.print("\nDigite a nota 3:");
		aluno2.nota3=ler.nextInt();
		System.out.print("\nDigite a nota 4:");
		aluno2.nota4=ler.nextInt();
		System.out.println("Digite seu sexo: \nM - Masculino | F - Feminino");
		aluno2.sexo=ler.next().toUpperCase().charAt(0);
		aluno2.mediaAluno = (aluno2.nota1+aluno2.nota2+aluno2.nota3+aluno2.nota4)/4;
		
		
		
		if(aluno2.sexo == 'M' )
		{
			aluno2.feminino = false;
		}
		else
		{
			aluno2.feminino = true;
		}
		
		System.out.printf("Nome aluno: %s", aluno2.nomeAluno);
		System.out.printf("\nNota 1: %d | Nota 2: %d | Nota 3: %d | Nota 4: %d", aluno2.nota1,aluno2.nota2,aluno2.nota3,aluno2.nota4);
		System.out.printf("\nMédia do aluno: %.2f",aluno2.mediaAluno);
		System.out.printf("\nSexo feminino? %b", aluno2.feminino);		
		
		
		ler.close();	
	
	}
}