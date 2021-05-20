package ro.ase.cts.g1093.testing.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.g1093.testing.models.MathOperations;

public class TestMathOperations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNormalValues() {
		
		int a = 5;
		int b = 6;
		int expectedResult = 11;
		int actualResult = MathOperations.add(a, b);
		assertEquals("adding 5 and 6",expectedResult, actualResult);
		}
		
	}


