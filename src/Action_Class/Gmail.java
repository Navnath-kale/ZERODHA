package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// inspect the target elememt
		
		WebElement Gmail = driver.findElement(By.xpath("//div[@class='gb_yf']"));
		
		// create the object of Actions Class
		
		Actions act=new Actions(driver);
		
		// 1 method move to element
		
		act.moveToElement(Gmail).perform();
		
		// Right click Or the Context Click()
		
		act.moveToElement(Gmail).contextClick().perform();
		
		// left click or click
		
		act.moveToElement(Gmail).click().perform();
		
		// double click
		
		act.moveToElement(Gmail).doubleClick().perform();
		
		// All method in one line
		
		act.moveToElement(Gmail).contextClick().click().doubleClick().build().perform();
	
	}

}
