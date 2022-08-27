package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	// Step 1 Declaration
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	
	// Step 2 Initialization 
	
	public KiteHomePage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	// Step 3 Utilization
	
	public void verifyuserID() {
		
		String expID="DPG458";
		
		String actID = userID.getText();
		
		if(actID.equals(expID)) {
			
			System.out.println("TC IS PASS");
		}
		
		else {
			
			System.out.println("TC CASE IS FAIL");
		}
	}
	

}
