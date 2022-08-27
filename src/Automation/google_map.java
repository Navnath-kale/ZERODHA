package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_map {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		
		// use css selector for choice of the mobile
		driver.findElement(By.cssSelector("input[jstcache=\"13\"]")).sendKeys("pune");
		
		// click on the search button
		driver.findElement(By.cssSelector("button[aria-label=\"Search\"]")).click();
	}

}
