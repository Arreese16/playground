package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class OperationsTest {

	private Calculator calculator;
	
	@Before
	public void createCalculatorWithTwoValues() {
		calculator = new Calculator();
		calculator.setAccumulator(new BigDecimal(20));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}
	
	
	@Test
	public void testAddExecution() {
		calculator.execute("+");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}
	
	@Test
	public void testSubtractExecution() {
		calculator.execute("-");
		assertEquals(new BigDecimal(16), calculator.getAccumulator());
	}
}
