package exercicios10_09;
/*
 * Ler 10 n�meros e imprimir quantos s�o pares
 * e quantos s�o �mpares. (FOR
 */
public class exercicio_2 {
	public static void main(String[] args) 
	{
		int numero, pares=0, impares=0;
		for(numero = 1; numero <= 10; numero ++)
		{
		 	if(numero%2==0) 
		{
		 		
		 		System.out.println(numero);
		 		pares++;
		 	}
		 	else
		 	{
		 		System.out.println(numero);
		 		impares++;
		 	}
		 		
		}
		System.out.printf("\nExistem %d n�meros pares", pares);
		System.out.printf("\nExistem %d n�meros impares", impares);
}
}