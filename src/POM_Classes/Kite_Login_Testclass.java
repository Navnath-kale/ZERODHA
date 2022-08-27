package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Testclass {
	
	public static void main(String[] args) {
		
		// Set the Properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open the Browser
		
		driver.get("https://kite.zerodha.com/");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// implicitly wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// call the 1st POM class
		
		Kite_Login_Page1 login1=new Kite_Login_Page1(driver);
		
		login1.enterUN();
		
		login1.enterPWD();
		
		login1.clickLOGINBTN();
		
		// Call The 2nd POM Class
		
		Kite_Login_Page2 login2=new Kite_Login_Page2(driver);
		
		login2.enterPin();
		
		login2.clickCONTBUTTON();
		
		
		// Call the Home Page
		
		KiteHomePage Home=new KiteHomePage(driver);
		
		Home.verifyuserID();
		
		//driver.close();
	}

}
