package Multiple_Element_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div"));
		
		Thread.sleep(2000);
		
		for(WebElement i:ele) {
			String str = i.getText();
			
			System.out.println(str);
		}
	}

}
