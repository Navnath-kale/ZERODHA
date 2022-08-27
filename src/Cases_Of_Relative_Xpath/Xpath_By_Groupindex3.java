package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Groupindex3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		 driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		 driver.findElement(By.xpath("(//div)[13]")).click();
   	

}
}

