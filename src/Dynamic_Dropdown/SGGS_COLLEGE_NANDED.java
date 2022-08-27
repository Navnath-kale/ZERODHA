package Dynamic_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SGGS_COLLEGE_NANDED {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("SGGSIE&T NANDED");
		Thread.sleep(3000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for(WebElement oneoption:alloptions) {
			String text = oneoption.getText();
			System.out.println(text);
			if(text.contains("sggsie&t nanded placement")) {
				oneoption.click();
				driver.findElement(By.xpath("//a[@data-hveid='CAEQBQ']")).click();
			}
			
		}
	
	}

}
