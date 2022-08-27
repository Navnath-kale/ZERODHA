package POM_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_CLASS_GURU99 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		// maximize browser
		
		driver.manage().window().maximize();
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// call the first class 
		
		GURU99 c1=new GURU99(driver);
		
		c1.enterUN();
		
		c1.enterPWD();
		
		c1.clickSUBMITBTN();
		
		
		// call the second class
		
		GURU99HOME h1=new GURU99HOME(driver);
		
		h1.verifyname();
		
		driver.close();
	}

}
