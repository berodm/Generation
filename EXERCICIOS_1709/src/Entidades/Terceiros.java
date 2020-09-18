package Entidades;

public class Terceiros extends Funcionarios
{
	
	private double horasAdicionais;

	public Terceiros(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}

	public Terceiros(String nome, int hora, double valor, double valorextra) {
		
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
			
	//metodos
	public double pagamento()
	{
		return super.pagamento() + (this.horasAdicionais * super.getValorPorHora());
		
	}
}
