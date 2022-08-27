package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Open {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.monster.com/");
		
		// navigate method
		driver.navigate().to ("https://www.google.co.in/");
		Thread.sleep(3000);//it is java wait
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();// goes backward
		driver.navigate().back();//goes forward
	     driver.quit();
		
		// minimize and maximize
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.close();
		
		// set the size of browser
		
		Dimension d = new Dimension(300,600);
		Thread.sleep(3000);
		driver.manage().window().setSize(d);
		driver.close();
		
		// set the position
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		driver.close();
	
		// get current url
		String link = driver.getCurrentUrl();
		System.out.println(link);
		driver.close();
		
		// get title
		String expT = "Google";
		String actT = driver.getTitle();
		if(actT.equals(expT)) {
			System.out.println("Test case is pass ");
		}
		else {
			System.out.println("test case is fail");
			driver.close();
		}
		
		
	}
}


 