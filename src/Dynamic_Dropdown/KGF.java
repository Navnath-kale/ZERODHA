package Dynamic_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KGF {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// open the web browser
		
		driver.get("https://www.google.co.in/");
		
		// enter kgf in google
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
		
		// give the thread to the element
		
		Thread.sleep(3000);
		
		// inspect element
		
		 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		 
		 // use for each loop
		 
		 for(WebElement oneoption:alloptions) {
			 
			 String text = oneoption.getText();
			 
			 System.out.println(text);
			 
			 if(text.contains("kgf full form")) {
				 
				 oneoption.click();
				 
				 break;
			 
//			 if(text.contains("kgf 2 cast")) {
//				 oneoption.click();
//				 break;
			 }
		 }
		
	}
}


