import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(4, 4);
		int esperado = 8;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(4, 4);
		int esperado = 0;		
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testMultiplicacion() {
		int resultado = Calculadora.multiplicacion(4, 4);
		int esperado = 16;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testdiv() {
		float resultado = Calculadora.div(4, 4);
		float esperado = 1;	
		assertEquals(esperado,resultado);
	}

}
