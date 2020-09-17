package Objeto;

public class Pessoa {
	//atributos
		private String nome;
		private String endereco;
		private String telefone;
		
		
	//construtores
		public Pessoa(String nome) {
			super();
			this.nome = nome;
		}
		
		
		public Pessoa(String nome, String endereco) {
			super();
			this.nome = nome;
			this.endereco = endereco;
		}


		public Pessoa(String nome, String endereco, String telefone) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
		}
		
		//get and set
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		
}
