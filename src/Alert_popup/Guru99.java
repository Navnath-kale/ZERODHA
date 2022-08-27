package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	
	public static void main(String[] args) throws Throwable {
		// Set the property
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		// enter the user id
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		
		// clicl on the submit button
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// switch from main webpage to pop up
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		// click on the ok button
		
		alt.accept();
		
		// click on the cancel button
		
		alt.dismiss();
		
		// get the text on the alert pop up
		
		Thread.sleep(3000);
		
		String text = alt.getText();
		
		System.out.println(text);
	}

}
