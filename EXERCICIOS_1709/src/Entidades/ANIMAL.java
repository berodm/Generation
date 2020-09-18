package Entidades;

public class ANIMAL 
{
	private String nome;
	private int idade;
	private String som;
	//-------
	public void emitirsom()
	{
		System.out.println(" está emitindo som...");
	}
	public void correr()
	{
		System.out.println(" está correndo...");
	}
	//---------
	public ANIMAL(String nome, int idade, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	//---------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
