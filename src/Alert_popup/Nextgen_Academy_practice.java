package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nextgen_Academy_practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();
		
		Thread.sleep(3000);
		String text = alt.getText();
		System.out.println(text);
	}

}
