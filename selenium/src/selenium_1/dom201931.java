package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javafx.scene.control.Alert;

public class dom201931 {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		driver= new ChromeDriver();
	    //进入网页
	    driver.get("http://localhost:8080/examsys/login.thtml");
	    //输入账户
	    driver.findElement(By.name("username")).sendKeys("hujianming456");
	    //输入密码
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming1");
	    //定位下拉框，通过test选取
	    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
	    Select select =new Select(element);
	    select.selectByVisibleText("管理员");
	    //停留10秒
	    Thread.sleep(5000);
	    //点击登入
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	    driver.switchTo().alert().accept();
	    //判断登入成功
	    String a1=driver.getCurrentUrl();
	    System.out.println(a1);
	    if("http://localhost:8080/examsys/login.thtml".equals(a1)) {
	    	System.out.println("登入失败，用户不存在");
	    }
	    else {
	    	System.out.println("登入成功");
	    }
	    loging();
	}
public static void loging() throws InterruptedException{
	//输入账户
	
	driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    //输入密码
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).clear();
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
    //定位下拉框，通过test选取
    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
    Select select =new Select(element);
    select.selectByVisibleText("管理员");
    //停留5秒
    Thread.sleep(5000);
    //点击登入
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
    Thread.sleep(5000);
    //判断登入成功
    String a =driver.getCurrentUrl();
    System.out.println(a);
    if("http://localhost:8080/examsys/login.thtml".equals(a)) {
    	System.out.println("登入失败，用户不存在");
    }
    else {
    	System.out.println("登入成功");
    }
}
}
