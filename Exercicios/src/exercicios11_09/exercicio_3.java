package exercicios11_09;

/*
 * 3- Leia uma matriz 3 x 3, conte e escreva 
 * quantos valores maiores que 10 ela possui.
 */
import java.util.Random;
public class exercicio_3 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[3][3];
		int maior10=0;
		
		for(int linha=0; linha<3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("Posição [%d][%d] :", linha+1, coluna+1);
				matriz[linha][coluna]= aleatorio.nextInt(33);
				System.out.println(matriz[linha][coluna]);
				if(matriz[linha][coluna]>10)
				{
					maior10++;
				}
			}
		}
	
		System.out.printf("Existem %d valores maiores que 10.", maior10);
	}

	}
