package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Funcionarios;
import Entidades.Terceiros;

public class Principal_2 {
//exemplo para polimorfismo
	public static void main(String[] args) {
		/*
		 * // Digite o numero de funcionarios para cadastro:
		// quantos funcionarios ?? 1,2,3   <----- ArrayList - tipo funcionario
		// cada funcionario é um objeto
		// lance os dados por objeto
		// pedi o nome --> nome
		//pedi horas
		// valor por hora
		// e os terceiros??? tem quer pra terceiro
		// horas adicionais
		
		
		// INTERFACE -- List // ArrayList
		 */
		
		//variaveis 
		
		int numF;
		char ch;
		String nome;
		int hora;
		double valor;
		double valorextra;
		
		Scanner leia = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.println("Digite o número de funcionários: ");
		numF=leia.nextInt();
		
		for (int i=1; i<=numF; i++)
		{
			System.out.println("Nome do funcionario" +i+ " :");
			nome = leia.next();
			System.out.println("Terceirizado [S/N] :");
			ch = leia.next().charAt(0);
			System.out.println("Horas trabalhadas: ");
			hora = leia.nextInt();
			System.out.println("valor da hora trabalhada: ");
			valor = leia.nextDouble();
					
			if(ch == 'S')
			{
				System.out.println("Digite o valor hora adicional : ");
				valorextra=leia.nextDouble();
				//terceiro exemplo1 = new terceiro(nome, horas, valorhora, valor extra))
				list.add(new Terceiros(nome, hora, valor, valorextra));
			}
			else
			{
				list.add(new Funcionarios(nome, hora, valor));
			}
					
			}
		//recebe os dados da lista
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for (Funcionarios func: list) //for each 
		{
			System.out.println(func.getNome()+ " "+func.pagamento());
			
		}
}

}
