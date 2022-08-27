package Smoke_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String expT="OrangeHRM";
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actT = driver.getTitle();
		
		if(actT.equals(expT)) {
			
			System.out.println(" chya maila test case pass ho gayi re baba...");
			
		}
		else {
			System.out.println("chya maila test case fail ho gai re baba....");
		}
		// enter the user nameol]kij nmhh 
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		// enter the password
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		// click on the button
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String expTH="OrangeHRM";
		
		String actTH = driver.getTitle();
		
		if(actTH.equals(expTH)) {
			
			System.out.println(" babu bhaiya test case pass ho gayi");
		}
		else {
			System.out.println(" babu bhaiya test case fail ho gayi");
		}
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//b[.='Performance']")).click();
//		
//		driver.findElement(By.xpath("//a[@id='menu_performance_viewMyPerformanceTrackerList']")).click();
//		
//		driver.findElement(By.xpath("//a[.='vamshi jadhav']")).click();
//		
//		driver.findElement(By.xpath("//a[.='jevin d']")).click();
//		
		
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[text()='John Smith ']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
			
	}

}
