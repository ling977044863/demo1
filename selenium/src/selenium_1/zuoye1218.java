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
        driver.findElement(By.id("user")).sendKeys("�ƴ��");//�����ƴ��
        Thread.sleep(500);
        driver.findElement(By.className("baidu")).click();//����ٶ�
        Thread.sleep(5000);
        driver.navigate().back();;//������һ��
	    WebElement as=driver.findElement(By.name("select"));
	    Select select=new Select(as);
	    select.selectByIndex(1);//ͨ��������ȡ����0��ʼ
	    Thread.sleep(1000);//ͣ��ʱ��
	    select.selectByValue("opel");//ͨ��valueȡֵ
	    Thread.sleep(1000);//ͣ��ʱ��
	    select.selectByVisibleText("Audi");//ͨ��textȡֵ
	     driver.findElement(By.className("Volvo")).click();//�����һ��Ԫ��
	     Thread.sleep(1000);//ͣ��ʱ��
	     driver.findElement(By.className("Saab")).click();//����ڶ���Ԫ��
	     Thread.sleep(1000);//ͣ��ʱ��
	     driver.findElement(By.className("Opel")).click();//���������Ԫ��
	     Thread.sleep(1000);//ͣ��ʱ��
	     driver.findElement(By.className("Audi")).click();//������ĸ�Ԫ��
	     //��ѡ��ѡ��ť
	     driver.findElement(By.name("checkbox1")).click();//�����һ����ť��ѡ
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox2")).click();
	     driver.findElement(By.name("checkbox3")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox4")).click();
	     //���ȡ����ѡ
	     driver.findElement(By.name("checkbox1")).click();//�����һ����ťȡ����ѡ
	     driver.findElement(By.name("checkbox2")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox3")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("checkbox4")).click();
        
	     Boolean b1=driver.findElement(By.className("button")).isEnabled();
	     if(b1==false) {
	    	 System.out.println("submit��ť�޷�ʹ��");
	     }
	     else {
	    	 System.out.println("submit��ť����ʹ��");
	     }
     //���ȷ�ϰ�ť
	    driver.findElement(By.className("alert")).click();
	    Thread.sleep(1000);
	    Alert a=driver.switchTo().alert();
	    Thread.sleep(5000);
	    a.accept();//���ȷ�ϰ�ť
        //�ϴ��ļ�
	    driver.findElement(By.id("load")).sendKeys("E:\\ͼƬ��ֽ\\�½��ļ��� (2)\\123.jpg");
       String se=driver.getWindowHandle();//�õ���ҳ��ľ��
       driver.findElement(By.className("open")).click();//�������
        Thread.sleep(5000);//�ȴ�ʱ��
        Set<String> sw=driver.getWindowHandles();
        for(String sq:sw) {
        	if(sq.equals(se)) {
       		driver.switchTo().window(sq);//ת���þ��
       		System.out.println(sq);//������
        	}
        }
        Thread.sleep(5000);
        Actions builder=new Actions(driver);//����һ������
        builder.moveToElement(driver.findElement(By.className("over"))).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.className("wait")).click();
		Thread.sleep(15000);
		WebElement bn=driver.findElement(By.className("red"));//��ȡ��λ
		
		System.out.println(bn.getText());//������ı�
	}

}
