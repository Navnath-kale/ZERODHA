package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev_Scroll {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		// use of the robot class
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
//		Thread.sleep(2000);
//		
		r.keyRelease(KeyEvent.VK_PAGE_UP);
//		
//		Thread.sleep(3000);
//		
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		
//		Thread.sleep(2000);
//		
//		
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
	}

}
