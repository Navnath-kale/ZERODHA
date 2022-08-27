package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
         
		// go to first frame
		driver.switchTo().frame("packageListFrame");
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.concurrent']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		// go to main webpage
		driver.switchTo().defaultContent();
		
		// go to second frame
		driver.switchTo().frame("packageFrame");
	String text1 = driver.findElement(By.xpath("//a[text()='Debug']")).getText();
	System.out.println(text1);
	Thread.sleep(3000);
	
	// go to main webpage
	driver.switchTo().defaultContent();
	
	// go to third frame
	driver.switchTo().frame("classFrame");
	String text2 = driver.findElement(By.xpath("//a[text()='WebDriver.Navigation']")).getText();
	System.out.println(text2);
	Thread.sleep(3000);
	
	}

}
