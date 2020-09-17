package Entidade;

public class Aluno extends pessoa1
{
	

		
	private String turma;
	private int notas[] = new int[2];
	
	
	public Aluno(String nome, String turma) {
		super(nome);
		this.turma = turma;
	
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
}

