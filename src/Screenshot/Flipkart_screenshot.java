package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipkart_screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		// use typecast TakesScreenshot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// use getsScreenshotAs() 
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// we have to store screen shot at particular destination by creating object of file class
		
		File dest=new File("C:\\\\Users\\\\hp\\\\Desktop\\\\New folder\\\\AMAZON.jpg");
		
		// transfer file source to destination
		
		Files.copy(src, dest);
		
		
	}

}
