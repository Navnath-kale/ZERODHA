package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.findElement(By.xpath("//input[contains(@id,'email--1')]")).sendKeys("navnathkale19@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("8999370179");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}

}
