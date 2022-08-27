package Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAmple {
	public static void main(String[] args) throws Throwable {
		
		// Set the Properties 
		
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 // open the browser
		 
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 
		 // maximize the browser
		 
		 driver.manage().window().maximize();
		 
		 // inspect the first element and store in it ele1
		 
		 WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 Thread.sleep(2000);
		 
		 // inspect the second element
		 
		 WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 // Object of Actions Class
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(ele1, ele2).perform();
	}

}
