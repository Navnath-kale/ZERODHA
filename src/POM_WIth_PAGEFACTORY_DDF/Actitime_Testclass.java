package POM_WIth_PAGEFACTORY_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Testclass {
	
	public static void main(String[] args) throws Throwable {
		
		// Object of FIS
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\Actitime.xlsx");
		
		Sheet sh = WorkbookFactory.create(FIS).getSheet("Actitime");
		
		// set the properties
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url
		
		driver.get("https://demo.actitime.com/login.do");
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// call the first POM class
		
		Actitime_LoginPage1 login1=new Actitime_LoginPage1(driver);
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		
		login1.enterUN(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		
		login1.enterPWD(password);
		
		login1.clickLOGINBTN();
		
		// call the second POM class
		
		Actitime_HomePage home=new Actitime_HomePage(driver);
		
		String Title = sh.getRow(0).getCell(2).getStringCellValue();
		
		home.verifyTitle(Title);
		
		driver.close();
		
		
		
				
				
	}

}
