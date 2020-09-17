package Entidade;

public class Pessoa 
{
		private String nome;
		private char sexo;
		private int anoNasc;
		private String etnia;
		
			public Pessoa(String nome, char sexo, int anoNasc, String etnia) {
			this.nome = nome;
			this.setSexo(sexo);
			this.anoNasc = anoNasc;
			this.etnia = etnia;
			//isso é o construtor 
			}
			
			public Pessoa(String nome , int anoNasc) 
			{
			this.nome=nome;
			this.anoNasc= anoNasc;
			//isso também é um construtor
}

			public Pessoa(String nome, char sexo) 
			{
			this.nome=nome;
			this.setSexo(sexo);
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public char getSexo() {
				return sexo;
			}

			public void setSexo(char sexo) {
				this.sexo = sexo;
			}
			
	
			
			
}
