package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Attribute10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// enter the url
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		// enter the username
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test1");
		// enter the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1");
		// click button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
