package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
		// go to the first frame
		driver.switchTo().frame("packageListFrame");
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		// return back to the main webpage from frame1
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String text1 = driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		// return back to the main webpage from frame2
		driver.switchTo().defaultContent();// enter into 3rd frame
		driver.switchTo().frame("classFrame");
		String text2 = driver.findElement(By.xpath("//a[text()='HasAuthentication']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
	}

}
