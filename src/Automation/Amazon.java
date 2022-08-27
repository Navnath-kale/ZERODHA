package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    //use css selector(choice the mobile)
	    driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("watch under 2000");
	    //click on search button
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
