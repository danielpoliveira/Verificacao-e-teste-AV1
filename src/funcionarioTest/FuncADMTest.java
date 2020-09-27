package funcionarioTest;


import org.junit.jupiter.api.Test;

import funcionario.FuncADM;
import funcionario.Funcionario;
import funcionario.Salario;

class FuncADMTest {
	
	@Test
	public void testExibir() {
		FuncADM adm = new FuncADM();
		
		Funcionario f1 = new Funcionario();
		Salario sal = new Salario();
		
		System.out.println(adm.exibir(f1, sal));
	}

}
