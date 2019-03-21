package selenium_1;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye1211 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("http://www.cnblogs.com");
        Actions builder=new Actions (driver);
        builder.moveToElement(driver.findElement(By.id("cate_item_2"))).perform();
        WebElement sa=driver.findElement(By.xpath("/html/body/div/div[4]/div[8]/div/div[3]/div[2]/div[2]/ul/li/a"));
        sa.click();
        
        WebElement er=driver.findElement(By.id("zzk_q"));
        er.sendKeys("java");
     
        WebElement a=driver.findElement(By.className("search_btn"));
        a.click();
        Thread.sleep(10000);
        WebElement s=driver.findElement(By.id("CountOfResults"));
        String count=s.getText();
       if(!count.equals("0")) {
    	   System.out.println("找到相关数据有"+count+"条");
    	   WebElement sd=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/h3/a"));
           String count1=sd.getText();
           System.out.println(count1);
           driver.navigate().back();
           WebElement se=driver.findElement(By.id("editor_pick_lnk"));
           String count2=se.getText();
           System.out.println(count2);
       }
       else{
    	   System.out.println("查无结果");
    	   File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("E:/图片壁纸/1.jpg"));
  		} catch (Exception e) {
    			// TODO: handle exception
    			e.printStackTrace();
       }
       }
	}

}
