package Entidades;

public class CACHORRO extends ANIMAL {

	public CACHORRO(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	public void correr()
	{
		System.out.println("O cachorro está correndo...");
	}
	
}
