package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Homepage {
	
	// Declaration 
	
	@FindBy(xpath="//h1[.='Dashboard']")private WebElement name;
	
	
	// Initialization 
	
	public Pom_Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	
	public void verifyname() {
		
		String expname="Dashboard";
		
		String actname = name.getText();
		
		if(actname.equals(expname)) {
			
			System.out.println(" TC CASE IS PASS");
		}
		
		else {
			System.out.println(" TC IS FAIL");
		}
	}
	
	
	
	
	
}
