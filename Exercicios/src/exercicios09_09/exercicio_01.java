package exercicios09_09;
/*
 * 1-	Fa�a um programa que receba tr�s inteiros
 *  e diga qual deles � o maior.
 */
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite um n�mero: ");
		num1 = kb.nextInt();
		System.out.print("Digite um n�mero: ");
		num2 = kb.nextInt();
		System.out.print("Digite um n�mero: ");
		num3 = kb.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.printf("O maior n�mero � "+num1);
			
		}
		if(num2>num1 && num2>num3)
		{
			System.out.printf("O maior n�mero � "+num2);
			
		}
		if(num3>num1 && num3>num2)
		{
			System.out.printf("\nO maior n�mero � "+num3);
			
		}

	}

}
