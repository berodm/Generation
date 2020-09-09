package exercicios08_09;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		//criar o teclado
		
		System.out.print("Entre com o valor de A: ");
		a = kb.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = kb.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = kb.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = kb.nextDouble();
		System.out.print("Entre com o valor de E: ");
		e = kb.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = kb.nextDouble();
		

		x = (c*e - b*f)/ (a*e -b*d);
		y = (a*f - c*d)/ (a*e-b*d);
		
		System.out.printf("\nO valor de X é: %.2f", x);
		System.out.printf("\nO valor de Y é: %.2f", y);

		kb.close();
	}
	
}
