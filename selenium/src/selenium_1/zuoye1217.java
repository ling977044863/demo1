package selenium_1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye1217 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
	
		Boolean as=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).isDisplayed();
		if(as=true) {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
	   driver.findElement(By.name("userName")).sendKeys("18365408463");
	   driver.findElement(By.name("password")).sendKeys("1169289436");
	   driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
	   
	   Thread.sleep(5000);
	   
	   Set<Cookie> b=driver.manage().getCookies();
	   System.out.println(b);
	   for(Cookie w:b) {
		   
		   System.out.println("用户名"+w.getName());
		   System.out.println("密码"+w.getValue());
		   System.out.println("123");
	   }
		}
		else {
			 driver.findElement(By.xpath("//*[@id=\"s_username_top\"]")).click();
			 Thread.sleep(5000);
			 
			 Set<Cookie> b=driver.manage().getCookies();
			 System.out.println(b);
			 for(Cookie w:b) {
				   System.out.println("用户名："+w.getName());
				   System.out.println("密码："+w.getValue());
				
			System.out.println(b);
			
			 }
		}
	   
	}

}
