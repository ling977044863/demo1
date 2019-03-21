	package selenium_1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new FirefoxDriver();//打开火狐浏览器
           driver.get("https://www.v2ex.com/");//打开百度
           driver.findElements(By.id("kw"));//定位百度输入框
           //WebElement e=driver.findElement(By.id("kw"));//把百度输入框的名字赋给变量e
          // driver.findElement(By.name("wd"));
           //sendKeys("aaa"); 
          // e.sendKeys("selenium");//赋给变量
          // e.sendKeys("渣渣辉");
          // e.clear();
          // e.sendKeys("江西先锋乱收费");//再次输入
          // WebElement d=driver.findElement(By.id("su"));//定位“百度”按钮
         // d.click();//点击百度
          //driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("江西先锋乱收费");
          WebElement t= driver.findElement(By.linkText("程序员"));t.click();
           List<WebElement> elements =driver.findElements(By.className("page_normal"));
           String text1 =elements.get(3).getText();
           System.out.println(text1);
           elements.get(3).click();//定位多元素
          
          List<WebElement> a =driver.findElements(By.className("count_livid"));
          //a.get(1);
         String text2 =a.get(1).getText();
         System.out.println(text2);
		
          
	}

	
}