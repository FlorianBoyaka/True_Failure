import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTester {
	Calc calc;
	
	// ============================================= Subtraction
	@Test
	public void negativeSecondValueSubtraction() {
		int firstVal = 9;
		int secondVal = -5;
		int result = Calc.substract(firstVal, secondVal);
		assertTrue("Incorrect subtraction for the second negative integer", result == 14);
	}
	
	@Test
	public void positiveSecondValue() {
		int firstVal = 0;
		int secondVal = 4;
		int result = Calc.substract(firstVal, secondVal);
		assertTrue("Incorrect subtraction for a positive second integer", result == -4);
	}
	
	@Test
	public void zeroSecondValue() {
		int firstVal = 7;
		int secondVal = 0;
		int result = Calc.substract(firstVal, secondVal);
		assertTrue("Incorrect subtraction for a positive second integer", result == firstVal);
	}

	// ============================================= Multiplication
	/*
	@Test
	public void bothPosMultiplication() {
		int firstVal = 1;
		int secondVal = 3;
		int result = Calc.multiply(firstVal, secondVal);
		assertTrue("Incorrect multiplication for two positve integers", result > 0);
	}

	@Test
	public void bothNegMultiplication() {
		int firstVal = -4;
		int secondVal = -9;
		int result = Calc.multiply(firstVal, secondVal);
		assertTrue("Incorrect mulitplication for two negative integers", result > 0);
	}

	@Test
	public void onePosOneNegMultiplication() {
		int firstVal = -2;
		int secondVal = 3;
		int result = Calc.multiply(firstVal, secondVal);
		assertTrue("Incorrect multiplication of one positive and one negative integer", result < 0);
	}	
	
	@Test
	public void zeroValueMultiplication() {
		int firstVal = 0;
		int secondVal = 5;
		int result = Calc.multiply(firstVal, secondVal);
		assertTrue("Incorrect multiplication of zero and any integer", result == 0);
	}*/

	// ============================================= Division
	@Test
	public void bothPosDivision() {
		int firstVal = 1;
		int secondVal = 4;
		double result = Calc.divide(firstVal, secondVal);
		assertTrue("Incorrect division for two positve integers", result > 0);
	}
	
	@Test
	public void bothNegDivision() {
		int firstVal = -8;
		int secondVal = -4;
		double result = Calc.divide(firstVal, secondVal);
		assertTrue("Incorrect division for two negative integers", result > 0);
	}
	
	@Test
	public void onePosOneNegDivision() {
		int firstVal = 36;
		int secondVal = -4;
		double result = Calc.divide(firstVal, secondVal);
		assertTrue("Incorrect division for a positve and negative integer", result < 0);
	}	

	@Test
	public void zeroValueDivision() {
		int firstVal = 0;
		int secondVal = 8;
		double result = Calc.divide(firstVal, secondVal);
		assertTrue("Incorrect division for zero and any integer", result == 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void zeroInDenominator() {
		int firstVal = 3; 
		int secondVal = 0;
		double result = Calc.divide(firstVal, secondVal);
	}
}
