package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ornage_Hrm_dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open the browser
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//b[text()='Admin']")).click();
		//driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		// inspect drop down
		//WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		//WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		
		
		
		
		// create object of select class
		Select s=new Select(dropdown);
		
		// use method of select class
		//s.selectByIndex(1);// select by index method
		
		// select by value method
		//s.selectByValue("2");
		//Thread.sleep(3000);
		
		// select by visible tetx 
		//s.selectByVisibleText("ESS");
		//s.selectByIndex(1);
		//s.selectByValue("0");
		//s.selectByVisibleText("Disabled");
		s.selectByValue("5");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
