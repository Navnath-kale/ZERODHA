package POM_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_TestClass {
	
	public static void main(String[] args) {
		
		// set the properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open the Browser
		
		driver.get("https://www.saucedemo.com/");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// Call the first class
		
		SwagLabs sw1=new SwagLabs(driver);
		
		sw1.enterUN();
		
		sw1.enterPWD();
		
		sw1.clickLOGINBTN();
		
		
		// call the home page
		
		SwagLabs_Home sw2=new SwagLabs_Home(driver);
		
		sw2.verifyname();
		
		
		driver.close();
	}

}
