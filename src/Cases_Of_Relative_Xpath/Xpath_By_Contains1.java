package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
}
}
