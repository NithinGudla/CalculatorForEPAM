package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

	@Test
	void test() {
		Calculator myCalculator = new Calculator();
		int output = myCalculator.doMultiplication(2 , 3);
		assertEquals(6 , output);
	}

}
