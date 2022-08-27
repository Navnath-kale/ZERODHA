package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Nanded");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@data-caleng='22-Jul-2022']")).sendKeys("22-Jul-2022");
		
	}

}
