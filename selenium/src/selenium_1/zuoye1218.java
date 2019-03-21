package selenium_1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class zuoye1218 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("file:///E:/%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium%20%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95/selenium_html/demo1.html");
        driver.findElement(By.id("user")).sendKeys("唐大大");//输入唐大大
        Thread.sleep(500);
        driver.findElement(By.className("baidu")).click();//点击百度
        Thread.sleep(5000);
        driver.navigate().back();;//返回上一步
	    WebElement as=driver.findElement(By.name("select"));
	    Select select=new Select(as);
	    select.selectByIndex(1);//通过索引来取，重0开始
	    Thread.sleep(1000);//停留时间
	    select.selectByValue("opel");//通过value取值
	    Thread.sleep(1000);//停留时间
	    select.selectByVisibleText("Audi");//通过text取值
	     driver.findElement(By.className("Volvo")).click();//点击第一个元素
	     Thread.sleep(1000);//停留时间
	     driver.findElement(By.className("Saab")).click();//点击第二个元素
	     Thread.sleep(1000);//停留时间
	     driver.findElement(By.className("Opel")).click();//点击第三个元素
	     Thread.sleep(1000);//停留时间
	     driver.findElement(By.className("Audi")).click();//点击第四个元素
	     //勾选多选按钮
	     driver.findElement(By.name("checkbox1")).click();//点击第一个按钮勾选
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox2")).click();
	     driver.findElement(By.name("checkbox3")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox4")).click();
	     //点击取消勾选
	     driver.findElement(By.name("checkbox1")).click();//点击第一个按钮取消勾选
	     driver.findElement(By.name("checkbox2")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox3")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox4")).click();
        
	     Boolean b1=driver.findElement(By.className("button")).isEnabled();
	     if(b1==false) {
	    	 System.out.println("submit按钮无法使用");
	     }
	     else {
	    	 System.out.println("submit按钮可以使用");
	     }
     //点击确认按钮
	    driver.findElement(By.className("alert")).click();
	    Thread.sleep(1000);
	    Alert a=driver.switchTo().alert();
	    Thread.sleep(5000);
	    a.accept();//点击确认按钮
        //上传文件
	    driver.findElement(By.id("load")).sendKeys("E:\\图片壁纸\\新建文件夹 (2)\\123.jpg");
       String se=driver.getWindowHandle();//得到该页面的句柄
       driver.findElement(By.className("open")).click();//点击链接
        Thread.sleep(5000);//等待时间
        Set<String> sw=driver.getWindowHandles();
        for(String sq:sw) {
        	if(sq.equals(se)) {
       		driver.switchTo().window(sq);//转到该句柄
       		System.out.println(sq);//输出句柄
        	}
        }
        Thread.sleep(5000);
        Actions builder=new Actions(driver);//定义一个对象
        builder.moveToElement(driver.findElement(By.className("over"))).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.className("wait")).click();
		Thread.sleep(15000);
		WebElement bn=driver.findElement(By.className("red"));//获取定位
		
		System.out.println(bn.getText());//输出该文本
	}

}
