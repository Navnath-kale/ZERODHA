package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		// maximize the browser
		driver.manage().window().maximize();
		
		// switch to first frame
		driver.switchTo().frame("packageListFrame");
		
		// take first elememt on frame
		String text = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		
		// go back to main webpage from frame 1
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		// go back to main webpage from frame2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		String text2 = driver.findElement(By.xpath("//a[text()='Capabilities']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
	}

}

