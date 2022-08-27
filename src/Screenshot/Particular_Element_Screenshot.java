package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Element_Screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		// take screen shot of particular element by inspectin the element
		
		WebElement GTitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src = GTitle.getScreenshotAs(OutputType.FILE);
		
		// Store at the destination 
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\GoogleTitle.jpg");
		
		// source to destination 
		
		Files.copy(src, dest);
		
		
	}

}
