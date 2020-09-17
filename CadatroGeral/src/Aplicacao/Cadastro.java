package Aplicacao;
import Entidade.Disciplina;
import Entidade.Pessoa;
public class Cadastro 
{
	public static void main(String[] args) {
		
		Disciplina disciplinaTeste = new Disciplina("Portugues");
		Disciplina disciplinaTeste1 = new Disciplina("Matematica");
		
		Pessoa pessoaTeste = new Pessoa("Rebecca ", 'F', 1996, "PARDA");
		Pessoa pessoa1 = new Pessoa("Maria ", 23);
		Pessoa pessoaTeste2 = new Pessoa("Xururu", 'F');
		
		
		/*System.out.printf(pessoaTeste.nome);
		System.out.println(pessoaTeste.sexo);
		System.out.println(pessoaTeste.anoNasc);
		System.out.printf(pessoaTeste.etnia);
		
		System.out.printf("\n");
		System.out.printf(pessoa1.nome);
		
		System.out.println(pessoa1.anoNasc);
		*/
		
		System.out.println(pessoaTeste2.getNome());
		System.out.println(pessoaTeste2.getSexo());
		
		//trocando
		//pessoaTeste2.sexo = 'M' - assim elee nao funciona pq está private 
		pessoaTeste2.setSexo('M');
		pessoaTeste2.setNome("Yakuru");
		System.out.println(pessoaTeste2.getNome()); //aqui ja entra com o nome trocado
		System.out.println(pessoaTeste2.getSexo());
		//System.out.println(pessoaTeste2.nome);
		//System.out.println(pessoaTeste2.sexo);
	}
}