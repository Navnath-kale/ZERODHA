package Notification_PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HDFC_practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		// create object of browser setting class
		ChromeOptions c=new ChromeOptions();
		
		// call addArgument method of browser setting class
		c.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com");
	}

}
