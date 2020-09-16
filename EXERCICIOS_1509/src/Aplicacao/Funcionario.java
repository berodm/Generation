package Aplicacao;

import java.util.Scanner;

import Objetos.Funcionario_Objeto;

public class Funcionario {
/*
 * 4) Crie uma classe funcionário e apresente os atributos 
 * e métodos referentes esta classe, em seguida crie um objeto funcionário, 
 * defina as instancias deste objeto e apresente as 
 * informações deste objeto no console.
 */
		public static void main(String[] args) 
		{
			Scanner kb = new Scanner(System.in);
			Funcionario_Objeto func = new Funcionario_Objeto();
			
			
			System.out.printf("Nome do Funcionário: ");
			func.nomeFunc = kb.next();
			System.out.printf("Idade do Funcionário: ");
			func.idadeFunc = kb.nextInt();
			System.out.printf("Gênero do Funcionário: (M) para masculino ou (F) para feminino: ");
			func.sexoFunc = kb.next().toUpperCase().charAt(0);
			System.out.printf("Horas Trabalhadas no dia: ");
			func.horasTrab = kb.nextDouble();
			

			
			func.mostraG();
			func.somaValor();
			
	}
	}
