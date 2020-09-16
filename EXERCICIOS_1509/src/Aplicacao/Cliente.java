package Aplicacao;

import java.util.Scanner;

import Objetos.Cliente_Objeto;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos
 *  referentes esta classe, em seguida crie um objeto cliente,
 *   defina as instancias deste objeto e apresente as informações
 *   deste objeto no console.
 */
public class Cliente {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Cliente_Objeto cliente1 = new Cliente_Objeto();
		int i;
		
		System.out.printf("Nome do Cliente: ");
		cliente1.nomeCliente = kb.next();
		System.out.printf("Idade do cliente: ");
		cliente1.idadeCliente = kb.nextInt();
		System.out.printf("Gênero do cliente: (M) para masculino ou (F) para feminino: ");
		cliente1.sexoCliente = kb.next().toUpperCase().charAt(0);
		//System.out.printf("Forma de Pagamento: (D) débito ou (C) crédito: ");
		//cliente1.formaPgto = kb.next().toUpperCase().charAt(0);

		for(i = 0; i < 4; i++) 
		{
			System.out.printf("Digite o valor do produto: ");
			cliente1.valorProdutos[i] = kb.nextDouble();
		}
		
		cliente1.mostraG();
		cliente1.mostraSoma();
		cliente1.soma();
		cliente1.somaValor();
		
}
}
