package selenium2;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


	    WebDriver driver;
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("C:\\chromedriver.exe"); 
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		driver=new RemoteWebDriver(new URL("http://192.168.71.1:5555/wd/hub"),capabilities);
        driver.get("http://www.baidu.com");
  
        
        
//		WebDriver driver;
//		ProfilesIni allProfiles =new ProfilesIni();
//        FirefoxProfile profile=allProfiles.getProfile("default");
//        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//		driver=new RemoteWebDriver(new URL("http://192.168.71.1:5555/wd/hub"),capabilities);
//		driver.get("http://www.baidu.com");
	}

}
