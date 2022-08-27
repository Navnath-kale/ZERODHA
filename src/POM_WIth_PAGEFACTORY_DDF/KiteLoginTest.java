package POM_WIth_PAGEFACTORY_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	
	public static void main(String[] args) throws Throwable {
		
		// create the object of FIS
		
		FileInputStream FIS=new FileInputStream("E:\\Excel\\ZERODHA.xlsx");
		
		Sheet sh = WorkbookFactory.create(FIS).getSheet("ZERODHA");
		
		// set the Properties
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get the url
		
		driver.get("https://kite.zerodha.com/");
		
		// maximize the browseer
		
		driver.manage().window().maximize();
		
		// glonbal wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// call the 1st class
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		
		login1.enterUN(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		
		login1.enterPWD(password);
		
		login1.clickLOGINBTN();
		
		
		// call the 2nd class
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		
		String PINVALUE = sh.getRow(0).getCell(2).getStringCellValue();
		
		login2.enterPIN(PINVALUE);
		
		login2.clickCNTBTN();
		
		
		//  call the 3rd class
		
		KiteHomePage home=new KiteHomePage(driver);
		
		String expID = sh.getRow(0).getCell(0).getStringCellValue();
		
		home.verifyuserid(expID);
		
		driver.close();
		
		
	}
	
	
	
	
	
	

}
