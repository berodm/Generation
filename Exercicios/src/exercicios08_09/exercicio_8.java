package exercicios08_09;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma
 *  do custo de f�brica com a percentagem do distribuidor
 *   e dos impostos (aplicados ao custo de f�brica). 
 *   Supondo que a percentagem do distribuidor seja de 28% 
 *   e os impostos de 45%, escrever um sistema que leia o custo
 *    de f�brica de um carro e escreva o custo ao consumidor. 
 */
public class exercicio_8 
{
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float custo, imp, pDis, total;
		System.out.println("Digite o custo de fabrica��o: ");
		custo = ler.nextFloat();
		
		pDis=(float) (custo*0.28);
		imp=(float) (custo*0.45);
		total=(float) (custo+pDis+imp);
		
		System.out.println("o custo total do ve�culo � de : R$ ");
		System.out.print(total);

		
		
	}

}
