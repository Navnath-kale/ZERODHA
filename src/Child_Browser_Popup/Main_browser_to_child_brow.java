package Child_Browser_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_browser_to_child_brow {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		// click on the cancel button
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		// search for the mobiles
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		
		// click on the search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(3000);
		
		// click on the first mobile 
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
		// by default selenium control should be on main window we have switch it from main window to child
		
		Set<String> allws = driver.getWindowHandles();
		
		for(String singlewin:allws) {
			driver.switchTo().window(singlewin);// now our selenium control goes from main win to child
		}
		
		//get the text of child for our confirmation
		
	    Thread.sleep(3000);
	    
	    String expT="realme C11 2021 (Cool Blue, 32 GB)  (2 GB RAM)";
	    
	    String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	    
	    System.out.println(actT);
	    
	    //verify the child window handle or not
	    
	    Thread.sleep(3000);
	    
	    if(actT.equals(expT)) {
	    	
	    	System.out.println("child window is handles and TC is pass");
	    }
	    else {
	    	System.out.println("Tc is fail");
		}
	}

}
