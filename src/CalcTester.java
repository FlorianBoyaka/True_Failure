import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTester {

	@Test
	public void calcFail() {
		Calc c = new Calc();
		assertTrue(c.add(1, 1)==2);
	}

}
