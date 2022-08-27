package Dynamic_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bahubali___ {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// enter the name in text box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bahubali");
		
		Thread.sleep(3000);
		
		 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		 
		 for(WebElement oneoption:alloptions) {
			 String text = oneoption.getText();
			 
			 System.out.println(text);
			 
			 Thread.sleep(2000);
			 
			 if(text.contains("bahubali 2 total collection")) {
				 
				 oneoption.click();
				 
				 break;
			 }
		 }
		
			
		}
		
	}


