package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navnath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url
		
		driver.get("https://www.google.co.in/");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// close the driver
		
		driver.close();
	}
	
	

}
