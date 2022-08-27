package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	// Declaration 
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	
	// initialization
	
	public KiteHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	
	public void verifyuserid(String expID) {
		
		String actID=userID.getText();
		
		if(actID.equals(expID)) {
			
			System.out.println(" TC IS PASS");
		}
		
		else {
			
			System.out.println(" TC IS PASS");
		}
		
		
	}
	
	

}
