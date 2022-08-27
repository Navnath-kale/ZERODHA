package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {
	
	public static void main(String[] args) {
		
		//set the property
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open the Application
		
		driver.get("https://kite.zerodha.com/");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// give global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Enter the user Id
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
		
		// Enter the Password
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
		
		// click on login button
		
		driver.findElement(By.xpath("//button[.='Login ']")).click();
		
		// enter the pin
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
		
		// click on the button
		
		driver.findElement(By.xpath("//button[.='Continue ']")).click();
		
		// verify user ID
		
		String expID="DPG458";
		
		String actID = driver.findElement(By.xpath("//span[.='DPG458']")).getText();
		
		if(expID.equals(actID)) {
			
			System.out.println("Both are same, Test Case is Pass");
		}
		else {
			
			System.out.println("Both are not same, Test Case is Fail");
		}
	}

}
