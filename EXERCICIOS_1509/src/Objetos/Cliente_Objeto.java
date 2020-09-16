package Objetos;

public class Cliente_Objeto 
{
	public String nomeCliente;
	public int idadeCliente;
	public char sexoCliente;
	public double valorProdutos[] = new double[4];
	public double soma;
	
	public double soma() {
		return soma = (valorProdutos[0] + valorProdutos[1] + valorProdutos[2] + valorProdutos[3]);
	}
	
	public void mostraG()
	{
		if(sexoCliente == 'M') {
			System.out.printf("\nO cliente %s , tem %d anos.", nomeCliente, idadeCliente);
		}
		else if(sexoCliente == 'F') 
		{
			System.out.printf("\nA cliente %s, tem %d anos. ", nomeCliente, idadeCliente);
		}
	}
	
	public void mostraSoma()
	{
		System.out.printf("\nSoma total dos 4 produtos é : R$");
	}
	
	public void somaValor() {
		double soma = soma();
				System.out.printf("\n %.2f", soma);
		
	}
	}
