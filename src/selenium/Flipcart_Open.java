package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Open {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
	     //open the url
	     driver.get("https://www.amazon.in/");
	   //maximize the browser
	     Thread.sleep(10000);//it is java wait
	     driver.manage().window().maximize();
	     //mionimize the browser
	     Thread.sleep(10000);
	     driver.manage().window().minimize();
	     Thread.sleep(10000);
	     driver.close();
	     
	}
	
	}
	
	


