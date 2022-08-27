package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	
	public static void main(String[] args) throws Throwable {
		
		// Create Object of FIS class
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\ZERODHA.xlsx");
		
		Sheet sh = WorkbookFactory.create(FIS).getSheet("ZERODHA");
		
		// Set the Properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		// Global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// Enter User Name
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		// Enter Password
		
		 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		// click on login button
		
		driver.findElement(By.xpath("//button[.='Login ']")).click();
		
		// Enter the Pin
		
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
		// click on continue Button
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		// Verify User ID
		
		String expID = sh.getRow(0).getCell(3).getStringCellValue();
		
		String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		if(actID.equals(expID)) {
			
			System.out.println("Test Case Is Pass");
		}
		
		else {
			
			System.out.println("Test Case Is Fail");
		}
	}

}
