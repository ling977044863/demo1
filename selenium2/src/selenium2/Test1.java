package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static WebDriver driver;
	public void dakai() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.sina.com.cn");
		
	}

}
