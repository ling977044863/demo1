package selenium_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dom7Test {
	dom7 lo=new dom7();
	@Before
	public void setUp() throws Exception {
		lo.open();
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void testOpen() throws InterruptedException {
		//fail("Not yet implemented");
		lo.login();
		lo.addstu();
		WebElement e=lo.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[1]/div"));
	    String ws=e.getText();
	    String id="10086";
	    assertEquals(id,ws);
	}

}
	