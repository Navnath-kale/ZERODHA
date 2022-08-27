package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon_Screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		// typecast takesscreenshot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// use getScreenshotsAs()
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// we have to store screenshot at particular destination create object of file class
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\AMAZON.jpg");
		
		// we have to transfer file source to destination
		
		Files.copy(src, dest);
		
		
	}

}
