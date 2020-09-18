package Aplicacao;

import Entidades.Funcionarios;
import Entidades.Terceiros;

public class Principal {

	public static void main(String[] args) 
	{
		Funcionarios novoFun = new Funcionarios("Beatriz");
		Terceiros novoTerceiro = new Terceiros("Joao",5);
		Funcionarios colab1 = new Funcionarios("Pedro", 40, 30.5);
		Funcionarios colab0 = new Funcionarios(); //construtor vazio
		
		colab0.setNome("Xuam");
		System.out.println(colab0.getNome());
		//usando um metodo
		System.out.println("salario do colaborador: " +colab1.pagamento());
		//usando outro metodo
		System.out.println("salario do colaborador: " +colab1.pagamento(40,14.98));
		//primeiro exemplo
		System.out.println("Nome do funcionario: "+novoFun.getNome());
		System.out.println("Nome do terceirizado: "+novoTerceiro.getNome());
		
		novoFun.setHorasTrabalhadas(40);
		novoFun.setValorPorHora(10);
		
		System.out.println("O salario do funcionário é: "+ novoFun.pagamento());
		System.out.println("O salario do terceirizado é: "+ novoTerceiro.pagamento());
	}

}
