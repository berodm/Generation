package Entidade;
public class pessoa1 {
		//encapsulamento (tornar private para nao ser alterado com facilidade)
		private String nome;
		private char sexo;
		private int anoNasc;
		private String etnia;
		
		public pessoa1(String nome) {
		
			this.nome = nome;
		}
		//sobrecarga 

		public pessoa1(String nome, char sexo) {
			super();
			this.nome = nome;
			this.sexo = sexo;
		}

		public pessoa1(String nome, char sexo, int anoNasc) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
		}

		public pessoa1(String nome, char sexo, int anoNasc, String etnia) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
		}
//----------- GET AND SET ABAIXO
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

		public int getAnoNasc() {
			return anoNasc;
		}

		public void setAnoNasc(int anoNasc) {
			this.anoNasc = anoNasc;
		}

		public String getEtnia() {
			return etnia;
		}

		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}
		
		
		
				
}