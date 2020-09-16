package Objetos;

public class Funcionario_Objeto
{
	public String nomeFunc;
	public int idadeFunc;
	public char sexoFunc;
	public double horasTrab;
	public double soma;
	public double salHora=15.68;
	
	
	public void mostraG()
	{
		if(sexoFunc == 'M') {
			System.out.printf("\nO funcionario %s , tem %d anos.", nomeFunc, idadeFunc);
		}
		else if(sexoFunc == 'F') 
		{
			System.out.printf("\nA funcionária %s, tem %d anos. ", nomeFunc, idadeFunc);
		}
	}
	

	
	public void somaValor() {
		double soma = (horasTrab*salHora);
				System.out.printf("\nO valor a receber nesse dia é: R$ %.2f", soma);
		
	}
	}
