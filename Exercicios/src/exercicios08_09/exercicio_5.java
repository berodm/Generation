package exercicios08_09;
import java.util.Scanner;

/*5. Fa�a um sistema que leia as 3 notas de 
 * um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das
 *  notas �: 2,3 e 5, respectivamente. 
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
		
		System.out.printf("o valor da media final �: ");
		System.out.print(mediaF);
		
		
		
	}
}
