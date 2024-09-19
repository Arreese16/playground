package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class NewCalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void creatCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void testNewCalculatorHasAnAccumulatorOfZero() {
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
	
	@Test
	public void testSettingAccumulatorValue() {
		BigDecimal value = new BigDecimal(23);
		calculator.setAccumulator(value);
		assertEquals(value, calculator.getAccumulator());
	}
	
	

}
