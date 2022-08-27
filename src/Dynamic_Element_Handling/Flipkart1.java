package Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 25000",Keys.ENTER);
		
		Thread.sleep(2000);
		
		String reviews = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		
		System.out.println(reviews);
		
		Thread.sleep(2000);
		
		String ratings = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
		
		Thread.sleep(2000);
		
		System.out.println(ratings);
		
		Thread.sleep(2000);
		
	}

}
