package selenium_1;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dom3 {
;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
         driver.get("file:///E:/%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium%20%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95/dialogs.html");
//         File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	try {
//		FileUtils.copyFile(file, new File("E:/图片壁纸/1.jpg"));
//	} catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
         
	//}
         List<WebElement> elements =driver.findElements(By.id("alert"));
         elements.get(0).click();
        
         Alert a=driver.switchTo().alert();//专向弹框对象
         a.accept();
         List<WebElement> b =driver.findElements(By.id("confirm"));
         elements.get(0).click();
         Alert prompt1=driver.switchTo().alert();
         prompt1.dismiss();
         List<WebElement> c =driver.findElements(By.id("prompt"));
         c.get(0).click();
         Alert promp2=driver.switchTo().alert();
         promp2.sendKeys("唐大大");
        
         promp2.accept();
         List<WebElement> se=driver.findElements(By.xpath("/html/head"));
         String e= se.get(0).getText();
         System.out.println("++"+e);
         
	}

}
