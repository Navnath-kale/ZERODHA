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

public class Particular_element_screenshot_amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		// use typecast TakesScreenshot Interface
		
		WebElement GTitle = driver.findElement(By.xpath("//img[@class='landscape-image']"));
		
		File src = GTitle.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\GoogleTitle.jpg");
		
		Files.copy(src, dest);
		
	}

}
