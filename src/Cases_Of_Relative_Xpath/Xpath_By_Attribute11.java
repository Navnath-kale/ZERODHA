package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// get the url
		driver.get("https://www.udemy.com/join/login-popup/");
		// enter the username
		driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("navnathkale19@gmail.com");
		// enter the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8999370179");
		// submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
	}

}
