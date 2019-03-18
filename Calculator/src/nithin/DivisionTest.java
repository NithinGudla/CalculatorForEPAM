package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void test() {
		Calculator myCalculator = new Calculator();
		double output = myCalculator.doDivision(6 , 3);
		assertEquals(2.0 , output);
	}

}
