package exercicios09_09;
/*
 * 4-	Fa�a um programa em que permita a entrada de um n�mero 
 * qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
import java.util.*;
public class exercicio_4 {
	public static void main(String[] args) 
	{
	Scanner kb = new Scanner(System.in);
	double numero;
	
	System.out.print("Digite um n�mero: ");
	numero = kb.nextInt();
	
	if(numero%2==0)
	{
		System.out.print("o n�mero escolhido � par.\n");
		System.out.print(Math.sqrt(numero));
	}
	else
	{
		System.out.print("o n�mero escolhido � �mpar.\n");
		System.out.print(Math.pow(numero, 2));
	}
	
}
}
