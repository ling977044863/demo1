package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test2 extends Test1 {
          public static WebElement a;

	public  void stud(){
		// TODO Auto-generated method stub
		driver.switchTo().frame("top-search-wrap");
		  a=driver.findElement(By.id("slt_01"));
		 
		    
	}
}
