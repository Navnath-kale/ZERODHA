package Smoke_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// login page
		String expT="actiTIME - Login";
		driver.get("https://demo.actitime.com/login.do");
		String actT = driver.getTitle();
		if(actT.equals(expT)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
		//  enter the user name
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		// enter the password
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		// click button
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		// expect title of homepage
		String expTH="actiTIME - Enter Time-Track";
		Thread.sleep(3000);
		String actTH = driver.getTitle();
		if(actTH.equals(expTH)) {
			System.out.println("test case is pass");
			
		}
		else {
			System.out.println("test case is fail");
			
		}
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("NAVNATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		driver.findElement(By.xpath("//div[@class='collapseAllButton']")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		
//		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("NAVNATH");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("KALE");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("navnathkale19@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='components_button_label']")).click();
		
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
		
		
		
		
		
	}

}
