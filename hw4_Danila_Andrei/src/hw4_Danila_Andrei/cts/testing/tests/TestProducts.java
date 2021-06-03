package hw4_Danila_Andrei.cts.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import hw4_Danila_Andrei.cts.testing.models.Product;

public class TestProducts {

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

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void TestConstrConformanceRight() {
		final float price=70f;
		final String name="TestName";
		
		Product product = new Product(name,price);
	
		assertEquals(price,product.getPrice(),0);
		assertEquals(name,product.getName());
		
		
	}
	
	@Test
	public void  TestConstr2ConformanceRight() {
		
		final float price=50f;
		final String name="TestName2";
		final ArrayList<Integer> soldItems= new ArrayList<Integer>();
		soldItems.add(1);
		
		Product product = new Product(name, price, soldItems);
		
		assertEquals(price,product.getPrice(),0);
		assertEquals(name,product.getName());
		assertEquals(soldItems,product.getWeeklySoldItems());
		
		
		
	}

}
