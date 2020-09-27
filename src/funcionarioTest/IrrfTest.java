package funcionarioTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funcionario.Inss;
import funcionario.Irrf;

class IrrfTest {
	
	@Test
	public void testCalcularIRRF() {
		Irrf i1 = new Irrf();
		
		assertEquals((0), i1.calcularIRRF(950));
		assertEquals((1903.99 * 0.075), i1.calcularIRRF(1903.99));
		assertEquals((2826.65* 0.075), i1.calcularIRRF(2826.65));
		assertEquals((3751.05* 0.15), i1.calcularIRRF(3751.05));
		assertEquals((4664.68* 0.225), i1.calcularIRRF(4664.68));
		assertEquals((5000 * 0.275), i1.calcularIRRF(5000));
	}

}
