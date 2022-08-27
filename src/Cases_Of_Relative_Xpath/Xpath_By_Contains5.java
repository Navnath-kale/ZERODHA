package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.findElement(By.xpath("//input[contains(@maxlength,'60')]")).sendKeys("test1");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("test1");
		driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
	}

}
