package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MenuCard {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open the browser
		driver.get("file:///C:/Users/hp/Desktop/menu.html");
		
		// inspect dropdown menu
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Goodluck']"));
		
		// create object of select class
		Select s=new Select(dropdown);
		
		// use method of select class
		s.selectByIndex(9);// select by index method
		
		// select by value 
		s.selectByValue("g");
		
		// select by visible text
		s.selectByVisibleText("TEA");
	}

}

