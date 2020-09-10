package exercicios10_09;
/*
 * Ler 10 números e imprimir quantos são pares
 * e quantos são ímpares. (FOR
 */
public class exercicio_2 {
	public static void main(String[] args) 
	{
		int numero, par=0, impar=0;
		for(numero = 1; numero <= 10; numero ++)
		{
		 	if(numero%2==0) 
		{
		 		
		 		System.out.println(numero);
		 		par++;
		 	}
		 	else
		 	{
		 		System.out.println(numero);
		 		impar++;
		 	}
		 		
		}
		System.out.printf("\nExistem %d números pares", par);
		System.out.printf("\nExistem %d números impares", impar);
}
}