package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Groupindex4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("(//input)[3]")).click();
	
		
	}

}


