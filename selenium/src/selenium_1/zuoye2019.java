package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye2019 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.taobao.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"J_SiteNavLogin\"]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"J_QRCodeLogin\"]/div[5]/a[1]")).click();;
	    driver.findElement(By.id("TPL_username_1")).sendKeys("18365408463");
	    driver.findElement(By.id("TPL_password_1")).sendKeys("18365408463");
	    WebElement a=driver.findElement(By.xpath("//*[@id=\"nc_1_n1z\"]"));
	    Thread.sleep(10000);
	    (new Actions(driver)).dragAndDropBy(a,285,0).perform();
	    Thread.sleep(5000);
	}

}
