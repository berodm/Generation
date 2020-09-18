package Objeto;

public class Administrador extends Pessoa{
		
		private double valViagens;
		private double valEstadias;
		private double ajudaCusto = valEstadias+valViagens;
		
		public Administrador(String nome, double valViagens, double valEstadias, double ajudaCusto) {
			super(nome);
			this.valViagens = valViagens;
			this.valEstadias = valEstadias;
			this.ajudaCusto = valEstadias+valViagens;
			
		}


		public double getValViagens() {
			return valViagens;
		}

		public void setValViagens(double valViagens) {
			this.valViagens = valViagens;
		}

		public double getValEstadias() {
			return valEstadias;
		}

		public void setValEstadias(double valEstadias) {
			this.valEstadias = valEstadias;
		}

		public double getAjudaCusto() {
			return ajudaCusto;
		}

		public void setAjudaCusto(double ajudaCusto) {
			this.ajudaCusto = valEstadias+valViagens;
		}
		
		
}
