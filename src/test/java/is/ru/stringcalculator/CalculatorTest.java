package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

		@Test
		public void testEmptyString() {
			assertEquals(0, Calculator.add(""));
		}

		@Test
		public void testOneNumber() {
			assertEquals(1, Calculator.add("1"));
		}

		@Test
		public void testTwoNumber() {
			assertEquals(3, Calculator.add("1,2"));
		}

		@Test
		public void testAnySingleNumber() {
			for (int i = 0; i < 10; i++) {
				assertEquals(i, Calculator.add(Integer.toString(i)));
			}

		}


}
