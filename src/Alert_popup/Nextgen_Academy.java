package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nextgen_Academy {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// enter the url
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		// get the code of click button
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		// swirch from main web page to alert pop up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		
		// click on the ok button
		//alt.accept();
		
		// get text on the alert pop up
		Thread.sleep(3000);
		String text = alt.getText();
		System.out.println(text);
	
		
	}

}
