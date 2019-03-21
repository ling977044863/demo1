package selenium_1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dom4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//多窗口
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//        driver.get("file:///E:/%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium%20%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95/pop.html");
//        String s=driver.getWindowHandle();
//        driver.findElement(By.id("goo")).click();
//        Thread.sleep(5000);
//		Set<String> w=driver.getWindowHandles();
//		for(String k:w)
//		{
//			System.out.println(k);
//			System.out.println(s);
//			if(!k.equals(s)) {
//				driver.switchTo().window(k);
//				System.out.println("12");
//				driver.findElement(By.id("kw")).sendKeys("江西先锋");
//				driver.findElement(By.id("su")).click();
//				break;
//			}
//			else {
//				System.out.println("123");
//				
//			}
//		}

		
//		driver.get("http://www.sina.com");
//		String s=driver.getWindowHandle();
//		Thread.sleep(50000);
//	     driver.findElement(By.xpath("/html/body/div[10]/div[1]/div[1]/ul[1]/li[1]/a")).click();;
//		 Thread.sleep(5000);
//		 Set<String> w=driver.getWindowHandles();
//		 for(String k:w) {
//			 if(k.equals(s)) {
//				 driver.switchTo().window(k);
//				driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/div[1]/h3")).click();
//				driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
//				driver.findElement(By.className("inp-txt")).sendKeys("先锋乱收费");
//				driver.findElement(By.name("SearchSubButton")).click();
//			 }
//			 else {
//				 
//				 System.out.println("程序错误");
//			 }
//		 }
		
		
		driver.get("http://www.youdao.com");
		Set<Cookie> s=driver.manage().getCookies();
		System.out.println(s);
		WebElement as=driver.findElement(By.id("type"));
		Actions a=new Actions(driver);
		a.doubleClick(as).perform();
	}

}
