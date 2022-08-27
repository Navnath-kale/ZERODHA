package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_With_DDF {
	
	public static void main(String[] args) throws Throwable {
		
		// create object of FIS
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\Gmail.xlsx");
		
		 Sheet sh = WorkbookFactory.create(FIS).getSheet("Gmail");
		 
		 // set the System Property
		 
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/");
		 
		 // global wait
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 // maximize the Browser
		 
		 driver.manage().window().maximize();
		 
		 // click on the gmail text
		 
		 driver.findElement(By.xpath("//a[.='Gmail']")).click();
		 
		 // click on sign in
		 
		 driver.findElement(By.xpath("//a[.='Sign in']")).click();
		 
		 // enter the username
		 
		 String UN = sh.getRow(0).getCell(0).getStringCellValue();
		 
		 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(UN);
		 
		 // click on the next Button
		 
		 // programme is not suuport the brrowser
		 
		 driver.findElement(By.xpath("//span[.='Next']")).click();
	}

}
