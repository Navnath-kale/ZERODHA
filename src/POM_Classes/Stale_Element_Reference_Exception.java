package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_Reference_Exception {
	
	public static void main(String[] args) {
		
		// How stale element reference exception generated
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement txtfield = driver.findElement(By.xpath("//input[@name='q']"));
		
		txtfield.sendKeys("indian movie");
		
		driver.navigate().refresh();
		
		txtfield.sendKeys("sairat");
	}

}
