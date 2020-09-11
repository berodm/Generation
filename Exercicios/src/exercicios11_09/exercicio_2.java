package exercicios11_09;
/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */
import java.util.Scanner;
public class exercicio_2 {
	public static void main(String[] args) 
	{
	Scanner kb = new Scanner(System.in);
	int[] vetor=new int[6];
	int numImpar=0, soma=0;
	
	for(int num=0;num<6;num++)
	{
		System.out.println("Digite um número inteiro: ");
		vetor[num] = kb.nextInt();
		
		if((vetor[num]%2)!=0)
		{
			numImpar++;
		}
		else if((vetor[num])%2==0)
		{
			soma = soma+vetor[num];
		}
	}
	for(int num=0;num<6;num++)
	{
		if(vetor[num]%2==0)
		{
			System.out.printf("\n"+ vetor[num] +" é par. ");
		}
		else
		{
			System.out.printf("\n"+ vetor[num] +" é impar. ");
		}
	}
	System.out.printf("\n");
	System.out.printf("\nExistem %d numeros impares", numImpar);
	System.out.printf("\nA soma dos número pares é %d",soma);
	}
}
