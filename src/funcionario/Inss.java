package funcionario;

public class Inss {
	double inss;
	double salariobruto;
	
	public double calcularINSS (double salariobruto) {		
		if (salariobruto <= 1045.0)
			inss = salariobruto * 0.075;
		else if (salariobruto >= 1045.01 && salariobruto<=2089.60)
		    inss = salariobruto * 0.09;
		else if (salariobruto >= 2089.01 && salariobruto<=3134.40)
			inss = salariobruto * 0.12;
		else if (salariobruto > 3134.40)
		    inss = salariobruto * 0.14;
		    
		return inss;
	}	
}
