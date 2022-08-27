package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		// enter the username
		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin");
		// enter the password
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		// click on the login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
