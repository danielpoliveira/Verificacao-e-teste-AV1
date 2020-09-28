package funcionario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Funcionario func = new Funcionario();
		FuncADM ADM = new FuncADM();
		Salario sal = new Salario();		
		
		func.setNome(JOptionPane.showInputDialog("informe o nome do funcionario: \n"));
		func.setFuncao(JOptionPane.showInputDialog("informe o setor: \n"));
		func.setSetor(JOptionPane.showInputDialog("informe a funcao: \n"));
		
		String inputSalario = JOptionPane.showInputDialog("informe o salario: \n");
		
		if(inputSalario.isEmpty())
			inputSalario = "0";
			
		sal.setSalario(Double.parseDouble(inputSalario));
		
		if(!sal.validarSalario(sal.getSalario()))
		    JOptionPane.showMessageDialog(null, "Salario invalido!");
		
		String inputAdiantamento = JOptionPane.showInputDialog("informe o adiantamento recebido: \n");
		
		if(inputAdiantamento.isEmpty())
			inputAdiantamento = "0";
		
		sal.setAdiantamento(Double.parseDouble(inputAdiantamento)); 
		if(!sal.validarAdiantamento(sal.getAdiantamento()))
			JOptionPane.showMessageDialog(null, "Adiantamento invalido!");
				 
		if(func.getNome() != null)
			JOptionPane.showMessageDialog(null, ADM.exibir(func, sal));
		else
	    	JOptionPane.showMessageDialog(null, "Não tem nenhum funcionario cadastrado");
	    
	}

}
