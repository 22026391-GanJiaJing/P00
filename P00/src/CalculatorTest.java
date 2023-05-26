import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * Gan Jia Jing, May 26, 2023 11:36:35 AM
 */

/**
 * @author 22026391
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 

		int expected = 9999;
		assertEquals (expected, actual);
	}
	@Test
	public final void testSubtract() {
		int a = 8765;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 

		int expected = 4444;
		assertEquals (expected, actual);
	}
	@Test
	public final void testMultiply() {
		int a = 2;
		int b = 2;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 

		int expected = 4;
		assertEquals (expected, actual);
	}
	@Test
	public final void testDivide() {
		int a = 8;
		int b = 4;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 

		int expected = 2;
		assertEquals (expected, actual);
	}













}
