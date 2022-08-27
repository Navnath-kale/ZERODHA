package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_ACTITIME_TESTCLASS {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// call the 1st Actitme page
		
		POM_ACTITIME act1=new POM_ACTITIME(driver);
		
		act1.UN();
		
		act1.PWD();
		
		act1.LoginBTN();
		
		
		// call the home page 
		
		Thread.sleep(2000);
		
		POM_ACTITIME_HOME act2=new POM_ACTITIME_HOME(driver);
		
		act2.verifyname();
		
		driver.close();
	}

}
