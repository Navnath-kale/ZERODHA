package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Groupindex11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("navnathkale19@gmail.com");
		driver.findElement(By.xpath("(//input)[10]")).sendKeys("8999370179");
		driver.findElement(By.xpath("(//input)[11]")).click();
	}

}
