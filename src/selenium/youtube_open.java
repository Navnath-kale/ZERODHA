package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_open {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(30000);
		driver.get("https://www.youtube.com/watch?v=cpT47_XQEuU&list=RDcpT47_XQEuU&start_radio=1");
		Thread.sleep(30000);
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.manage().window().minimize();
		Thread.sleep(15000);
		driver.close();
	}

}
