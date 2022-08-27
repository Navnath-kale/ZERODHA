package Drag_And_Drop;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	private static final String Actions = null;

	public static void main(String[] args) throws Throwable {
		
		// set the properties 
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// open the browser
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// inspect the first element
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@class='button button-orange']"));
		
		Thread.sleep(2000);
		
		// inspect the second element
		
		WebElement ele2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		// Object of action class
		
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(ele1, ele2).perform();
	}

}
