package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangehrm1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		// inspect dropdown menu
		//WebElement dropdown = driver.findElement(By.xpath("//select[@name='searchSystemUser[userType]']"));
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='empsearch_job_title']"));
		// create object of select class
		Select s=new Select(dropdown1);
		// select by index method
		//s.selectByValue("1");
		
		// select by value method
		//s.selectByValue("2");
		
		// select by visible text
		//s.selectByVisibleText("Admin");
		
		// select pim dropdown
		//s.selectByValue("9");
		
		// select by value index
		s.deselectByValue("4");
	}

}
