//Authors: Florian Boyaka and Elinam Gbordzoe

public class Calc {
	static public int add(int a, int b) {
		return a + b;
	}

	static public int substract(int a, int b) {
		//return a - b;
		return b - a;
	}

	static public int multiply(int a, int b) {
		//return a * b;
		return b - (a * b);
	}

	static public double divide(int a, int b) {
		if(b == 0)
			throw new ArithmeticException();
		return (double)a/(double)b;
	}
}