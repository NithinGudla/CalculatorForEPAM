package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		Calculator myCalculator = new Calculator();
		int output = myCalculator.performAddition(2 , 3);
		assertEquals(5 , output);
	}

}
