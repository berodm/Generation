package Aplicacao;

import java.util.Scanner;

import Objetos.Funcionario_Objeto;

public class Funcionario {
/*
 * 4) Crie uma classe funcion�rio e apresente os atributos 
 * e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, 
 * defina as instancias deste objeto e apresente as 
 * informa��es deste objeto no console.
 */
		public static void main(String[] args) 
		{
			Scanner kb = new Scanner(System.in);
			Funcionario_Objeto func = new Funcionario_Objeto();
			
			
			System.out.printf("Nome do Funcion�rio: ");
			func.nomeFunc = kb.next();
			System.out.printf("Idade do Funcion�rio: ");
			func.idadeFunc = kb.nextInt();
			System.out.printf("G�nero do Funcion�rio: (M) para masculino ou (F) para feminino: ");
			func.sexoFunc = kb.next().toUpperCase().charAt(0);
			System.out.printf("Horas Trabalhadas no dia: ");
			func.horasTrab = kb.nextDouble();
			

			
			func.mostraG();
			func.somaValor();
			
	}
	}
