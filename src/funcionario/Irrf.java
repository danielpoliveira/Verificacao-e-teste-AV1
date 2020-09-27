package funcionario;

public class Irrf {
	double irrf;
	double salariobruto;
	
	public double calcularIRRF (double salariobruto) {			 
		if (salariobruto <= 1903.98)
			irrf = salariobruto * 0;
		else if (salariobruto >= 1903.99 && salariobruto<=2826.65)
			irrf = salariobruto * 0.075;
		else if (salariobruto >= 2826.66 && salariobruto<=3751.05)
			irrf = salariobruto * 0.15;
		else if (salariobruto > 3751.06 && salariobruto<=4664.68)
			irrf = salariobruto * 0.225;
		else if (salariobruto > 4664.68)
			irrf = salariobruto * 0.275;
		  
		return irrf;
	}
	
}

