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
	    //������ҳ
	    driver.get("http://localhost:8080/examsys/login.thtml");
	    //�����˻�
	    driver.findElement(By.name("username")).sendKeys("hujianming456");
	    //��������
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming1");
	    //��λ������ͨ��testѡȡ
	    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
	    Select select =new Select(element);
	    select.selectByVisibleText("����Ա");
	    //ͣ��10��
	    Thread.sleep(5000);
	    //�������
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	    driver.switchTo().alert().accept();
	    //�жϵ���ɹ�
	    String a1=driver.getCurrentUrl();
	    System.out.println(a1);
	    if("http://localhost:8080/examsys/login.thtml".equals(a1)) {
	    	System.out.println("����ʧ�ܣ��û�������");
	    }
	    else {
	    	System.out.println("����ɹ�");
	    }
	    loging();
	}
public static void loging() throws InterruptedException{
	//�����˻�
	
	driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    //��������
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).clear();
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
    //��λ������ͨ��testѡȡ
    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
    Select select =new Select(element);
    select.selectByVisibleText("����Ա");
    //ͣ��5��
    Thread.sleep(5000);
    //�������
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
    Thread.sleep(5000);
    //�жϵ���ɹ�
    String a =driver.getCurrentUrl();
    System.out.println(a);
    if("http://localhost:8080/examsys/login.thtml".equals(a)) {
    	System.out.println("����ʧ�ܣ��û�������");
    }
    else {
    	System.out.println("����ɹ�");
    }
}
}
