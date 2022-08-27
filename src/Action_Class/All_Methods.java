package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// inspect the target element
		
		WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail']"));
		
		// create the object of Actions Class
		
		Actions act=new Actions(driver);
		
		// 1 methods: moveToElement()
		
		act.moveToElement(gmail).perform();
		
		// Right Click OR ContextClick()
		
		//act.moveToElement(gmail).contextClick().perform(); 
		
		// left Click OR Click()
		
		//act.moveToElement(gmail).click().perform();
		
		// Double Click()
		
		//act.moveToElement(gmail).doubleClick().perform();
		
		// All the Actions in single Statement
		
		act.moveToElement(gmail).contextClick().click().doubleClick().build().perform();
		
		
	}

}
