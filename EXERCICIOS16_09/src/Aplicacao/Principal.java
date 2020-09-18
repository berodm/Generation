package Aplicacao;

import Objeto.Pessoa;
import Objeto.Empregado;
import Objeto.Administrador;

public class Principal {

	public static void main(String[] args) 
	{
	Pessoa exemploPessoa = new Pessoa("Jose", "Avenida Paulista 232", "(11) 3456-5432");
	//String nome, String endereco, String telefone
	Empregado empregado1 = new Empregado("Joao", 2, 2570.34, 0.17, 0);
	//String nome, int codigoSetor, double salarioBase, double imposto
	Administrador adm1 = new Administrador("Joana", 1045.54, 598.90, 0);
	//String nome, double valViagens, double valEstadias
	
	//-------------EMPREGADO		
	System.out.println(empregado1.getNome());
	System.out.println("Do setor: ");
	System.out.print(empregado1.getCodigoSetor());
	System.out.println("\nSalario bruto sem impostos de: ");
	System.out.print(empregado1.getSalarioBase());
	
	System.out.printf("\nSalario liquido, descontado os impostos é de: R$ %.2f",empregado1.getSalLiquido() );
	
	System.out.printf("\n");
	System.out.printf("\n");
	//-------------ADM
	System.out.println(adm1.getNome());
	System.out.println("Gastou com viagens o valor de: ");
	System.out.print(adm1.getValViagens());
	System.out.println("\nGastou com estadia o valor de: ");
	System.out.print(adm1.getValEstadias());
	
	System.out.printf("\nValor total da ajuda de custo: R$ %.2f",adm1.getAjudaCusto() );
	
	}
}
