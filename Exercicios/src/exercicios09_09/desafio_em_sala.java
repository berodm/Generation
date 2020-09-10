package exercicios09_09;
import java.util.Locale;
import java.util.Scanner;
  public class desafio_em_sala {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
	  Scanner ler = new Scanner(System.in);
   		
   		
   		int opcao=0;
   	
		System.out.println("Digite 1 para Sexo feminino , 2 para masculino e 3 para outros: ");
		opcao=ler.nextInt();
		
		
		System.out.print( (opcao==1)? "Sexo feminino":(opcao==2)? "Sexo Masculino ":(opcao==3)? "Você escolheu    Outros ":"Você digitou errado, tente novamente!" );
		
		
		ler.close();
	  	
	}
	
	
	
}