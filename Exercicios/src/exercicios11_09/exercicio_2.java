package exercicios11_09;
/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
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
		System.out.println("Digite um n�mero inteiro: ");
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
			System.out.printf("\n"+ vetor[num] +" � par. ");
		}
		else
		{
			System.out.printf("\n"+ vetor[num] +" � impar. ");
		}
	}
	System.out.printf("\n");
	System.out.printf("\nExistem %d numeros impares", numImpar);
	System.out.printf("\nA soma dos n�mero pares � %d",soma);
	}
}
