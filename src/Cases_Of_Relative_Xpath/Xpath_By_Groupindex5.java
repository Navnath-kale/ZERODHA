package Cases_Of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Groupindex5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		 driver.findElement(By.xpath("(//input)[2]")).sendKeys("test1");
		 driver.findElement(By.xpath("(//input)[3]")).sendKeys("test1");
		 driver.findElement(By.xpath("(//input)[4]")).click();


}
}
