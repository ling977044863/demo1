package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye1224 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	}
		 public static String web() throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8080/Exam_ssh/");
				driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("stuNumber")).sendKeys("123456");
				WebElement b=driver.findElement(By.name("stuName"));
				b.sendKeys("ÌÆ´ó´ó");
				driver.findElement(By.name("B1")).click();
				WebElement c=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/div/span/font/strong"));
				 String txt=c.getText();
			 System.out.println(txt);
		return txt;
	}
	
}
