package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		// typecast Screenshot Interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// use getScreenShot()
		
		WebElement ts1=driver.findElement(By.xpath("(//img[@class='landscape-image'])[6]"));
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
		// store screen shot at perticular file and create object of file
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\Amazon.jpg");
		
		Files.copy (src,dest);  
		
		
		
	}

}
