	package selenium_1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new FirefoxDriver();//�򿪻�������
           driver.get("https://www.v2ex.com/");//�򿪰ٶ�
           driver.findElements(By.id("kw"));//��λ�ٶ������
           //WebElement e=driver.findElement(By.id("kw"));//�Ѱٶ����������ָ�������e
          // driver.findElement(By.name("wd"));
           //sendKeys("aaa"); 
          // e.sendKeys("selenium");//��������
          // e.sendKeys("������");
          // e.clear();
          // e.sendKeys("�����ȷ����շ�");//�ٴ�����
          // WebElement d=driver.findElement(By.id("su"));//��λ���ٶȡ���ť
         // d.click();//����ٶ�
          //driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("�����ȷ����շ�");
          WebElement t= driver.findElement(By.linkText("����Ա"));t.click();
           List<WebElement> elements =driver.findElements(By.className("page_normal"));
           String text1 =elements.get(3).getText();
           System.out.println(text1);
           elements.get(3).click();//��λ��Ԫ��
          
          List<WebElement> a =driver.findElements(By.className("count_livid"));
          //a.get(1);
         String text2 =a.get(1).getText();
         System.out.println(text2);
		
          
	}

	
}