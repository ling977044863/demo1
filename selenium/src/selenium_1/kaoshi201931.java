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
	    //������ҳ
	    driver.get("http://localhost:8080/examsys/login.thtml");
	    //�����˻�
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    //��������
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
	    //��λ������ͨ��testѡȡ
	    WebElement element=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
	    Select select =new Select(element);
	    select.selectByVisibleText("����Ա");
	    //ͣ��10��
	 
			Thread.sleep(5000);
		
	    //�������
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	   
	    //�жϵ���ɹ�
	    String a1=driver.getCurrentUrl();
	    System.out.println(a1);
	    if("http://localhost:8080/examsys/login.thtml".equals(a1)) {
	    	System.out.println("����ʧ�ܣ��û�������");
	    }
	    else {
	    	System.out.println("����ɹ�");
	    }
	    //���
	    driver.switchTo().frame("menu");
	    //���������
	    driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
	    //����������
	    driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[3]/a")).click();
	   //���ؿ���Ȩ
	    driver.switchTo().defaultContent();
	    //���
	    driver.switchTo().frame("main");
	    //��������
//	    WebElement element1=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[1]/td[1]/select"));
//	    select =new Select(element1);
//	    select.selectByVisibleText("��ѡ��");
//			Thread.sleep(1000);
//	        select.selectByVisibleText("�ж���");
//			Thread.sleep(1000);
//			select.selectByVisibleText("�����");
//			Thread.sleep(1000);
//			select.selectByVisibleText("�ʴ���");
//			select.selectByVisibleText("��ѡ��");
			//����������
//			WebElement element2=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[1]/select"));
//		    select =new Select(element2);
//		    Thread.sleep(1000);
//		    select.selectByIndex(1);
//		    Thread.sleep(1000);
//		    select.selectByIndex(2);
//		    Thread.sleep(1000);
//		    select.selectByIndex(3);
		    //����״̬
//		    WebElement element3=driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[3]/td[1]/select"));
//		    select =new Select(element3);
//		    Thread.sleep(1000);
//		    select.selectByIndex(1);
//		    Thread.sleep(1000);
//		    select.selectByIndex(0);
		    //�����Ѷ�
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
		    //������Դ
		    driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[2]/input")).clear();
		    driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[2]/td[2]/input")).sendKeys("selenium��ϰ");
	        //�������
		    Thread.sleep(1000);
		    //driver.findElement(By.xpath("//*[@id=\"form_question_add\"]/table/tbody/tr[4]/td")).click();
		    //driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]")).sendKeys("������ȷ���ǣ�");
		    
		    //����ѡ��
		      driver.findElement(By.xpath("//*[@id=\"tm_body\"]/div/input")).click();    
		    
	
	}

}
