package selenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dom7 {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	public void open() {
		   System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://localhost:8080/Exam_ssh/");
	}
	public void login() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		driver.findElement(By.name("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/p[2]/input[1]")).click();
	}
		public void addstu() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[1]/div[3]/a")).click();
		driver.findElement(By.id("id")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"stuNumber\"]")).sendKeys("江西先锋");
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"realname\"]")).sendKeys("唐大大");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"className\"]")).sendKeys("cs3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"humanId\"]")).sendKeys("10086");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
}
	
}