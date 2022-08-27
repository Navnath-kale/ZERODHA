package Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// click on cancel button
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// search for the mobile under 20000
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		
		Thread.sleep(2000);
		
		// navigate to dynamic element make sure that u take class 
		
		String reviews = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		
		Thread.sleep(2000);
		
		System.out.println(reviews);
		
	String ratings = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
	
	Thread.sleep(2000);
	
	System.out.println(ratings);
	}

}
