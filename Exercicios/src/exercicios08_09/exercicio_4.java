package exercicios08_09;
import java.util.Scanner;
/*
 * 4. Escreva  um sistema que leia três 
 * números inteiros e positivos (A, B, C)
 *  e calcule a seguinte expressão: 
 * 
 */
public class exercicio_4 {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		float r, s, d;
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt(); //nextint é para o tipo de variavel INTEIRO
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		r= (a+b)^2;
		s= (b+c)^2;
		d= (r+s)/2;
		
		System.out.printf("o valor de D é: ");
		System.out.print(d);
		
	}
}
