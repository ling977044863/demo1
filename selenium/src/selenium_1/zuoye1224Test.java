package selenium_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class zuoye1224Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWeb() throws InterruptedException {
		//fail("Not yet implemented");
		zuoye1224 jun=new zuoye1224();
		String a=jun.web();
		String b="欢迎光临在线考试系统";
		assertEquals(b,a);
	}

}
