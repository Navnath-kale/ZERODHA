package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Screen_Shot_using_RandomString {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		// use the Random String class
		
		String random = RandomString.make();
		
		// type cast TakesScreenshot Interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// use getScreenShot()
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// store screen shot at particular destination by v=craeating onject of file
		
		File dest=new File("C:\\Users\\hp\\Desktop\\New folder\\"+random+".jpg");
		
		// transfer files source to destination
		
		Files.copy(src, dest);
	
       		
	
		
		
	}

}
