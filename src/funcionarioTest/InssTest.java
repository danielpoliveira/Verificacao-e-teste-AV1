package funcionarioTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funcionario.Inss;

class InssTest {

	@Test
	public void testCalcularInss() {
		Inss i1 = new Inss();
		
		assertEquals((950 * 0.075), i1.calcularINSS(950));
		assertEquals((1045* 0.075), i1.calcularINSS(1045));
		assertEquals((2089.60* 0.09), i1.calcularINSS(2089.60));
		assertEquals((3134.40* 0.12), i1.calcularINSS(3134.40));
		assertEquals((4000* 0.14), i1.calcularINSS(4000));
	}

}
