package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disanzhou {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flight.qunar.com/");
		driver.findElement(By.id("js_lab_sng")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[1]/div[3]/b")).click();
		Thread.sleep(1000);
		//输入上海
		driver.findElement(By.className("js-hotcitylist")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[3]")).click();
		Thread.sleep(1000);
		//输入南昌
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[5]/dl[4]/dd/ul/li[6]/a")).click();
	    //日期+7
	    
	
	
	}

}
