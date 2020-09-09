package exercicios09_09;
/*
 * 3-	Faça um programa que receba a idade de uma pessoa 
 * e mostre na saída em qual categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 */
import java.util.Scanner;
public class exercicio_3 {
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite aqui sua idade: ");
		idade = kb.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.print("Infantil");
		}
		if (idade>=15 && idade<=17)
		{
			System.out.print("Juvenil");
		}
		if (idade>=18)
		{
			System.out.print("Adulto");
		}

		
}
}
