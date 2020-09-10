package exercicios10_09;
/*
 * 1 Informar todos os números de 1000 a 1999
que quando divididos por 11 obtemos resto = 5. (FOR)
 */
public class exercicio_1 {
	public static void main(String[] args) 
	{
		int numero;
		for(numero = 1000; numero <= 1999; numero ++)
		{
		 	if(numero%11==5) 
		{
		 		
		 		System.out.println(numero);
		 	}
		 		
		}
		
}
}