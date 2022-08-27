package Multiple_Element_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div"));
		
		for(WebElement i:ele) {
			String str = i.getText();
			
			Thread.sleep(2000);
			
			System.out.println(str);
		}
	}

}
