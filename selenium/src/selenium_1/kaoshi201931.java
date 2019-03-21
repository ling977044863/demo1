package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class kaoshi201931 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //进入网页
	    driver.get("http://localhost:8080/examsys/login.thtml");
	    //输入账户
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    //输入密码
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
	    //定位下拉框，通过test选取
	    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
	    Select select =new Select(element);
	    select.selectByVisibleText("管理员");
	    //停留10秒
	 
			Thread.sleep(5000);
		
	    //点击登入
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	   
	    //判断登入成功
	    String a1=driver.getCurrentUrl();
	    System.out.println(a1);
	    if("http://localhost:8080/examsys/login.thtml".equals(a1)) {
	    	System.out.println("登入失败，用户不存在");
	    }
	    else {
	    	System.out.println("登入成功");
	    }
	    //入口
	    driver.switchTo().frame("menu");
	    //点击题库管理
	    driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
	    //点击新增题库
	    driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[3]/a")).click();
	   //交回控制权
	    driver.switchTo().defaultContent();
	    //入口
	    driver.switchTo().frame("main");
	    //试题类型
//	    WebElement element1=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[1]/td[1]/select"));
//	    select =new Select(element1);
//	    select.selectByVisibleText("多选题");
//			Thread.sleep(1000);
//	        select.selectByVisibleText("判断题");
//			Thread.sleep(1000);
//			select.selectByVisibleText("填空题");
//			Thread.sleep(1000);
//			select.selectByVisibleText("问答题");
//			select.selectByVisibleText("单选题");
			//点击所属题库
//			WebElement element2=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[1]/select"));
//		    select =new Select(element2);
//		    Thread.sleep(1000);
//		    select.selectByIndex(1);
//		    Thread.sleep(1000);
//		    select.selectByIndex(2);
//		    Thread.sleep(1000);
//		    select.selectByIndex(3);
		    //试题状态
//		    WebElement element3=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[3]/td[1]/select"));
//		    select =new Select(element3);
//		    Thread.sleep(1000);
//		    select.selectByIndex(1);
//		    Thread.sleep(1000);
//		    select.selectByIndex(0);
		    //试题难度
//		    WebElement element4=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[1]/td[2]/select"));
//		    select =new Select(element4);
//		    Thread.sleep(1000);
//		    select.selectByIndex(1);
//		    Thread.sleep(1000);
//		    select.selectByIndex(2);
//		    Thread.sleep(1000);
//		    select.selectByIndex(3);
//		    Thread.sleep(1000);
//		    select.selectByIndex(4);
		    //试题来源
		    driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[2]/input")).clear();
		    driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[2]/input")).sendKeys("selenium复习");
	        //试题题干
		    Thread.sleep(1000);
		    //driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[4]/td")).click();
		    //driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]")).sendKeys("下面正确的是？");
		    
		    //增加选项
		      driver.findElement(By.xpath("//*[@id=\"tm_body\"]/div/input")).click();    
		    
	
	}

}
