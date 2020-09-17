package Aplicacao;
import Entidade.Aluno;
import Entidade.Disciplina;
import Entidade.Professor;
import Entidade.pessoa1;
public class cadastro1 {
	public static void main(String[] args)
	{
		System.out.println("Sistema de Cadastro: ");
		
		pessoa1 fulano = new pessoa1("JOAO", 'M');
		pessoa1 sicrano = new pessoa1("Maria",'F', 1970);
		Aluno novoAluno = new Aluno("Carlos","turma3");
		Professor novoprofessor = new Professor("Luiza", "MODULO 3");
		
		
		
		System.out.println(fulano.getNome());
		fulano.setNome("Paulo");
		System.out.println(fulano.getNome());
		
		
		Disciplina materia = new Disciplina("Matematica");
		materia.setNomeDisciplina("Ciencias");
		
		System.out.println(novoprofessor.getNome());
		
		System.out.println(novoprofessor.getMateriaLecionada());
	}
}