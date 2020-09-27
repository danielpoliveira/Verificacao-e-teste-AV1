package funcionarioTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funcionario.Salario;

class SalarioTest {

	@Test
	public void testGetSalario() {
		Salario s1 = new Salario();
		
		s1.setSalario(1200);
		
		assertEquals(1200, s1.getSalario());
	}
	
	@Test 
	public void testGetAdiantamento() {
		Salario s1 = new Salario();
		
		s1.setAdiantamento(450);
		
		assertEquals(450, s1.getAdiantamento());
	}
	
	@Test
	public void testGetEmptySalario() {
		Salario s1 = new Salario();
		
		assertEquals(6000, s1.getSalario());
	}
	
	@Test 
	public void testGetEmptyAdiantamento() {
		Salario s1 = new Salario();
	
		
		assertEquals(600, s1.getAdiantamento());
	}
	
	
	@Test
	public void testValidarSalario() {
		Salario s1 = new Salario();
		assertTrue(s1.validarSalario(1200));
	}
	
	@Test
	public void testValidarSalarioNegativo() {
		Salario s1 = new Salario();
		assertFalse(s1.validarSalario(-1200));
	}
	
	@Test
	public void testValidarAdiantamento() {
		Salario s1 = new Salario();
		assertTrue(s1.validarAdiantamento(450));
	}
	
	@Test
	public void testValidarAdiantamentoNegativo() {
		Salario s1 = new Salario();
		assertFalse(s1.validarAdiantamento(-450));
	}
	
	@Test
	public void testCalcularSalario() {
		Salario s1 = new Salario();
		
		System.out.println(s1.calcularSalario());
	}
	
	@Test 
	public void testCalcularDesconto() {
		Salario s1 = new Salario();
		
		System.out.println(s1.calcularDesconto());
	}
	 
}
