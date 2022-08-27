package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attributes9 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(2000);
		
		
	}

}
