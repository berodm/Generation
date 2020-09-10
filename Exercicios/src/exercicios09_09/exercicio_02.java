package exercicios09_09;
/* 2-	Faça um programa que entre com três números
 * e coloque em ordem crescente.
 */
import java.util.Scanner;
public class exercicio_02 {
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite um número: ");
		num1 = kb.nextInt();
		System.out.print("Digite um número: ");
		num2 = kb.nextInt();
		System.out.print("Digite um número: ");
		num3 = kb.nextInt();
		
		if(num1<=num2 && num2<=num3) 
		{
			System.out.printf("A ordem crescente é %d, %d, %d" ,num1 ,num2 ,num3);
			
		}
		if(num2<=num1 && num1<=num3) 
		{
			System.out.printf("A ordem crescente é %d, %d, %d",num2 ,num3 ,num1);
			
		}
		if(num3<=num1 && num1<=num2) 
		{
			System.out.printf("A ordem crescente é %d, %d, %d" ,num3 ,num1 ,num2);
		}
		if(num1<=num3 && num3<=num2) 
		{
			System.out.printf("A ordem crescente é %d, %d, %d",num1 ,num3 ,num2);
			
		}
		if(num2<=num3 && num3<=num1) 
		{
			System.out.printf("A ordem crescente é %d, %d, %d",num2 ,num3 ,num1);
			
		}
		if(num3<=num2 && num2<=num1)
		{
			System.out.printf("A ordem crescente é %d, %d, %d" ,num3, num2 ,num1);
		}
	
		

}
}