package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Screen_Shot_using_RandomString2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		// use random string class
		String random = RandomString.make();
		
		// use typecast TakesScreenShot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// use getScreenShot()
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// store screen shot at particular destination by creating object of File
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\"+random+".jpg");
		
		// transfer file source to destination
		
		Files.copy(src, dest);
		
	}

}
