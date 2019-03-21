package testbaidu;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	public static String url1="http://www.baidu.com";
	@BeforeClass
public void openfirefox() throws InterruptedException, MalformedURLException{
		 
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	       driver=new FirefoxDriver();
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		// driver=new RemoteWebDriver(new URL("http://192.168.221.1:4444/wd/hub"),capabilities);
	       }
	
		
	
		@Test(groups="selenium-test")
		public void Alogin() throws IOException, InterruptedException{
		driver.get(url1);
		}
}
