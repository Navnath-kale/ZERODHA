package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// switch to first frame
		driver.switchTo().frame("packageListFrame");
		
		// take first element on frame
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		
		// move to main webpage from frame1
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		//take 1 st element on webpage
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		// move to webpage from frame2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		// take 1st element on webpage
		String text2 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
	}}
