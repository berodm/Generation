package Entidades;

public class Funcionarios {
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	//construtor vazio
	public Funcionarios()
	{
		
	}
	//construtores
	public Funcionarios(String nome) {
		super();
		this.nome = nome;
	}

	public Funcionarios(String nome, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Funcionarios(String nome, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	//metodos 
	
	public double pagamento() {
		return (this.horasTrabalhadas*this.valorPorHora);
	}
	public double pagamento (int horasTrabalhadas, double valorPorHora)
	{
		
		double pagamento;
		pagamento = horasTrabalhadas * valorPorHora;
		setValorPorHora(valorPorHora);
		setHorasTrabalhadas(horasTrabalhadas);
		return pagamento;
	}
			
	//get and set - encapsulamentos 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	
}
