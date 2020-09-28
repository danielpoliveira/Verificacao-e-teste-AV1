package funcionario;

public class Salario {	  		
		   
		    private double adiantamento;
		    private double salario;
		    double INSS; 
	    	double IRRF;
		    
		    public Salario() {
		    	adiantamento = 600;
		    	salario = 6000;
		    	
		    	INSS = new Inss().calcularINSS(salario);
		    	IRRF = new Irrf().calcularIRRF(salario);		    	
		    }
		    
		    public double calcularDesconto(){		
		    	
		    	System.out.println(INSS);
		    	System.out.println(IRRF);
		    	return INSS + IRRF;
		    }
		    
		    public double calcularSalario(){	   	
		    	salario = salario - adiantamento - calcularDesconto();		    
		        return salario;
		    }
	    	
	    	public void setInss(){
	    		this.INSS = new Inss().calcularINSS(salario);
	    	}
	    	
	    	public void setIrrf(){
	    		this.IRRF = new Irrf().calcularIRRF(salario);
	    	}
		    
		    		   
		    public boolean validarSalario(double salario){
		        return (salario > 0);
		    }
		    public boolean validarAdiantamento(double adiantamento){
		        return (adiantamento > 0);
		    }
		    
		    public void setAdiantamento(double adiantamento){
		        this.adiantamento = adiantamento;
		    }
		    public double getAdiantamento(){
		        return adiantamento;
		    }
		    public void setSalario(double salario){
		    	
		        this.salario = salario;
		        
		        setInss();
		        setIrrf();
		    }
		    public double getSalario(){
		        return salario;
		    }
		    
		    
		    
}
		    
