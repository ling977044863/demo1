package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye1210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		String url = "https://mail.163.com";
		driver.get(url);
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("dologin")).click();
		driver.close();

	}

}
