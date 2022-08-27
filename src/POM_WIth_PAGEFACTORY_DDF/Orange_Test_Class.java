package POM_WIth_PAGEFACTORY_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Test_Class {
	
	public static void main(String[] args) throws Throwable {
		
	// create the object of fileinputStream
	
	FileInputStream FIS=new FileInputStream("E:\\Excel\\ORANGE.xlsx");
	
	Sheet sh = WorkbookFactory.create(FIS).getSheet("ORANGE");
	
	// set the Properties
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	// get the url
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	// maximize the browser
	
	driver.manage().window().maximize();
	
	// global wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	// call the first pom class
	
	Orange_Login_page1 login1=new Orange_Login_page1(driver);
	
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	
	Thread.sleep(2000);
	
	login1.enterUN(username);
	
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	
	login1.enterPWD(password);
	
	login1.clickLOGINBTN();
	
	
	// call the 2nd POM Class
	
	Thread.sleep(2000);
	
	KiteHomePage home=new KiteHomePage(driver);
	
	String expname = sh.getRow(0).getCell(2).getStringCellValue();
	
	home.verifyuserid(expname);
	
	driver.close();
	
	
	
	

}
}
