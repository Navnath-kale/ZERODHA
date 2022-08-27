package Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Tshirt {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// click on cancel button
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.manage().window().maximize();
		
		// search for the mobile under 20000
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		
		Thread.sleep(2000);
		
		// print mobile ratings and reviews 
		
		String text = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[1]")).getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		// print mobile specification
		
		String txt = driver.findElement(By.xpath("//li[.='1 Year Manufacturer Warranty for Phone and 6 Months Warranty for In the Box Accessories']")).getText();
		
          System.out.println(txt);
          
          Thread.sleep(2000);
          
          // print mobile name
          
          String name = driver.findElement(By.xpath("//div[.='REDMI Note 10 Pro Max (Dark Nebula, 128 GB)']")).getText();
          
          Thread.sleep(2000);
          
          System.out.println(name);
          
          Thread.sleep(2000);
          
          // print mobile price
          
          String price = driver.findElement(By.xpath("//div[.='₹17,999']")).getText();
          
          System.out.println(price);
          
          Thread.sleep(2000);
          
          // print another mobile name
          
          String another = driver.findElement(By.xpath("//div[.='IAIR Basic Feature Dual Sim Mobile Phone with 2800mAh Battery, 2.4 inch Display Screen, 0.8 mp Camera ...']")).getText();
          
          Thread.sleep(2000);
          
          System.out.println(another);
          
          Thread.sleep(2000);
          
          // add to cart
          
          driver.findElement(By.xpath("//div[.='vivo T1 44W (Starry Sky, 128 GB)']")).click();
          
          Thread.sleep(2000);
          
//          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//          
//          Thread.sleep(2000);
          
          
	}

}
