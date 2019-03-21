package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dom5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("file:///E:/%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium%20%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95/selenium_html/dragAndDrop.html");
//		WebElement s=driver.findElement(By.id("drag"));
//		WebElement b=driver.findElement(By.xpath("/html/body/h2"));
//	    (new Actions(driver)).dragAndDrop(s,b).perform();
//	    Actions action = new Actions(driver); 
//	    action.dragAndDropBy(b,250,-5);
		//鼠标定位
	    //action.dragAndDropBy(b, 18, 8).build().perform();;
		driver.get("file:///E:/%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium%20%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95/selenium_html/%E8%A1%A8%E5%8D%95.html");
		driver.findElement(By.name("upload")).sendKeys("E:\\图片壁纸\\新建文件夹 (2)\\123.jpg");
	
	
	}
}
