package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_list {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NAVNATH");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KALE");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("navnathkale19@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("navnathkale19@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("9Nath@1992");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.click(day).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		// month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act1=new Actions(driver);
		
		Thread.sleep(2000);
		
		act1.click(month).perform();
		
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		
		act1.sendKeys(Keys.ENTER).perform();
		
		// year 
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Actions act2=new Actions(driver);
		
		Thread.sleep(2000);
		
		act2.click(year).perform();
		
		act2.sendKeys(Keys.ARROW_DOWN).perform();
		
		act2.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
	
	}

}
