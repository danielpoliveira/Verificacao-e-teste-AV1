package funcionario;

public class FuncADM {
	//Funcionario func = new Funcionario();
	//Salario sal = new Salario();
	
	public String exibir(Funcionario func, Salario sal){
		
		//Código com erro
        /*return "Dados do Funcionario ADM\n"+func.exibir()+
        		"\nrecebe R$"+String.format("%.2f de salario", sal.calcularSalario() +
        		"\nDesconto total " + String.format("%.2f do salario" , sal.calcularDesconto()));
        */
        
		//Código corrigidp
		return String.format("Dados do Funcionario ADM\n"
		        			+func.exibir()
		        			+"\nrecebe R$ %.2f"
		        			+"\nDesconto total %.2f"
		        			, sal.calcularSalario(), sal.calcularDesconto()
		        			);
    }	
}
