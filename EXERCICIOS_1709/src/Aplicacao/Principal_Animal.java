package Aplicacao;

import Entidades.CACHORRO;
import Entidades.CAVALO;
import Entidades.PREGUIÇA;
import Entidades.ANIMAL;

public class Principal_Animal {

	public static void main(String[] args) {
		
		CACHORRO dog = new CACHORRO("REX", 3, "aU");
		CAVALO horse = new CAVALO("AMORA", 5, "Relincha");
		PREGUIÇA preguica = new PREGUIÇA("Sid", 5, "som");
		
		//--- metodos
		
		System.out.printf("O cachorro: ");
		System.out.print(dog.getNome());
		System.out.printf(" tem %d anos. ", dog.getIdade());
		dog.correr();
		System.out.printf("O cachorro está ");
		dog.emitirsom();
		System.out.println();
		System.out.printf("O cavalo: ");
		System.out.print(horse.getNome());
		System.out.printf(" tem %d anos. ", horse.getIdade());
		horse.correr();
		System.out.printf("O cavalo ");
		horse.emitirsom();
		System.out.println();
		System.out.println();
		System.out.printf("A preguiça: ");
		System.out.print(preguica.getNome());
		System.out.printf(" tem %d anos. ", preguica.getIdade());
		System.out.println(preguica.getNome());
		preguica.correr();
		System.out.printf("A preguiça ");
		preguica.emitirsom();
	}

}
