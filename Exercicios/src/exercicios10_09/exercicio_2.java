package exercicios10_09;
/*
 * Ler 10 números e imprimir quantos são pares
 * e quantos são ímpares. (FOR
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
		System.out.printf("\nExistem %d números pares", pares);
		System.out.printf("\nExistem %d números impares", impares);
}
}