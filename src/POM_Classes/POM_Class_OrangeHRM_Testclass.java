package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Class_OrangeHRM_Testclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// call the 1st class
		
		POM_Class_OrangeHRM HRM1=new POM_Class_OrangeHRM(driver);
		
		HRM1.enterUN();
		
		HRM1.enterPWD();
		
		HRM1.clickLOGINBTN();
		
		// call the 2nd class
		
		Pom_Homepage HRM2=new Pom_Homepage(driver);
		
		HRM2.verifyname();
		
		driver.close();
	}

}
