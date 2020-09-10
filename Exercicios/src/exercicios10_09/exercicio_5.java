package exercicios10_09;
import java.util.Scanner;
/*
 * Crie um programa que leia um número do teclado 
 * até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
public class exercicio_5 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int numero, soma=0;
		
		do 
		{
			System.out.printf("Digite um número de 0 a 9:");
			numero = kb.nextInt();
			
			if(numero>0)
			{
			soma = soma+numero;
			}
		}
		while(numero!=0);
		
		System.out.printf("\nA soma dos número digitados é: %d", soma);
		
	}
}
