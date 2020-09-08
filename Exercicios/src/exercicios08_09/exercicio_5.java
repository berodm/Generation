package exercicios08_09;
import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de 
 * um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das
 *  notas é: 2,3 e 5, respectivamente. 
 */

public class exercicio_5 
{
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int nota1, nota2, nota3;
		float mediaF;
		System.out.println("Digite o valor da primeira atividade: ");
		nota1 = ler.nextInt(); 
		System.out.println("Digite o valor da segunda atividade: ");
		nota2 = ler.nextInt();
		System.out.println("Digite o valor da terceira atividade: ");
		nota3 = ler.nextInt();
		
		mediaF = ((nota1*2+nota2*3+nota3*5)/10);
		
		System.out.printf("o valor da media final é: ");
		System.out.print(mediaF);
		
		
		
	}
}
