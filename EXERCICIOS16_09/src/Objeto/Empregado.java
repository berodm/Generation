package Objeto;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double salLiquido;
	
	


	public Empregado(String nome, int codigoSetor, double salarioBase, double imposto, double salLiquido) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.salLiquido = salarioBase-(salarioBase*imposto);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getSalLiquido() {
		return salLiquido;
	}

	public void setSalLiquido(double salLiquido) {
		this.salLiquido = salarioBase-(salarioBase*imposto);
	}
	
	

}