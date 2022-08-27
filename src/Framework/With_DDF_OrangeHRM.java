package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF_OrangeHRM {
	
	public static void main(String[] args) throws Throwable {
		
		// Object of FIS
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\ORANGE.xlsx");
		
		Sheet sh = WorkbookFactory.create(FIS).getSheet("ORANGE");
		
		// Set the properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// maximize window
		
	   driver.manage().window().maximize();
	   
	   // enter UserName
	   
	  String UN = sh.getRow(0).getCell(0).getStringCellValue();
	  
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(UN);
	  
	  // enter Password
	  
	  String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	  
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(PWD);
	 
	 // click button
	 
	 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 
	 // Verify Text
	 
		 System.err.println("Test Case Is Fail");
	 }
	 
	 
		
		
		
	}


