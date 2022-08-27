package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_With_DDF {
	
	public static void main(String[] args) throws Throwable {
		
		// create the Object of FIS
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\Actitime.xlsx");
		
		Sheet sh = WorkbookFactory.create(FIS).getSheet("Actitime");
		
		// set the Properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// maximize the Browser
		
		driver.manage().window().maximize();
		
		// enter the Username
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		
		// enter the Password
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		
		// click on login button
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		// Verify the Text
		
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		
		String actText = driver.findElement(By.xpath("//td[@class='pagetitle']")).getText();
		
		if(actText.equals(expText)) {
			
			System.out.println("Test Case Is Pass");
		}
		
		else {
			
			System.out.println("Test case Is Fail");
		}
	}

}
