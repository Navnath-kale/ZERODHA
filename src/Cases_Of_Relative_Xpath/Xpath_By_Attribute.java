package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		    
		    //Enter UN
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		    
		    //Enter PWD
		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		    // click button
		    driver.findElement(By.xpath("//div[text()='Login ']")).click();
		    
		   
		    
	}

}
