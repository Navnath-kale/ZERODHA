package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	
	public static void main(String[] args) throws Throwable {
		
		// set the property
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// enter the UserName
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		// enter the PWD
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		// click on the login button
		
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		// click on the Add button
		
		driver.findElement(By.xpath("//button[.=' Add ']")).click();
		
		// click on the first name
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Navnath");
		
		// click on middle name
		
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Bhujangrao");
		
		// enter the last name
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kale");
		
		Thread.sleep(3000);
		
		// enter the employee id
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
		
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("MotaBhai");
		
	}

}
