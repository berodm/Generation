package exercicios10_09;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa 
 * termina quando idade for =-99. (WHILE)
 */
public class exercicio_3 {
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int idade, menor21=0, maior50=0;
		System.out.printf("Digite sua idade: ");
		idade = kb.nextInt();
		
		while(idade!=-99)
		{
			if(idade<=21);
			{
				menor21++;
			}
			if(idade>=50)
			{
				maior50++;
			}
		System.out.printf("\nDigite sua idade: ");
		idade = kb.nextInt();
		}
		
		System.out.printf("\nExistem %d pessoas com menos de 21 anos", menor21);
		System.out.printf("\nExistem %d pessoas com mais de 50 anos", maior50);
	}
}
