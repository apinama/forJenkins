package laura.krukle.homework_junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}
}
