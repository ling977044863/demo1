package selenium_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junitTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("1");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("2");
	}

	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		junit jun=new junit();
		int d=jun.div(4,2);
		//assertEquals(2, d);
		assertNotEquals(6,d);
		
	}

	

}
