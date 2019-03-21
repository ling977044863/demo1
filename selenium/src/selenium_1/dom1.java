package selenium_1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    WebDriver driver=new FirefoxDriver();
  
   Dimension dimension=new Dimension(900,800);
   driver.manage().window().setSize(dimension);
    //System.out.println(driver.getTitle());
    //System.out.println(driver.getCurrentUrl());
   
    try {
    	name("http://www.123.com");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("你输入的网址有误！！"+e.getMessage());
		return ;
	}
}
	public static String name(String a) {
		String d="http://www.baidu.com";
		WebDriver driver=new FirefoxDriver();
		if(a.equals(d)) {
			driver.get(a);
	    	System.out.println("运行正确");
	    }
	    else {
	    	System.out.println("程序再次运行！");
	    	driver.get("http://www.baidu.com");
	    	 
	    	 System.out.println(driver.getCurrentUrl());
	    	 System.out.println(driver.getTitle());
		}
		return a;
	}
}



