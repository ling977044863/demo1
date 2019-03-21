//import java.io.File;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class NewTest {
//	WebDriver driver;
//  @Test(dataProvider="user")
//  public void f(String c,String b) {
//	 
//	  System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
//	  driver=new ChromeDriver();
//	  driver.get("http://www.baidu.com");
//	  driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
//	  try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).clear();
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).clear();
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys(c);
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys(b);
//	  try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
//	  try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  boolean a=driver.findElement(By.xpath("//*[@id=\"s_username_top\"]/span")).isDisplayed();
//	 
//	  if(a) {
//		  System.out.println("登入成功");
//	  }
//	  else {
//		  File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  try {
//		FileUtils.copyFile(screenShotFile,new File("E:\\123.jpg"));
//		System.out.println("登入失败");
//	} catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
//	  }
//	  
//  }
//  
//  @AfterSuite
//  public void afterSuite() {
//  }
//  @DataProvider(name="user")
//  public Object[][] Users(){
//         return new Object[][]{
//        	 {"18365408463","11692812"},{"18365408463","1169289436"}
//
//  };
//}
//}
