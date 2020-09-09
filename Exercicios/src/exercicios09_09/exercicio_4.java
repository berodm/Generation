package exercicios09_09;
/*
 * 4-	Faça um programa em que permita a entrada de um número 
 * qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
import java.util.*;
public class exercicio_4 {
	public static void main(String[] args) 
	{
	Scanner kb = new Scanner(System.in);
	double numero;
	
	System.out.print("Digite um número: ");
	numero = kb.nextInt();
	
	if(numero%2==0)
	{
		System.out.print("o número escolhido é par.\n");
		System.out.print(Math.sqrt(numero));
	}
	else
	{
		System.out.print("o número escolhido é ímpar.\n");
		System.out.print(Math.pow(numero, 2));
	}
	
}
}
