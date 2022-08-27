package Smoke_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	public static void main(String[] args) throws Throwable {
		System.setProperty ("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		String expT="Sign-on: Mercury Tours";
		
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
	String actT = driver.getTitle();
	
	if(actT.equals(expT)) {
		System.out.println(" test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
	
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test1");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test2");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	
	driver.findElement(By.xpath("//a[.='Flash Movie Demo']")).click();
	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	
	
	}

}
